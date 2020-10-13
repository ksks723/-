package Java_03Operator;

public class OperatorEx2 {
    public static void main(String[] args) {
        int i=5, j=0;

        j= i++;
        System.out.println("j = i++ ; 실행 후, i="+i+", j="+j);

        i=5;  //결과값비교를위해 다시초기화
        j=0;

        j= ++i;
        System.out.println("j = ++i ; 실행 후, i="+i+", j="+j);
    }
}
