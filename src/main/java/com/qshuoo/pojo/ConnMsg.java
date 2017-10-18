package com.qshuoo.pojo;

public class ConnMsg {
	
	private String driver;
	private String url;
	private String user;
	private String pwd;
	
	public ConnMsg() {
		super();
	}

	public ConnMsg(String driver, String url, String user, String pwd) {
		super();
		this.driver = driver;
		this.url = url;
		this.user = user;
		this.pwd = pwd;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getuser() {
		return user;
	}

	public void setuser(String user) {
		this.user = user;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "ConnMsg [driver=" + driver + ", url=" + url + ", user=" + user + ", pwd=" + pwd + "]";
	}
	
	
	

}
