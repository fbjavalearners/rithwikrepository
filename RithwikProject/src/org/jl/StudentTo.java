package org.jl;

public class StudentTo {

	private int sid;
	private String sname;
	
	public StudentTo(){
		
		
	}

	public StudentTo(int sid,String sname ){
		
		this.sid=sid;
		this.sname=sname;
	}
	
	
	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	

	@Override
	public int hashCode() {
		return this.sid*7;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentTo other = (StudentTo) obj;
		if (sid != other.sid)
			return false;
		else
		return true;
	}

	@Override
	public String toString() {
		return "StudentTo [sid=" + sid + ", sname=" + sname + "]";
	}
	
	
	
	
}
