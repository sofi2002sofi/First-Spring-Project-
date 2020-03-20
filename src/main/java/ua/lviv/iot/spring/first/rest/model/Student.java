package ua.lviv.iot.spring.first.rest.model;

public class Student {

	private String name;
	
	private String lastName;
	
	private Integer id;

	public Student() {
		
	}
	
	public Student(String name, String lastName) {
		this.setName(name);
		this.lastName = lastName;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
}
