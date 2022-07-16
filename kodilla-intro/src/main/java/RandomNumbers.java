import java.util.Random;

public class RandomNumbers {

    public int getCountofRandomNumber() {
        Random random = new Random();

        int min = 0;
        int max = 30;
        int sum = 0;

        while (sum <= 5000) {
            int n1 = random.nextInt();
            int n2 = random.nextInt();

            sum = sum + n1 + n2;
        }

        return (sum);
    }
}


