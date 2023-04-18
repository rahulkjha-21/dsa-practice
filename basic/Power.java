package basic;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int pow = power(x, y);
        System.out.println(pow);
    }
    public static int power(int x, int y){
        if (y == 0) {
            return 1;
        }
        int res = x * power(x, y - 1);
        return res;
    }
}
