package com.iscc.auto.biz;

public enum AutoType {
	BEICHI("111", "beichi"), KAIYUE("222", "kaiyue");
	
	private String code;
	private String autoName;
	private AutoType(String code, String autoName) {
		this.code = code;
		this.autoName = autoName;
	}
	
	
	public static String getAutoName(String code) throws Exception
	{
		for (AutoType temp : AutoType.values()) {
			if (temp.code.equalsIgnoreCase(code)) {
				return temp.autoName;
			}
		}
		throw new Exception("not found");
	}
	

}
