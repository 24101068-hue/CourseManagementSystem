package uap;

import java.util.ArrayList;

public class CourseManagementSystem {
    private String name;
    private ArrayList<User> users = new ArrayList<User>();
    private ArrayList<Course> courses = new ArrayList<Course>();
    private ArrayList<CourseRecord> courseRecords = new ArrayList<CourseRecord>();

    public CourseManagementSystem(String name) {
        this.name = name;
    }

    public String addCourse(String id, String title, int noOfClasses, String instructor){
        Course c = new Course(id, title, noOfClasses, instructor);
        courses.add(c);
        return c.getId();
    }

    public String addUser(String name, int ageUser){
        User u = new User(name, ageUser);
        users.add(u);
        return u.getId();
    }

    public String addAdmin(String name, int age){
        User u2 = new Admin(name ,age);
        u2.setID();
        u2.setRole("Admin");
        u2.addPrefixCodeToId("A");
        users.add(u2);
        return u2.getId();
    }

    public String addStudent(String name, int age){
        User u3 = new Student(name,age);
        u3.setID();
        u3.setRole("Student");
        u3.addPrefixCodeToId("s");
        users.add(u3);
        return u3.getId();
    }

    public User findUser(String name){
        for (int i=0; i<users.size(); i++){
            if(users.get(i).getName().equalsIgnoreCase(name)){
                return users.get(i);
            }
        }
        return null;
    }

    public Course findCourse(String courseId){
        for(int i=0; i<courses.size();i++){
            if(courses.get(i).getId().equalsIgnoreCase(courseId)){
                return courses.get(i);
            }
        }
        return null;
    }

    public void registerStudent(String name, String courseID){
        User reg = findUser(name);
        CourseRecord co = new CourseRecord(reg.getId(), courseID);
        courseRecords.add(co);
    }

    public void attendClass(String id){
        for (int i=0; i<courseRecords.size();i++){
            if (courseRecords.get(i).registeredStudentId.equalsIgnoreCase(id)){
                courseRecords.get(i).setStatus("in-progress");
            }
        }
    }

    public void completeCourse(String id, String status){
        for (int i=0; i<courseRecords.size();i++){
            if (courseRecords.get(i).registeredStudentId.equalsIgnoreCase(id)){
                courseRecords.get(i).setStatus("Completed");
                System.out.println(courseRecords.get(i).getStatus());
                System.out.println(courseRecords.get(i).getStartDate());
                System.out.println(courseRecords.get(i).endDate);

            }
        }
    }

    public void enrolledCourseDisplay(String name){
        User n = findUser(name);
        for (int i=0; i<courseRecords.size();i++){
            if(n.getId().equalsIgnoreCase(courseRecords.get(i).getRegisteredStudentId()))
            System.out.println(courseRecords.get(i).toString());
        }
    }

    public void displayStudent(){
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getRole().equalsIgnoreCase("Student")){
                System.out.println(users.get(i).toString());
            }
        }
    }

    public void displayAdmin(){
        for(int i=0; i<users.size(); i++){
            if(users.get(i).getRole().equalsIgnoreCase("Admin")){
                System.out.println(users.get(i).toString());
            }
        }
    }

    public void displayCourse(){
        System.out.println(courses.toString());
    }

    public void display(){

        System.out.println(users.toString());
        }
    }

