import java.util.Scanner;

//input a number and print factorial of the number
class Factorial {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.print(fact);
    }
}