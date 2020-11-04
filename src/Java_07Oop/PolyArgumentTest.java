package Java_07Oop;

import com.sun.org.apache.bcel.internal.generic.ConstantPushInstruction;

import java.util.Vector;

//vector를 사용하여 객체를 추가하거나 제거할 수 있게 작성되어있다
public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer seulki = new Buyer();
        Tv tv = new Tv();
        Computer cp = new Computer();
        Audio ad = new Audio();

        seulki.buy(tv);
        seulki.buy(cp);
        seulki.buy(ad);

        seulki.summary();
        System.out.println();
        System.out.println(" Computer 를 환불할게요 ");
        seulki.refund(cp);
        seulki.summary();

    }
}

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        bonusPoint = (int) (price / 10.0);
    }

    Product() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv extends Product {
    Tv() {
        super(100);
    }

    @Override
    public String toString() {
        return "Tv";
    }
}

class Computer extends Product {
    Computer() {
        super(200);
    }

    @Override
    public String toString() {
        return "Computer";
    }
}

class Audio extends Product {
    Audio() {
        super(50);
    }

    @Override
    public String toString() {
        return "Audio";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;
    Vector item = new Vector(); //구입한 제품을 저장하는데 사용될 vector 객체

    void buy(Product product) {
        if (money < product.price) {
            System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
            return;
        }
        money -= product.price;
        bonusPoint += product.bonusPoint;
        item.add(product);
        System.out.println(product + " 을/를 구매하셨습니다.");
    }

    void refund(Product product){
        if(item.remove(product)){
            money += product.price;
            bonusPoint -= product.bonusPoint;
            System.out.println(product + " 을/를 반품하셨습니다.");
        }else{
            //제거에 실패한 경우
            System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
        }
    }

    void summary(){
        int sum =0;
        String itemList = "";

        if(item.isEmpty()){
            System.out.println("구입하신 제품이 없습니다.");
            return;
        }

        //반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
        for(int i=0; i<item.size();i++){
            Product p = (Product)item.get(i); //Vector 의 i번째에 있는 객체를 얻어온다.
            sum += p.price;
            itemList += (i==0) ? "" + p : ", " + p;
        }
        System.out.println("구입하신 물품의 총금액은 " + sum + " 만원입니다.");
        System.out.println("구입하신 제품은 " + itemList  + " 입니다.");
    }
}
