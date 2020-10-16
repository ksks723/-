package Java_07Oop;

public class DeckTest {//얘도 혼자서 한번 짜볼것
    public static void main(String[] args) {
        Deck d = new Deck();          //카드한벌을 만든다
        Card c = d.pick(0);    //섞기전에 제일 위의 카드를 뽑는다.
        System.out.println(c);        //System.out.println(c.toString()); 과 같다.

        d.shuffle();
        c=d.pick(0);            //카드를 섞는다.
        System.out.println(c);         //섞은 후에 제일 위의 카드를 뽑는다.
        c=d.pick();
        System.out.println(c);         //랜덤으로 아무거나 뽑기
    }
}

class Deck{
    final int CARD_NUM =52;              //카드의 개수
    Card cardArr[] = new Card[CARD_NUM]; //Card객체 배열은 포함

    Deck(){
        int i = 0;
        for(int k=Card.KIND_MAX; k>0;k--){
            for(int n =0; n<Card.NUM_MAX;n++){
                cardArr[i++] = new Card(k,n+1);
            }
        }
    }
    Card pick(int index){
        return cardArr[index];
    }
    Card pick(){
        int index = (int)(Math.random() * CARD_NUM);
        return pick(index);
    }
    void shuffle(){
        for(int i =0; i< cardArr.length;i++){
            int r = (int)(Math.random()*CARD_NUM);

            Card temp = cardArr[i];
            cardArr[i] = cardArr[r];
            cardArr[r] = temp;
        }
    }
}//Decj클래스의 끝

class Card{
    static final int KIND_MAX =4;
    static final int NUM_MAX = 13;

    static final int SPADE = 4;
    static final int DIAMOND = 3;
    static final int HEART = 2;
    static final int CLOVER = 1;
    int kind;
    int number;

    Card(){
        this(SPADE,1);
    }
    Card(int kind, int number){
        this.kind = kind;
        this.number = number;
    }
    public String toString(){
        String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
        String numbers = "0123456789XJQK";
        return "kind:  "+kinds[this.kind]+", number : " + numbers.charAt(this.number);
    }//toString() 의 끝
}//Card 클래스의 끝