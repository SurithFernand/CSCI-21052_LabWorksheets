import java.util.ArrayList;

public class Student extends Person{
    private String studentID;
    private String year;
    private Degree degree;
    private ArrayList<Course> courseEnrolled = new ArrayList<>();

    public Student(String name, String studentID, String year /*, Degree degree, ArrayList<Course> courseEnrolled */ ) {
        super(name);
        this.studentID = studentID;
        this.year = year;
//        this.degree = degree;
//        this.courseEnrolled = courseEnrolled;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + studentID);
        System.out.println("Year: " + year);
//        System.out.println("Degree: " + degree);
//        for(Course course : courseEnrolled){
//            System.out.println(course);
//        }
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void registerDegree(Degree degree){
        this.degree = degree;
    };

    public void displayDegreeInfo(){
        System.out.println(degree);
    };

    public void enrollCourse(Course course){
        courseEnrolled.add(course);
    }

    public void unenrollCourse(Course course){
        courseEnrolled.remove(course);
    }

    public void listCourseEnrolled(){
        for(Course course : courseEnrolled){
            System.out.println(course);
        }
    }
}
