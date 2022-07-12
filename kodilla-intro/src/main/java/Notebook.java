public class Notebook {
    int weight;
    int price;
    int year;
    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price >= 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 300) {
            System.out.println("This notebook is light.");
        } else if (this.weight >= 300 && this.weight <= 600) {
            System.out.println("The notebook is quite heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
    }

    public void checkProfitability() {
        if (this.price < 1500 && this.year > 2010) {
            System.out.println("This purchase is profitable.");
        } else if (this.price > 1100 && this.year < 2018) {
            System.out.println("This purchase is not profitable.");
        } else {
            System.out.println("Find another notebook");
        }
    }
}

