class task2demo {
    public static void main(String[] args) {
        
	Student s1 = new Student();
        s1.studentId = "SP26-BAI-005";
        s1.name = "Ahmad Talal";
        s1.completedCredits = 30;

        Student s2 = new Student();
        s2.studentId = "SP26-BAI-003";
        s2.name = "Ali Ishtiaq";
        s2.completedCredits = 45;

      
        s1.addCredits(5);
        int s2Remaining = s2.remainingCredits(130);

        System.out.println(s1.summary());
        System.out.println(s2.summary());
        System.out.println("Remaining credits for " + s2.name + ": " + s2Remaining);
    }
}