public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(200, 500, 2005);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkProfitability();

        Notebook heavyNotebook = new Notebook(400, 800, 2022);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.price);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkProfitability();

        Notebook oldNotebook = new Notebook(1000, 2000, 2020);
        System.out.println(oldNotebook.weight + " " + oldNotebook.price);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkProfitability();

    }
}