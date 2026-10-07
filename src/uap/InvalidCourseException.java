public class InvalidCourseException extends Exception {
        public InvalidCourseException(String id) {

            super("User with id " + id + " is not a valid Course");
        }
}
