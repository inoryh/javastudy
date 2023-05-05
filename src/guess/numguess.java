package guess;

import java.util.Random;
import java.util.Scanner;

public class numguess {
    public static void main(String[] args) {
        int n=0;
        System.out.println("输入0-100的数字");
        Scanner sc = new Scanner(System.in);
        Random r = new Random(100);
        int Randomnum = r.nextInt();
        n = sc.nextInt();
        if (n>Randomnum){
            System.out.println("猜大了,请重新输入:");
        } else if (n==Randomnum){
            System.out.println("恭喜你猜中了!");
        }else if (n<Randomnum){
            System.out.println("猜小了,请重新输入:");
        }
    }
}