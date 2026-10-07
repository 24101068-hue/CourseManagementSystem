package uap;

import java.util.Scanner;

public class CourseApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        CourseManagementSystem sy = new CourseManagementSystem("UAP");
            //System.out.println("Enter Your designation (A/S): ");
            //String des = sc.next();
            int choice;

                do{
                    System.out.println("Enter Your designation (A/S): ");
                    String des = sc.next();
                    if(des.equalsIgnoreCase("A")) {
                        do {
                            System.out.println("Please Enter");
                            System.out.println("1. Add Student");
                            System.out.println("2. Add Admin");
                            System.out.println("3. Add Course");
                            System.out.println("4. Find User");
                            System.out.println("5. Find course");
                            System.out.println("6. Course Details");
                            System.out.println("7. View Student list");
                            System.out.println("8. View User list");
                            System.out.println("0. Exit");
                            choice = sc.nextInt();
                            switch (choice) {

                                case 1://add student
                                        System.out.println("Enter name: ");
                                        String name = sc.next();
                                        System.out.println("Enter age: ");
                                        int age = sc.nextInt();
                                        sy.addStudent(name, age);
                                    break;
                                case 2://add admin
                                    System.out.println("Enter name: ");
                                    String name2 = sc.next();
                                    System.out.println("Enter age: ");
                                    int age2 = sc.nextInt();
                                    sy.addAdmin(name2, age2);
                                    break;
                                case 3://add course
                                    System.out.println("Enter Course ID: ");
                                    String courseID = sc.next();
                                    System.out.println("Enter Course Title: ");
                                    String title = sc.next();
                                    System.out.println("Enter Number of Class: ");
                                    int noOfclass = sc.nextInt();
                                    System.out.println("Enter Course Instractor: ");
                                    String instractor = sc.next();

                                    sy.addCourse(courseID, title, noOfclass, instractor);
                                    break;
                                case 4://finduser
                                    System.out.println("Enter name: ");
                                    String name3 = sc.next();
                                    User u = sy.findUser(name3);
                                    System.out.println(u.toString());
                                    break;
                                case 5://find course
                                    System.out.println("Enter Course ID: ");
                                    String id3 = sc.next();
                                    Course c = sy.findCourse(id3);
                                    System.out.println(c.toString());
                                    break;
                                case 6://view course record
                                    sy.displayCourse();
                                    break;
                                case 7://view student list
                                    sy.displayStudent();
                                    break;
                                case 8://view user list
                                    sy.display();
                                    break;
                                default:
                                    System.out.println("invalid");
                            }
                        }while (choice!=0);
                    }
                    System.out.println("to Exit from the program press 0\nelse Press any number");
                    choice = sc.nextInt();
                    System.out.println("Enter Your designation (A/S): ");
                     des = sc.next();
                    if(des.equalsIgnoreCase("S")){
                        do{
                            System.out.println("Please Enter");
                            System.out.println("1. Search Course");
                            System.out.println("2. Enroll Course");
                            System.out.println("3. List of Enrolled Course");
                            System.out.println("4. Attended Class");
                            System.out.println("5. Complete Course");
                            System.out.println("0. Exit");
                            choice = sc.nextInt();
                            switch (choice) {

                                case 1://Search Course
                                    System.out.println("Enter Course ID: ");
                                    String id3 = sc.next();
                                    Course c = sy.findCourse(id3);
                                    System.out.println(c.toString());
                                    break;
                                case 2://Enroll Course
                                    System.out.println("Enter name: ");
                                    String name2 = sc.next();
                                    System.out.println("Enter Course Code: ");
                                    String courseId = sc.next();
                                    User st = sy.findUser(name2);
                                    sy.registerStudent(st.getName(), courseId);
                                    break;
                                case 3://List Of Enrolled course
                                    System.out.println("Enter name: ");
                                    String name4 = sc.next();
                                    sy.enrolledCourseDisplay(name4);
                                    break;
                                case 4://Attend class
                                    System.out.println("Enter name: ");
                                    String name3 = sc.next();
                                    User u = sy.findUser(name3);
                                    sy.attendClass(u.getId());
                                    break;
                                case 5://Complete course
                                    System.out.println("Enter Course ID: ");
                                    String id4 = sc.next();
                                    sy.completeCourse(id4, "Completed");
                                    break;
                                default:
                                    System.out.println("invalid");
                            }
                        }while(choice != 0);
                    }
            }while(choice != 0);


        }
    }

