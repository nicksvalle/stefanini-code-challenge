import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

    }

    public static String numberState(int num){
        if (num > 0) {
            return num + " is positive.";
        } else if (num < 0) {
            return num + " is negative.";
        } else {
            return num + " is zero.";
        }
    }

    public static String isEven(int num){
        if (num % 2 == 0) {
            return num + " is even.";
        } else{
            return num + "is odd.";
        }
    }

    public static String isDivisibleByThree(int num){
        if (num % 3 == 0) {
            return num + " is divisible by 3";
        } else{
           return num + " is not divisible by 3";
        }
    }

}
