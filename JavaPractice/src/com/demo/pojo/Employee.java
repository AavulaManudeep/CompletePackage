/**
 * 
 */
package com.demo.pojo;

import java.util.Comparator;

/**
 * @author manu
 *
 */
public class Employee implements Comparable<Employee>{

	/**
	 * 
	 */
	private String name;
	private int age;
	private int salary;
	private String digignation;
	/**
	 * @param name
	 * @param age
	 * @param salary
	 * @param digignation
	 */
	public Employee(String name, int age, int salary, String digignation) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.digignation = digignation;
	}

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * @return the digignation
	 */
	public String getDigignation() {
		return digignation;
	}

	/**
	 * @param digignation the digignation to set
	 */
	public void setDigignation(String digignation) {
		this.digignation = digignation;
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.salary-o.salary;
	}
	
	public static Comparator<Employee> employeeAgeComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.age-o2.age;
		}
	}; 
	
	public static Comparator<Employee> employeeNameComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.name.compareTo(o2.name);
		}
	}; 
	
	public static Comparator<Employee> employeeDigignationComparator = new Comparator<Employee>() {

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			return o1.digignation.compareTo(o2.digignation);
		}
	};
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + ", digignation=" + digignation + "]";
	} 

}
