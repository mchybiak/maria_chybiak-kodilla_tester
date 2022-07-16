public class GradesWywołanie {
    public static void main(String[] args){
        Grades gradebook = new Grades();
        gradebook.add(5);
        gradebook.add(2);
        gradebook.add(4);
        gradebook.add(1);

        double average = gradebook.getAverage();
        System.out.println(average);

        int lastGrade = gradebook.getLastGrade();
        System.out.println(lastGrade);
    }
}
