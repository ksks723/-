package Java_07Oop;

class Outer {
    int value = 10; //Outer.this.value

    class Inner {
        int value = 20; //this.value

        void method1() {
            int value = 30;
            System.out.println("           value : " + value);
            System.out.println("      this.value : " + this.value);
            System.out.println("Outer.this.value : " + Outer.this.value);
        }
    } //Inner 클래스의 끝
}//Outer 클래스의 끝

public class InnerEx5 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method1();
    }
}//InnerEx5끝
