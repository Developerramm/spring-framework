package com.app.beans;

import java.util.Date;
import java.util.Map;

public class CollegeInfo {
	
	private Map<String, String>hod;
	
	private Map<String, Date> holidays;

	public Map<String, String> getHod() {
		return hod;
	}

	public void setHod(Map<String, String> hod) {
		this.hod = hod;
	}

	public Map<String, Date> getHolidays() {
		return holidays;
	}

	public void setHolidays(Map<String, Date> holidays) {
		this.holidays = holidays;
	}

	@Override
	public String toString() {
		return "CollegeInfo [hod=" + hod + ", holidays=" + holidays + "]";
	}
	
	

}
