import java.util.GregorianCalendar;
import java.util.Scanner;
import java.text.*;

class CollegeGraduate extends Person {
	
	private double gpa;
	private int yearGraduated;

	public CollegeGraduate () {
		super ();
		gpa = 0.0;
		yearGraduated = 0;
	}
	
	public double getGPA () {
		return gpa ;
	}
	
	public int getYearOfGraduation () {
		return yearGraduated;
	}
	
	public void inputFields () {
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Enter name: ");
		setName (sc.nextLine ());
		
		System.out.print ("Enter dob (yyyy/mm/dd): ");
		GregorianCalendar db = new GregorianCalendar (sc.nextInt(), sc.nextInt() - 1, sc.nextInt());
		setDOB (db);
		
		System.out.print ("Enter gpa: ");
		gpa = sc.nextDouble ();
		
		System.out.print ("Enter year of graduation: ");
		yearGraduated = sc.nextInt();
	}
	
	public void display () {
		super.display ();
		System.out.println ("GPA: " + gpa + "\nYear of Graduation: " + yearGraduated);
	}
}


class Person {

	private String name;
	private GregorianCalendar dateOfBirth;

	public Person () {
		name = "";
		dateOfBirth = new GregorianCalendar ();
	}
	
	public void setName (String n) {
		name = n;
	}
	
	public void setDOB (GregorianCalendar dob) {
		dateOfBirth = dob;
	}

	public String getName () {
		return name;
	}

	public GregorianCalendar getDOB ()  {
		return dateOfBirth;
	}
	
	public void inputFields () {
		Scanner sc = new Scanner (System.in);
		
		System.out.print ("Enter name: ");
		name = sc.nextLine ();
		
		System.out.print ("Enter dob (yyyy/mm/dd): ");
		dateOfBirth = new GregorianCalendar (sc.nextInt(), sc.nextInt() - 1, sc.nextInt());
	}
	
	public void display () {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy");
		System.out.println ("\n\nName: " + name + "\nDOB: " + dateFormat.format(dateOfBirth.getTime()));
	}
	
}

public class PersonTest {
	
	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);
		
		char choice;
		
		System.out.print ("1. Person\n2. College Graduate : Person\nQ. Quit.\nChoice: ");
		choice = sc.next().charAt(0);
		
		if (choice == '1') {
			Person person = new Person ();
			person.inputFields ();
			person.display ();
		}
		
		else if (choice == '2') {
			CollegeGraduate cg = new CollegeGraduate ();
			cg.inputFields ();
			cg.display ();
		}
		
		else {
			System.exit (0);
		}

	}
}


