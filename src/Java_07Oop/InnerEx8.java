package Java_07Oop;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerEx8 {
    public static void main(String[] args) {
        Button b = new Button("Start");
        b.addActionListener(new ActionListener() { //익명클래스 : 선언과 객체의 생성을 동시에 하기 때문에 단 한번만 사용되고,
                                                   // 오직 하나의 객체만을 생성할수있는 일회용 클래스이다.
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    System.out.println("ActionEvent occurred!!!");
                                }
                            }//익명클래스의 끝
        );
    }//main 의 끝
} //InnerEx8의 끝
