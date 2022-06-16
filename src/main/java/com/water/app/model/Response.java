package com.water.app.model;

public class Response<T> {

	private int code;
	private String message;
	private T data;

	public Response() {
		super();
	}

	public Response(int code, String message, T data) {
		super();
		this.code = code;
		this.message = message;
		this.data = data;
	}
	
	public static <U> Response<U> getSuccess(U data) {
		return new Response<U>(200, "success", data);
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
