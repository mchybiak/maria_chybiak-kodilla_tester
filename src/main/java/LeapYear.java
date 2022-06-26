public class LeapYear {
    public static void main(String[] args) {
        int year = 1700;
        if (year % 4 != 0) {
            System.out.println("Rok " + year + " nie jest przestępny");
        }
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("Rok " + year + " jest przestępny");
        }
        if (year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
            System.out.println("Rok " + year + " nie jest przestępny");
        }
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
            System.out.println("Rok " + year + " jest przestępny");
        }
    }
}
