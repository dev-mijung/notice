package dev.mvc.member;

public class MemberVO {
//	  memberno      NUMBER(6) NOT NULL, 
//	  id            VARCHAR(20)   NOT NULL UNIQUE, 
//	  passwd        VARCHAR(60)   NOT NULL, 
//	  mname         VARCHAR(20)   NOT NULL,  
	
	private int memberno;
	private String id;
	private String passwd;
	private String mname;
	
	public int getMemberno() {
		return memberno;
	}
	public void setMemberno(int memberno) {
		this.memberno = memberno;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	
}
