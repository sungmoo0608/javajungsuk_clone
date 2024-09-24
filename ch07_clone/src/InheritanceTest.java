class MyPoint {
    int x;
    int y;
}

// class Circle extends MyPoint{   // 상속
//     int r;
// }

class Circle extends Object {
    MyPoint p = new MyPoint();
    int r;

    Circle() {
        p = new MyPoint();
    }
}

public class InheritanceTest {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println(c.toString());
        System.out.println(c);

        Circle c2 = new Circle();
        System.out.println(c2.toString());
        System.out.println(c2);
        c.p.x = 1;
        c.p.y = 2;
        c.r = 3;
        System.out.println("c.x = "+ c.p.x);
        System.out.println("c.y = "+ c.p.y);    
        System.out.println("c.r = "+ c.r);            

    }
}
