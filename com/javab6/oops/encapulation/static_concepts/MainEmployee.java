package com.javab6.oops.encapulation.static_concepts;

public class MainEmployee {
	public static void main(String[] args) {
		Employee employee = new Employee("SURYA", 2342);
		
		employee.showMyCompanyName();
		Employee.showMyCompanyName();//CORREECT WAY
		
//		USE OF STATIC
		
		//IF ypou want to have a shared variable among all the objects of the same class
		//Resource Optimizaton
		
	}
}

