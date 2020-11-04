package Java_07Oop;

public class PolyArgumentTest2 {
    public static void main(String[] args) {

    }
}

class Pro{  //product 인데 PolyArgumentTest.java와 겹쳐서 이렇게 했음
    int price; //제품의 가격
    int bonusPoint; //제품구매 시 제공하는 보너스점수

    Pro(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Pro(){  //기본생성자

    }
}

