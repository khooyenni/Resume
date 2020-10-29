import java.util.*;
public class Resume {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        printName();
		printAge();
		printGender();
		printBirthday();
		printMarital();
		printCitizenship();
		printHome();
		printHP();
		printGrade();
		printCGPA();
		printTotalCGPA();
		printWork();
		printLanguage();
		printAwards();
		printSkills();
		
		in.close();
		
	}
	
	 public static void printName() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your name:");
		 String name = in.next();
		 System.out.println("Name : " + name);
		 
	 }
	 
	 public static void printAge() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your age:");
		 int age = in.nextInt();
		 System.out.println("Age : " + age);
		 
	 }
	 
	 public static void printGender() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your gender:");
		 String str = in.next();
		 char gender = str.charAt(0);
		 System.out.println("Gender : " + gender);
		 
	 }
	 
	 public static void printBirthday() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your birthday:");
		 String birthday = in.next();
		 System.out.println("Birthday : " + birthday);
		 
	 }
	 
	 public static void printMarital() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your marital:");
		 String marital = in.next();
		 System.out.println("Marital : " + marital);
		 
	 }
	 
	 public static void printCitizenship() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your citizenship:");
		 String citizenship = in.next();
		 System.out.println("Citizenship : " + citizenship);
		 
	 }
	 
	 public static void printHome() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your Home Address:");
		 String home = in.next();
		 System.out.println("Home Address : " + home);
		 
	 }
	 
	 public static void printHP() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your HP:");
		 String hp = in.next();
		 System.out.println("HP : " + hp);
		 
	 }
	 
	 public static void printGrade() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your Grade STIA1113");
		 String str = in.next();
		 char grade = str.charAt(0);
		 System.out.println("Grade : " + grade);	
		 
	 }
	 
	 public static void printCGPA() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your CGPA");
		 double cgpa = in.nextDouble();
		 System.out.println("CGPA : " + cgpa);
		 
	 }
	 
	 public static void printTotalCGPA() {
		 Scanner in = new Scanner(System.in);
		 
	     System.out.print("Enter CGPA Semester 1");
		 double num1 = in.nextDouble();
		 System.out.print("Enter CGPA Semester 2");
		 double num2 = in.nextDouble();
		 double sum = num1+num2;
		 double totalgpa = sum/2;
		 System.out.println("CGPA for current semester is : " + totalgpa);	 
		 
	 }
	 
	 public static void printWork() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your Working Experience:");
		 String work = in.next();
		 System.out.println("Working Experience : " + work);	
		 
	 }
	 
	 public static void printLanguage() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter language 1 :");
		 String language1 = in.next();
		 System.out.print("Enter language 2 :");
		 String language2 = in.next();
		 System.out.print("Enter language 3 :");
		 String language3 = in.next();
		 System.out.print("Enter language 4 :");
		 String language4 = in.next();
		 System.out.println("Language : 1. " + language1 + "\n\t   2. " + language2 + "\n\t   3. " + language3 + "\n\t   4. " + language4);	
		 
	 }
	 
	 public static void printAwards() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your Awards:");
		 String awards = in.next();
		 System.out.println("Awards : " + awards);	
		 
	 }
	 
	 public static void printSkills() {
		 Scanner in = new Scanner(System.in);
		 
		 System.out.print("Enter your Skills:");
		 String skills = in.next();
		 System.out.println("Professional Skills : " + skills);	 
		 
	}

}
