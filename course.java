class course {
    String coursname;
    int enrolledStudents;

    static int maxCapacity =100;
 String[] enrolledStudent = new String[maxCapacity];
    {
        maxCapacity++;
    }
    static void setMaxCapacity(int maxCapacity){
        course.maxCapacity = maxCapacity;
    }
    void enrolledStudent(String studentname){
        enrolledStudents[enrolledStudent] = studentname;
        enrolledStudents++;
    }

}

