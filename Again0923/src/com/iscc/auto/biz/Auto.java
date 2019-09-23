package com.iscc.auto.biz;

public class Auto {
	private String autotype;
	private String ano;
	private boolean isselled;

	public Boolean getIsselled() {
		return isselled;
	}

	public void setIsselled(boolean isselled) {
		this.isselled = isselled;
	}

	public Auto(String autotype, String ano) {
		this.autotype = autotype;
		this.ano = ano;
		this.isselled = false;
	}

	public String getAutotype() {
		return autotype;
	}

	/*
	 * public void setAutotype(String autotype) { this.autotype = autotype; }
	 */

	public String getAno() {
		return ano;
	}

	/*
	 * public void setAno(String ano) { this.ano = ano; }
	 */
}
