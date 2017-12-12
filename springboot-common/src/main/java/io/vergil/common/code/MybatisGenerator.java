package io.vergil.common.code;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class MybatisGenerator {

	public static void generate() throws Exception {
		String generatorConfigXml = MybatisGenerator.class.getResource("/").getPath().replace("/target/classes/", "")
				+ "/src/main/resources/generatorConfig.xml";
		generate(generatorConfigXml);
	}

	public static void generate(String configxml) throws Exception {
		String generatorConfigXml = configxml;
		System.out.println("========== 开始运行MybatisGenerator ==========");
		List<String> warnings = new ArrayList<>();
		File configFile = new File(generatorConfigXml);
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(true);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
		myBatisGenerator.generate(null);
		for (String warning : warnings) {
			System.out.println(warning);
		}
		System.out.println("========== 结束运行MybatisGenerator ==========");
	}

	public static void main(String[] args) throws Exception {

	}
}
