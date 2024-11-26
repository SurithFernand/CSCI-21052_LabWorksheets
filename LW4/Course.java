public class Course {
    private String name;
    private String enrollType;
    private int numberOfStudentsEnrolled;
    private Lecturer lecturerInCharge;
    private Degree degreeBelongsTo;

    public Course(String name, String enrollType, int numberOfStudentsEnrolled  /* , Lecturer lecturerInCharge, Degree degreeBelongsTo */ ) {
        this.name = name;
        this.enrollType = enrollType;
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
//        this.lecturerInCharge = lecturerInCharge;
//        this.degreeBelongsTo = degreeBelongsTo;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Enroll type: " + enrollType);
        System.out.println("No of students enrolled: " + numberOfStudentsEnrolled);
//        System.out.println("Lecturer in charge: " + lecturerInCharge.getName());
//        System.out.println("Degree: " + degreeBelongsTo.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEnrollType() {
        return enrollType;
    }

    public void setEnrollType(String enrollType) {
        this.enrollType = enrollType;
    }

    public int getNumberOfStudentsEnrolled() {
        return numberOfStudentsEnrolled;
    }

    public void setNumberOfStudentsEnrolled(int numberOfStudentsEnrolled) {
        this.numberOfStudentsEnrolled = numberOfStudentsEnrolled;
    }

    public void addLecturerInCharge(String name){
        lecturerInCharge.setName(name);
    }

    public void removeLectureInCharge(){
        lecturerInCharge.setName("");
    }

    public void addDegreeBelongsTo(String name){
        degreeBelongsTo.setName(name);
    }

    public void removeDegreeBelongsTo(){
        degreeBelongsTo.setName("");
    }
}

