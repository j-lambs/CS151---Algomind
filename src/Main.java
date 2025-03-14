//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main Method for Testing
public static void main (String[] args) {
    // Creating a course object
    Course course1 = new Course("Algebra I", "Basic algebra principles", 101, "9th Grade");

    // Adding lessons
    course1.addLesson("Introduction to Algebra");
    course1.addLesson("Solving Linear Equations");
    course1.addLesson("Graphing Functions");

    // Displaying course information
    course1.displayCourseInfo();

    // Removing a lesson
    course1.removeLesson("Solving Linear Equations");

    // Display updated information
    System.out.println("\nUpdated Course Information:");
    course1.displayCourseInfo();
}
