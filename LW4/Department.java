import java.util.ArrayList;

public class Department {
    private String name;
    private Lecturer departmentHead;
    private ArrayList<Course> courseOffering = new ArrayList<>();
    private ArrayList<Lecturer> lecturersBelongsTo = new ArrayList<>();

    public Department(String name  /*, Lecturer departmentHead, ArrayList<Course> courseOffering, ArrayList<Lecturer> lecturersBelongsTo  */) {
        this.name = name;
//        this.departmentHead = departmentHead;
//        this.courseOffering = courseOffering;
//        this.lecturersBelongsTo = lecturersBelongsTo;
    }

    public void displayInfo(){
        System.out.println("Name: " + name);
//        System.out.println("Department head: " + departmentHead.getName());
//        System.out.println("Offering courses:");
//        for(Course course : courseOffering){
//            System.out.println(course.getName());
//        }
//        System.out.println("Lecturers:");
//        for(Lecturer lecturer : lecturersBelongsTo){
//            System.out.println(lecturer.getName());
//        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void appointDepartmentHead(String name){
        departmentHead.setName(name);
    }

    public void displayDepartmentHeadInfo(){
        System.out.println("Name: " + departmentHead.getName());
    }

    public void offerCourse(Course course){
        courseOffering.add(course);
    }

    public void withdrawCourse(Course course){
        courseOffering.remove(course);
    }

    public void addLecturer(Lecturer lecturer){
        lecturersBelongsTo.add(lecturer);
    }

    public void removeLecturer(Lecturer lecturer){
        lecturersBelongsTo.remove(lecturer);
    }
}
