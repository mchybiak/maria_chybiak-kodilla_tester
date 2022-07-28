import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 30;
        int max = 0;
        int sum = 0;

        while (sum < 5000){
            int n = random.nextInt(31);
            if (n > max) max = n;
            if (n < min) min = n;
            sum = sum + n;
            System.out.println(n);

        }
        System.out.println(sum);
        System.out.println("Największa liczba to " + max + ".");
        System.out.println("Najmniejsza liczba to " + min + ".");
    }
}

