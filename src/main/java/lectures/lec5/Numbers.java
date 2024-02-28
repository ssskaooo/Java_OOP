package lectures.lec5;

public class Numbers {
    //

    private int a;
    private int b;

    public Numbers(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public  Numbers(){

    }
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }


    public void sumNumbers(int a, int b){
        int c;
        if(a > 0 && b > 0){
            c = a + b;
            System.out.println("сумма чисел " + a + " + " + b +" равна " + c);
            if(a <= 0 && b <= 0){
                System.out.println("Числа отрицательные или равны нулю");
            }
        }

    }
}
