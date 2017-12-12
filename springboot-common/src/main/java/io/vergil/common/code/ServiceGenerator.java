package io.vergil.common.code;

import static io.vergil.common.util.StringUtil.lineToHump;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.ObjectUtils;
import org.apache.velocity.VelocityContext;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import io.vergil.common.util.JdbcUtil;
import io.vergil.common.util.StringUtil;
import io.vergil.common.util.VelocityUtil;

public class ServiceGenerator {
	// generatorConfig模板路径
	private static String generatorConfig_vm = "/template/generatorConfig.vm";
	// Service模板路径
	private static String service_vm = "/template/Service.vm";
	// ServiceMock模板路径
	private static String serviceMock_vm = "/template/ServiceMock.vm";
	// ServiceImpl模板路径
	private static String serviceImpl_vm = "/template/ServiceImpl.vm";

	public static void main(String[] args) throws Exception {
		generator("com.mysql.jdbc.Driver",
				"jdbc:mysql://47.93.205.112:3306/report?useUnicode=true&characterEncoding=UTF-8", "root",
				"Zw2051300663211138.");
	}

	public static void generator(String jdbcDriver, String jdbcUrl, String jdbcUsername, String jdbcPassword)
			throws Exception {

		String os = System.getProperty("os.name");
		if (os.toLowerCase().startsWith("win")) {
			service_vm = MybatisGenerator.class.getResource(service_vm).getPath().replaceFirst("/", "");
			serviceMock_vm = MybatisGenerator.class.getResource(serviceMock_vm).getPath().replaceFirst("/", "");
			serviceImpl_vm = MybatisGenerator.class.getResource(serviceImpl_vm).getPath().replaceFirst("/", "");
		} else {
			service_vm = MybatisGenerator.class.getResource(service_vm).getPath();
			serviceMock_vm = MybatisGenerator.class.getResource(serviceMock_vm).getPath();
			serviceImpl_vm = MybatisGenerator.class.getResource(serviceImpl_vm).getPath();
		}

		String basePath = ServiceGenerator.class.getResource("/").getPath().replace("/target/classes/", "")
				.concat("/src/main/java/");
		String database = "report";
		String tablePrefix = "";
		// String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE
		// table_schema = '" + database
		// + "' AND table_name LIKE '" + tablePrefix + "_%';";
		String sql = "SELECT table_name FROM INFORMATION_SCHEMA.TABLES WHERE table_schema = '" + database + "'";

		List<Map<String, Object>> tables = new ArrayList<Map<String, Object>>();
		try {
			Map<String, Object> table;
			// 查询定制前缀项目的所有表
			JdbcUtil jdbcUtil = new JdbcUtil(jdbcDriver, jdbcUrl, jdbcUsername, jdbcPassword);
			List<Map> result = jdbcUtil.selectByParams(sql, null);
			for (Map map : result) {
				System.out.println(map.get("TABLE_NAME"));
				table = new HashMap<>(2);
				table.put("table_name", map.get("TABLE_NAME"));
				table.put("model_name", lineToHump(ObjectUtils.toString(map.get("TABLE_NAME"))));
				tables.add(table);
			}
			jdbcUtil.release();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String module = "io/vergil/service";
		String packageName = "io.vergil";

		System.out.println("========== 开始生成Service ==========");
		String ctime = new SimpleDateFormat("yyyy/M/d").format(new Date());
		String servicePath = basePath + "/" + module + "";
		String serviceImplPath = basePath + "/" + module + "/impl";
		FileUtils.forceMkdir(new File(servicePath));
		FileUtils.forceMkdir(new File(serviceImplPath));
		for (int i = 0; i < tables.size(); i++) {
			String model = StringUtil.lineToHump(ObjectUtils.toString(tables.get(i).get("table_name")));
			String service = servicePath + "/" + model + "Service.java";
			String serviceMock = servicePath + "/" + model + "ServiceMock.java";
			String serviceImpl = serviceImplPath + "/" + model + "ServiceImpl.java";
			// 生成service
			File serviceFile = new File(service);
			if (!serviceFile.exists()) {
				VelocityContext context = new VelocityContext();
				context.put("package_name", packageName);
				context.put("model", model);
				context.put("ctime", ctime);
				VelocityUtil.generate(service_vm, service, context);
				System.out.println(service);
			}
			// 生成serviceMock
			File serviceMockFile = new File(serviceMock);
			if (!serviceMockFile.exists()) {
				VelocityContext context = new VelocityContext();
				context.put("package_name", packageName);
				context.put("model", model);
				context.put("ctime", ctime);
				VelocityUtil.generate(serviceMock_vm, serviceMock, context);
				System.out.println(serviceMock);
			}
			// 生成serviceImpl
			File serviceImplFile = new File(serviceImpl);
			if (!serviceImplFile.exists()) {
				VelocityContext context = new VelocityContext();
				context.put("package_name", packageName);
				context.put("model", model);
				context.put("mapper", StringUtil.toLowerCaseFirstOne(model));
				context.put("ctime", ctime);
				VelocityUtil.generate(serviceImpl_vm, serviceImpl, context);
				System.out.println(serviceImpl);
			}
		}
		System.out.println("========== 结束生成Service ==========");
	}

}
