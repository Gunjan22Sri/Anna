import java.util.Scanner;

//Print the value which you will get after calculating the number of digits. 
public class Big_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1,count=0;
        System.out.println(n);
        while ( n>0) {
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
