package io.vergil.common.base;

public class Result extends BaseResult {
	public Result(int code, String message, Object data) {
		super(code, message, data);
	}

	public static Result ok(String message, Object data) {
		return new Result(200, message, data);
	}

	public static Result ok(Object data) {
		return new Result(200, "", data);
	}

	public static Result error(String message, Object data) {
		return new Result(400, message, data);
	}

	public static Result error(Object data) {
		return new Result(400, "", data);
	}

	public static Result error(String message) {
		return new Result(400, message, "");
	}
}
