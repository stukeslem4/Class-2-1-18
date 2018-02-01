import java.util.Scanner;
public class Human {


	public Human(String first1, String middle1, String last1, String job1, int age1) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner h=new Scanner(System.in);		
System.out.println("What is your first name?");		
String first1=h.nextLine();		
		
System.out.println("What is your middle initial?");		
String middle1=h.nextLine();	

System.out.println("What is your last name?");		
String last1=h.nextLine();	

System.out.println("What is your Career?");		
String job1=h.nextLine();	

System.out.println("How old are you?");		
int age1=h.nextInt();		

HumanT j = new HumanT(first1, middle1, last1, job1, age1);

System.out.println(j.firstname); 			
System.out.println(j.middleinitial);	
System.out.println(j.lastname);			
System.out.println(j.Career);	
System.out.println(j.yearsold);
		
		
		
	}

}
	
	
	
	

