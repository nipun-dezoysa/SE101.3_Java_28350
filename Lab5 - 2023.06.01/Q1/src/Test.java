public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(12);
        student.setName("Nipun");
        student.setCourse("Computer Science");

        Lecture lecture = new Lecture();
        lecture.setId(1);
        lecture.setName("Amal");
        lecture.setProgramme("CSSE");

        System.out.println("Student name :"+student.getName());
        System.out.println("Student Id: "+student.getId());
        System.out.println("Student Course: "+student.getCourse());

        System.out.println("Lecture name :"+lecture.getName());
        System.out.println("Lecture Id: "+lecture.getId());
        System.out.println("Lecture Course: "+lecture.getProgramme());
    }
}
