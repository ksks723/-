package Java_07Oop;

public class PointTest2 {
    /*
    Point3D p3 = new Point3D();와 같이 인스턴스를 생성하면, 아래와 같은 순서로 생성자가 호출된다.

    Point3D() -> Point3D(int x,int y,int z) -> Point(int x, int y) -> Object()

    어떤 클래스의 인스턴스를 생성하면, 클래스 상속관계의 최고조상인
    Object 클래스까지 거슬러 올라가면서 모든 조상클래스의 생성자가 순서대로 호출된다
     */

    public static void main(String[] args) {
        Point3D p3 = new Point3D();
        System.out.println("p3.x= "+p3.x);
        System.out.println("p3.y= "+p3.y);
        System.out.println("p3.z= "+p3.z);
    }
}

class Point{
    int x =10;
    int y =20;

    Point(int x,int y){//생성자 첫 줄에서 다른 생성자를 호출하지 않기 때문에 컴파일러가 super();를 여기 삽입,조상인 Object의 생성자 Object()를 의미한다

        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point{
    int z =30;

    Point3D(){
        this(100,200,300);  //Point3D(int x, int y, int z)를 호출한다.
    }
    Point3D(int x,int y,int z){
        super(x,y);                 //Point(int x,int y)를 호출한다.
        this.z = z;
    }
}