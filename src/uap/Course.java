public class Course {
    private String id, title;
    private int noOfClasses;
    private String instructor;

    public Course(String coureID, String title, int noOfClasses, String instructor) {
        this.id = coureID;
        this.title = title;
        this.noOfClasses = noOfClasses;
        this.instructor = instructor;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNoOfClasses() {
        return noOfClasses;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return "Id: " + id + "\n" +
                "Title: " + title + "\n" +
                "No Of Classes: " + noOfClasses + "\n" +
                "Instructor: " + instructor;
    }
}
