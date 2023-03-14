package USTBatchNo3.Sonarqubetest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class increment {

	public static void main(String[] args) {
		System.out.println("experience");
		Scanner sc= new Scanner(System.in);
		int yearnum=sc.nextInt();
		
		employee e1=new employee("Abu",45,2,10000);
		employee e2=new employee("kodi",58,4,60000);
		employee e3=new employee("Abu",46,7,100000);
		
		List<employee>l1=Arrays.asList(e1,e2,e3);
		System.out.println(l1);
		List<employee>l2=(List<employee>) l1.stream().peek(k->{
			if((k.getYear())>1&& (k.getYear()<3)) {
				k.setSalary(k.getSalary()+(k.getSalary()*0.025));

			}
			else if ((k.getYear()<6)&&(k.getYear()>3)) {
				k.setSalary(k.getSalary()+(k.getSalary()*0.05));
			}
			else if ((k.getYear()>6)&&(k.getYear()<10)) {
				k.setSalary(k.getSalary()+(k.getSalary()*0.1));
			}
			else if (k.getYear()>10) {
				k.setSalary(k.getSalary()+(k.getSalary()*0.12));
			}
			
		}).toList();
		System.out.println(l2);
				
		
	}

}
