package TEST3;

import java.util.Scanner;

/**
 * @author xhy
 */
public class Trangle {
    // sidelength  简写为sl  边长

    private double sl1;
    private double sl2;
    private double sl3;
    private double perimeter;
    private double area;


    protected void setsl1() {
        System.out.println("请输入三角形的一条边");
        Scanner sc = new Scanner(System.in);
        sl1 = sc.nextDouble();
    }

    protected void setsl2() {
        System.out.println("请输入三角形的第二条边");
        Scanner sc = new Scanner(System.in);
        sl2 = sc.nextDouble();
    }

    protected void setsl3() {
        System.out.println("请输入三角形的第三条边");
        Scanner sc = new Scanner(System.in);
        sl3 = sc.nextDouble();
    }

    public boolean Trangle() {
        if (sl1+sl2>=sl3&&sl1+sl3>=sl2&&sl2+sl3>=sl1){
            return true;
        }
        try {
            throw new Exception("三角形不成立");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }

    public void setTrangle(){   //获取三边并判断三角形是否成立
        setsl1();
        setsl2();
        setsl3();

        if (Trangle()){
            System.out.println("三角形成立");
        } else {
            System.out.println("三角形不成立,重新输入");
        }
    }


    public double getPerimeter() {  //获取三角形周长
        perimeter=sl1+sl2+sl3;
        return perimeter;
    }

    public double getArea() {   //获取三角形面积 用海伦公式
        double p = (sl1+sl2+sl3)/2;
        area =Math.sqrt(p*(p-sl1)*(p-sl2)*(p-sl3));
        return area;
    }


}
