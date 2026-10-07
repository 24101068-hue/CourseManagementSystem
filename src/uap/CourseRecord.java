import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CourseRecord {
    public String registeredStudentId, courseId, status;
    public LocalDate startDate, endDate;
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public CourseRecord(String registeredStudentId, String courseId) {
        this.registeredStudentId = registeredStudentId;
        this.courseId = courseId;
        this.status = "Resgistered";
        this.startDate = LocalDate.now();
    }

    public String getRegisteredStudentId() {

        return registeredStudentId;
    }

    public String getCourseId()
    {
        return courseId;
    }


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStatus(String status){

        if(status.equalsIgnoreCase("completed")){
            this.status = status;
            endDate = LocalDate.now();
        }

        else{
            this.status = status;
        }
    }

    public String getStatus() {

        return status;
    }
    @Override
    public String toString() {
        return "Registered Student Id: " + registeredStudentId + "\n" +
                "Course Id: " + courseId + "\n" +
                "Status: " + status + "\n" +
                "Start Date: " + startDate + "\n" +
                "End Date: " + endDate;
    }
}
