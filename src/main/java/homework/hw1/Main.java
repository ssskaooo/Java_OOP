package homework.hw1;

public class Main {

    public static void main(String[] args) {

        HotDrinkVendingMachine machine = new HotDrinkVendingMachine();
        machine.addProductList(new HotDrink("Каппучино",200, 0.3, 70));
        machine.addProductList(new HotDrink("Латте",300, 0.4, 50));
        machine.addProductList(new HotDrink("Эспрессо",120, 0.2, 96));
        machine.addProductList(new HotDrink("Американо",120, 0.3, 80));
        printProductByName(machine, "Латте");


    }

    public static void printProductByName(VendingMachine vendingMachine, String name){
        System.out.println(vendingMachine.getProductByName(name));
    }
}
