public class Student{

	String name;
	String studentId;
	int completedCredits;

	void addCredits(int credits){
	 completedCredits += credits;

}
	int remainingCredits(int degreeCredits) {
	 int remaining = completedCredits - degreeCredits;
	 return remaining;	
}	
	String summary(){
	 return "ID: " + studentId + "  Name: " + name + "  Credits: " + completedCredits;
}

}