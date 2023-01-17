public class Student {
    private String first;
    private String last;
    private int[] examScores;

    public Student(String first, String last, int[] examScores) {
        this.first = first;
        this.last = last;
        this.examScores = examScores;
    }

    // getter method: returns a reference to examScores array
    public int[] getExamScores() {
        return examScores;
    }

    // getter method
    public String getFirst() {
        return first;
    }

    // getter method
    public String getLast() {
        return last;
    }
}