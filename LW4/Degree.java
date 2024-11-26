import java.util.ArrayList;

public class Degree {
    private String name;
    private int numberOfStudents;
    private ArrayList<Course> courseOffering = new ArrayList<>();

    public Degree(String name, int numberOfStudents  /*, ArrayList<Course> courseOffering */ ) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
//        this.courseOffering = courseOffering;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Number of students: " + numberOfStudents);
//        for(Course course : courseOffering){
//            System.out.println(course);
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }

    public void offerCourse(Course course){
        courseOffering.add(course);
    }

    public void withdrawCourse(Course course){
        courseOffering.add(course);
    }

    public void listCoursesOffering(){
        for(Course course : courseOffering){
            System.out.println(course);
        }
    }
}
