public class Classroom
{
    private Student[] classRoster;
    private static int numStudent = 0;

    public Classroom(int numStudents)
    {
        classRoster = new Student[numStudents];
    }

    // getter method: returns a reference to classRoster array
    public Student[] getClassRoster()
    {
        return classRoster;
    }

    /** Adds student to the next available index in classRoster array
     (when iterating left to right) and return true to indicate
     student was successfully added.
     If the array is already maxed out (i.e. the class roster is full),
     do not add the Student and return false.
     */
    public boolean addStudent(Student student)
    {
        if (numStudent < classRoster.length) {
            classRoster[numStudent] = student;
            numStudent++;

            return true;
        } else {
            return false;
        }
    }

    /** Returns the class exam average determined by adding
     adding up all exams taken by all students and dividing
     by total number of exam scores
     */
    public double classExamAverage()
    {
        double sum = 0;
        for (int i = 0; i < numStudent; i++) {
            Student temp = classRoster[i];
            sum += getTestSum(temp);
        }

        int numExams = 0;
        for (int i = 0; i < numStudent; i++) {
            Student temp = classRoster[i];
            numExams += temp.getExamScores().length;
        }

        return sum / numExams;
    }

    private static double getTestSum(Student student) {
        int[] scores = student.getExamScores();
        double sum = 0.0;

        for(int grade : scores) {
            sum += grade;
        }

        return sum;
    }

    /** Prints class roster by printing all non-null students
     in the order they appear in classRoster, one per line,
     in the format; last name, first name;
     any null values in classRoster are not printed
     */
    public void printRoster()
    {
        for (int i = 0; i < numStudent; i++) {
            Student temp = classRoster[i];

            System.out.println(temp.getLast() + ", " + temp.getFirst() + ";");
        }
    }
}