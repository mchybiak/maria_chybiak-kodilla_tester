// zadanie po zmianach
public class UserWywołanie {


    public static void main(String[] args) {

        User Jan = new User("Jan", 25);
        User Anna = new User("Anna", 19);
        User Zofia = new User("Zofia", 38);
        User Adam = new User("Adam", 10);
        User Karolina = new User("Karolina", 42);

        String[] usersNames = {Jan.getNames(), Anna.getNames(), Zofia.getNames(), Adam.getNames(), Karolina.getNames()};

        double[] usersAge = {Jan.getAge(), Anna.getAge(), Zofia.getAge(), Adam.getAge(), Karolina.getAge()};
        System.out.println(usersAge.length);

        double sum = 0.0;
        int usersAmount = usersAge.length;

        for (int i = 0; i < usersAge.length; i++) {
            sum += usersAge[i];
        }

        double averageAgeOfUsers = sum / usersAmount;
        System.out.println(averageAgeOfUsers);

        for (int i = 0; i < usersNames.length; i++) {
            if (usersAge[i] < averageAgeOfUsers) {
                System.out.println(usersNames[i]);
            }
        }
    }
}


