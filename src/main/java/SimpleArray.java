public class SimpleArray {
    public static void main(String[] args) {
        String[] friendsName = new String [5];
        friendsName[0] = "Adam";
        friendsName[1] = "Zosia";
        friendsName[2] = "Kasia";
        friendsName[3] = "Janek";
        friendsName[4] = "Antek";
        String name = friendsName[2];
        System.out.println(name);
        int numberOfElements = friendsName.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów" );
    }
}