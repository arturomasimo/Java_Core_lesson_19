package lession19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		File fileName = new File("serialize.io");

		Employee empl = new Employee("Ivan Ivanovicm", 1, 1800.0);
		Methods.serialize(fileName, empl);
		System.out.println(Methods.deserealize(fileName).toString());
		System.out.println();

		ArrayList<Employee> arrEmpl = new ArrayList<Employee>();
		arrEmpl.add(new Employee("Ivan Ivanovicm", 1, 1800.0));
		arrEmpl.add(new Employee("Petro Pedrovich", 2, 2000.0));
		arrEmpl.add(new Employee("Mykola Mikolovich", 3, 2500.0));
		arrEmpl.add(new Employee("Pavlo Pavlovich", 4, 3000.0));

		File fileName2 = new File("serialize2.io");
		Methods.serialize(fileName2, arrEmpl);

		ArrayList<Employee> arrEmplDes = new ArrayList<Employee>();
		arrEmplDes = (ArrayList<Employee>) Methods.deserealize(fileName2);

		for (Employee employee : arrEmplDes) {
			System.out.println(employee.toString());
		}

		fileName.deleteOnExit();

		fileName2.deleteOnExit();
	}
}
