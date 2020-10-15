package Java_06Oop;

public class FactorialTest {
    //팩토리얼은 한숫자가 1이 될때까지 1씩 감소시켜가면서 계속해서 곱해 나가는 것
    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println(result); //result = 4*3*2*1;
    }

    static int factorial(int n) {
        int result = 0;

        if(n==1)
            result =1;
        else
            result = n*factorial(n-1);
        return result;
    }
}
