public class Fibonacciho{
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        while(b <= 1000){
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + ",");
        }
    
    }
    }