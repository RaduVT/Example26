import java.util.Scanner;

public class Examole26 {
    public static void main(String[] args) {
        int num, div, i;

        Scanner inpuValue;
        inpuValue = new Scanner(System.in);

        System.out.println("Enter the number:");
        num = inpuValue.nextInt();


        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}

