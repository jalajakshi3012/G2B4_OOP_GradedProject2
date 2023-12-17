package com.gl.departments;

public class SuperDepartment implements IDepartment{

	@Override
	public String departmentName() {
		return "Super Department";
	}

	@Override
	public String getTodaysWork() {
		return "No Work as of now";
	}

	@Override
	public String getWorkDeadline() {
		return "Nil";
	}
	
	public String isTodayAHoliday() {
		return "Today is not a Holiday";
	}	
	

}
