package ust.sonarqubetest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;
import java.util.logging.Logger;

public class Increment {

	public static void main(String[] args) {

		Employee e1 = new Employee("Abu", 45, 2, 10000);
		Employee e2 = new Employee("kodi", 58, 4, 60000);
		Employee e3 = new Employee("Abu", 46, 7, 100000);

		List<Employee> l1 = Arrays.asList(e1, e2, e3);
		for (Employee k : l1) {
			if ((k.getYear()) > 1 && (k.getYear() < 3)) {
				k.setSalary(k.getSalary() + (k.getSalary() * 0.025));
			} else if ((k.getYear() < 6) && (k.getYear() > 3)) {
				k.setSalary(k.getSalary() + (k.getSalary() * 0.05));
			} else if ((k.getYear() > 6) && (k.getYear() < 10)) {
				k.setSalary(k.getSalary() + (k.getSalary() * 0.1));
			} else if (k.getYear() > 10) {
				k.setSalary(k.getSalary() + (k.getSalary() * 0.12));
			}
			PrintStream myout = new PrintStream(new FileOutputStream(FileDescriptor.out));
			for (Employee e : l1) {

				myout.print(e);

			}
			myout.close();
		}

	}

}
