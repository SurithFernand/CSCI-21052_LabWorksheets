public class UniversityManagementSystem {
    public static void main(String[] args) {
        Department departmentSE = new Department("Software Engineering");
        //Department departmentAC = new Department("Applied Computing");

        Degree CS = new Degree("Computer Science",67 );
        //Degree ET = new Degree("Engineering Technology",97 );

        Course OOP = new Course("Object-Oriented Programming", "Core", 73);
        //Course SP = new Course("Structured Programming", "Core", 140);

        Lecturer drSmith = new Lecturer("Dr.Smith", "Professor");

        Student john = new Student("John Doe","CS/2021/090", "First Year");

        //Add information
        departmentSE.offerCourse(OOP);
        CS.offerCourse(OOP);
        drSmith.addCourse(OOP);
        john.enrollCourse(OOP);

        //Display information
        drSmith.displayInfo();
        System.out.println();

        john.displayInfo();
        System.out.println();

        departmentSE.displayInfo();
        System.out.println();

        OOP.displayInfo();
        System.out.println();

        CS.displayInfo();
        System.out.println();

    }
}