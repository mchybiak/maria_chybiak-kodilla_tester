import java.util.Scanner;

public class Color {
    public static String getColor(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Please select color. Type first letter. W for white, G for green, P for purple, O for orange, R for red, B for blue");
            String color = scanner.nextLine().trim().toUpperCase();
            switch (color){
                case "W":
                    return "WHITE";
                case "G":
                    return "GREEN";
                case "P":
                    return "PURPLE";
                case "O":
                    return "ORANGE";
                case "R":
                    return "RED";
                case "B":
                    return "BLUE";
                default:
                    System.out.println("Wrong color, please try again");
            }
        }
    }
}