package TEST3;

import java.util.Scanner;

/**
 * @author xhy
 */
public class Circle {
    private double radius;
    private double perimeter;
    private double area;
    private static final double pi = 3.14159;

    protected void setcircle(){
        System.out.println("输入圆的半径");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextDouble();
    }
    public double getArea(){
        area =pi*radius*radius;
        return area;
    }
    public double getPerimeter(){
        perimeter=radius*pi*2;
        return perimeter;
    }
}
