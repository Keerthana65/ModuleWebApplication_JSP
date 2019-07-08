package com.keerthi.defect.application.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Module {

	@Id
	private int moduleid;
	private String modulename;
	
	public int getModuleid() {
		return moduleid;
	}
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}
	public String getModulename() {
		return modulename;
	}
	public void setModulename(String modulename) {
		this.modulename = modulename;
	}
	
	@Override
	public String toString() {
		return "Module [moduleid=" + moduleid + ", modulename=" + modulename + "]";
	}
	
	
}
