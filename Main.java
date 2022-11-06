import java.util.Scanner;

public class Main {

    static int us(int a , int b){
        int son=0;
        if(b==1) {
            return a;
        }
        son = a * us(a ,b-1);
        return son;
    }

    public static void main(String[] args) {
        int a = 0,b=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        a = input.nextInt();
        System.out.println("Taban değeri giriniz : ");
        b = input.nextInt();
        int son= us(a,b);
        System.out.println("Sonuç: "+son);
    }
}