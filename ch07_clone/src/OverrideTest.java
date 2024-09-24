class Point1 {
    int x ; 
    int y ; 
    String getLocation() { 
        return "x:"+x+", y:"+y;
    }
}

class Point3D1 extends Point1 {
    int z ;

    @Override
    String getLocation() { 
        return "x:"+ x +", y:"+ y + ", z:" + z;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        Point3D1 p = new Point3D1();
        p.x = 3;
        p.y = 5;
        p.z = 7;
        System.out.println(p.getLocation());
    }
}
