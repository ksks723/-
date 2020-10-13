package Java_02Variable;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';    //char ch = 65;
        int code = (int)ch;     //ch에 저장된 값을 int 타입으로 변환하여 저장한다

        System.out.printf("%c=%d(%#X)%n",ch,code,code);

        char h = '가';  //char h = 0xAC00;
        System.out.printf("%c=%d(%#X)%n",h,(int)h,(int)h);

    }
}
