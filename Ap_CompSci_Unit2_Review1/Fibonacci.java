import java.util.Scanner;

class Fibonacci {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 1; //the current number in the sequence
        int lastnum = 1; //the previous number in the sequence
        int tot = 0; //total of each number
        int cap = 4000000; //add all numbers in sequence below this number
        
        while (num < cap){
            System.out.print(num + " ");
            num = num + lastnum;
            lastnum = num - lastnum;
            if (num % 2 == 0){
                tot = tot + num;
            }
        }
        System.out.println("");
        System.out.print(tot);
    }
    
}