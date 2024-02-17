package seminars.lesson1;


public class Main {


    public static void main(String[] args) {
        BottleOfWatterVendingMachine machine = new BottleOfWatterVendingMachine();
        machine.addProductList(new BottleOfWater("Пепси", 100, 5));
        machine.addProductList(new BottleOfWater("Фанта", 10, 0.5));
        machine.addProductList(new BottleOfWater("Кола", 1, 1));
        machine.addProductList(new BottleOfWater("Лимонад", 1000, 500));

        printProductByName(machine, "Лимонад");


    }

    public static void printProductByName(VendingMachine vendingMachine, String name){
        System.out.println(vendingMachine.getProductByName(name));
    }


}
