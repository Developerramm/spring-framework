package com.app.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

// target spring bean class
@Component("holiday")
public class Holidays {
	
	@Autowired
	@Qualifier("holidayDate")
	private Date date;
	
	public void checkHoliday() {
		if(date.getMonth() == 8) {
			if(date.getDate() == 6) {
				System.out.println("Today is holidays");
			}else {
				System.out.println("No leave day today ");
			}
		}
	}

}
