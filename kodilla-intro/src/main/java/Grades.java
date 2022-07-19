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
        int gradesAmount = this.size;

        for (int i = 0; i < gradesAmount; i++) {
            sum += grades[i];
        }

        double averageGradesAmount = sum / gradesAmount;
        return averageGradesAmount;
    }

    public int getLastGrade() {
        return this.grades[this.size - 1];
        }
    }


