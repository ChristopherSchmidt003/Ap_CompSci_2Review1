import java.util.Scanner;

class Multiples {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0; //the mulptiple
        int tot = 0; //total of mulptiples
        int cap = 1000; //The find multiples below this number
        for (int i = 0; i < cap; i++){
            if (i % 3 == 0 || i % 5 == 0){
                num = i;
                System.out.print(num + " ");
                tot = tot + num;
            }
        }
        System.out.println("");
        System.out.print(tot);
    }
}