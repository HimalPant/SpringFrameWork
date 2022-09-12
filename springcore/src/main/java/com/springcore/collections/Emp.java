package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Emp {
	private String name;
	private List<String> phones;
	private Set<String> Addresses;
	private Map<String, String> Courses;
	private Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses, Properties props) {
		super();
		this.name = name;
		this.phones = phones;
		Addresses = addresses;
		Courses = courses;
		this.props = props;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getPhones() {
		return phones;
	}

	public void setPhones(List<String> phones) {
		this.phones = phones;
	}

	public Set<String> getAddresses() {
		return Addresses;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Emp(String name, List<String> phones, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		Addresses = addresses;
		Courses = courses;
	}

	public void setAddresses(Set<String> addresses) {
		Addresses = addresses;
	}

	public Map<String, String> getCourses() {
		return Courses;
	}

	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}

}
