package com.launcher.com.MongoDBLauncher1.customerDTO;


public class CustomerDto {

	
	private Integer custNo;
	
	private String name;
	
	private String city;

	
	public CustomerDto( Integer custNo, String name, String city) {
		super();
		this.custNo = custNo;
		this.name = name;
		this.city = city;
	}



	public Integer getCustNo() {
		return custNo;
	}

	public void setCustNo(Integer custNo) {
		this.custNo = custNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", name=" + name + ", city=" + city + "]";
	}


}
