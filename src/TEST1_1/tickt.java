package TEST1_1;

import java.util.Random;
import java.util.Scanner;

/**
 * @author xhy
 */
abstract class Tickt {
    int totalNum;
    abstract int contains(int[] arr,int a);
    abstract void getNoteNum(int n);
    abstract void buy();
    abstract void outArr();

}

 abstract class lottery extends Tickt{
     int totalNum = 0;

     //数组的元素为7个
     int[] arr = new int[7];
     int endline=7;
     Random random1 = new Random();

    void getArr(int totalNum){  //获取数组
        int index=0;
        while(index<endline){
            //数组随机范围为1~35
        int random2= random1.nextInt(35)+1;
        if (contains(arr,random2)==0){
            arr[index++]=random2;
        }
        }
    }

     @Override
     int contains(int[] arr,int a ) {   //把数据放入数组中
         for (int i = 0; i <endline ; i++) {
             if (arr[i]==a){
                 return 1;
             }
         }
         return 0;
     }

     @Override
     void getNoteNum(int n) {   //获取总共的注数
         totalNum = n;
     }

     @Override
     void buy() {  //输入下注的数目
         System.out.println("请输入需要买的注数");
         Scanner sc = new Scanner(System.in);
         //购买的注数
         int n = 0;
         n = sc.nextInt();
         getNoteNum(n);
     }

     @Override
     void outArr() {     //输出彩票号码(数组)
             for (int j = 0; j <totalNum ; j++) {
             getArr(totalNum);
             System.out.println("彩票号码为:");
             for (int i = 0; i < endline; i++) {
                 System.out.print(arr[i]+" ");
             }
             System.out.println();
             for (int i = 0; i < endline; i++) {
                 arr[i]=0;
            }
         }
     }
 }