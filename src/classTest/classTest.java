package classTest;

class Tests{
	private String firstName;
	private String lastName;
	private double [] testScores = new double[5];;
	char grade = '*';
	double average;
	
	public Tests(String fName, String lName, double...testScores) {
		this.firstName = fName;
		this.lastName = lName;
		this.testScores = testScores;
		
		grade = courseGrade(testScores);
		}
	     
	public double courseAverage(double...testScores) {
		double sum =0;
		double average = 0;
		for(double num: testScores)
			sum = sum + num;
			
		average = sum / testScores.length;
		
		
		
		return average;
	}
	
	   public char courseGrade(double...testScores) {
		   
		double sum = 0;
		
		for(double num: testScores)
			sum = sum + num;
			
		average = sum / testScores.length;
			
	      if (average >= 90) {
				grade = 'A';
			}
			
			else if(average >= 80) {
				grade = 'B';
			}
			
			else if(average >= 70) {  
				grade = 'C';
			}
				
			else if(average >= 60) {  
				grade = 'D';
			}
		
			else {
				grade = 'F';
			}
		
		
            return grade; 
		
	   }
	
	public String toString() {
		String str;
		
		str = String.format("%-10s %-10s", firstName, lastName);
		
		for (double score: testScores)
			str = str + String.format("%7.2f", score);
		
		
		str = str + "  " + grade + "   " + average;
		
		return str;
	}
}

public class classTest {
	
	public static void main(String[] args) {
		
		Tests student1 = new Tests("Jack", "Johnson", 85, 83, 77, 91, 76);
		Tests student2 = new Tests("Lisa", "Aniston", 80, 90, 95, 93, 48);
		Tests student3 = new Tests("Andy", "Cooper", 78, 81, 11, 90, 73);
		Tests student4 = new Tests("Ravi", "Gupta", 92, 83, 30, 69, 87);
		Tests student5 = new Tests("Bonny", "Blair", 23, 45, 96, 38, 59);
		Tests student6 = new Tests("Danny", "Clark", 60, 85, 45, 39, 67);
		Tests student7 = new Tests("Samantha", "Kennedy", 77, 31, 52, 74, 83);
		Tests student8 = new Tests("Robbin", "Bronson", 93, 94, 89, 77, 97);
		Tests student9 = new Tests("Shiela", "Sunny", 79, 85, 28, 93, 82);
		Tests student10 = new Tests("Kiran", "Smith", 85, 72, 49, 75, 63);
		
		System.out.println("First_Name" + " " +"LastName" + "    "+ "Test1"+ "  "+ "Test2"+ " " + "Test3"+ "  "+"Test4"+"  "+ "Test5"+"  "+ "Grade" +" "+"Average");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);
		System.out.println(student4);
		System.out.println(student5);
		System.out.println(student6);
		System.out.println(student7);
		System.out.println(student8);
		System.out.println(student9);
		System.out.println(student10);
	}

}
