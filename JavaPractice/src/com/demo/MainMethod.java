/**
 * 
 */
package com.demo;

import java.util.Arrays;

import com.demo.inter.Animals;
import com.demo.pets.Dog;
import com.demo.pojo.Employee;

/**
 * @author manu
 *
 */
public class MainMethod {

	/**
	 * @param args
	 */
	
	static int count =1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animals animals = new Dog("Lovely",4,"Baww...");
		System.out.println(((Dog)animals).getLegs());
		fibinocci(6);
		Employee[] employees = new Employee[5];
		employees[0]= new Employee("Manu",25,2000,"Managing Director");
		employees[1]= new Employee("sai",23,1300,"Head of Operations");
		employees[2]= new Employee("pinky",27,8000,"Head of Testing");
		employees[3]= new Employee("sinju",28,6000,"Head of Research and Development");
		employees[4]= new Employee("Gavi",30,10000,"Chief Executive Officer");
		Arrays.sort(employees, Employee.employeeNameComparator);
		
		System.out.println(Arrays.toString(employees));

	}
	
	public static void fibinocci(int to)
	{
		if(to==1)
		{
			System.out.println(count);
			return;
		}
		count*=to;
		
		fibinocci(to-1);
	}

}
