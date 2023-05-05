package numge;

import java.util.Random;
import java.util.Scanner;

public class number {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Random random =new Random() ;
        int randNum=random.nextInt(100);
        System.out.println("随机数已生成!");
        while(true){
            System.out.println("请输入你所猜想的数字：  ");
            int num=sc.nextInt() ;
            if(num>randNum){
                System.out.println("猜大了");
            }else if(num<randNum){
                System.out.println("猜小了");
            }else if (num==randNum){
                System.out.println("猜对了");
                break;
            }
        }
    }
}