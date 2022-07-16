public class Grades {
    private int[] grades;
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public double getAverage() {

        double sum = 0.0;
        int gradesAmount = grades.length;

        for (int i = 0; i < gradesAmount; i++) {
            sum += grades[i];
        }

        double averageGradesAmount = sum / gradesAmount;
        return averageGradesAmount;
    }

    public int getLastGrade() {

        int gradesAmount = grades.length;
        int sum = 0;
        int lastAddGrade = 0 + grades.length;

        for (int i = 0; i >= gradesAmount; i++) {
            return lastAddGrade;
        }
        return lastAddGrade;
    }
}


