package com.eum;

public enum WeekEnum {
	
	WEEK_MONDAY("Monday",1,"xingqiyi"),
	WEEK_TUESDAY("Tuesday",2,"xingqier"),
	WEEK_WENDESDAY("Wendesday",3,"xingqisan"),
	WEEK_THURSDAY("Thursday",4,"xingqisi"),
	WEEK_FRIDAY("Friday",5,"xingqiwu"),
	WEEK_SATURDAY("Saturday",6,"xingqiliu"),
	WEEK_SUNDAY("Sunday",7,"xingri");
	
 WeekEnum(String name,int code,String chName) {
	this.chName = chName;
	this.name = name;
	this.code = code;
 }
    private String name;
    private int code;
	private String chName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getChName() {
		return chName;
	}
	public void setChName(String chName) {
		this.chName = chName;
	}
	public static void main(String []args) {
		System.out.println(WeekEnum.WEEK_FRIDAY);
		System.out.print(WeekEnum.WEEK_FRIDAY.getCode());
	}
}
