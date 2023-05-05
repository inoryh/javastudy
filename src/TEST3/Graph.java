package TEST3;

/**
 * @author xhy
 */
public class Graph {
    public static void main(String[] args) {
    Trangle t=new Trangle();
        System.out.println("输入三角形三边长");
        t.setTrangle();
        System.out.println("三角形面积是: "+t.getArea());
        System.out.println("三角形的周长是:"+t.getPerimeter());


        Lader l = new Lader();
        l.setlader();
        System.out.println("梯形的面积为: "+l.getArea());

        Circle c = new Circle();
        c.setcircle();
        System.out.println("圆形的周长是: "+c.getPerimeter());
        System.out.println("圆的面积是: "+c.getArea());
    }
}

