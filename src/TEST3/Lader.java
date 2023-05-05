package TEST3;

import java.util.Scanner;

/**
 * @author xhy
 * us为上底upside    ds为下底downside
 * h为height 面积为area
 */
public class Lader {
    private double us;
    private double ds;
    private double h;
    private double area;

    protected void setUs() {
        System.out.println("输入上底长度");
        Scanner sc = new Scanner(System.in);
        us=sc.nextDouble();
        this.us = us;
    }

    protected void setDs() {
        System.out.println("输入下底长度");
        Scanner sc = new Scanner(System.in);
        ds = sc.nextDouble();
        this.ds = ds;
    }


    protected void setH() {
        System.out.println("输入梯形的高");
        Scanner sc = new Scanner(System.in);
        h=sc.nextDouble();
        this.h = h;
    }
    protected void setlader(){
        setUs();
        setDs();
        setH();
    }

    public double getArea() {
        area=(us+ds)*h/2;
        return area;
    }

}
