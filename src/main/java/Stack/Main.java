package Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("총 스택 저장공간의 크기 입력 >> ");
        int size = scanner.nextInt();   // stack 저장공간의 크기
        Stack stack = new StringStack(size);    // 업캐스팅
        boolean res;
        while(true) {
            System.out.print("문자열 입력 >> ");
            String val = scanner.next();    // val에 문자열 입력
            if(val.equals("그만")) {
                break;
            }
            else {
                res = stack.push(val);  // 그만이 아닐 때에는 문자열을 푸쉬함
            }

            if(res==false) {    // 스택의 공간이 가득 차있을 때
                System.out.println("스택이 꽉 차서 푸쉬 불가");
                break;
            }
        }

        System.out.print("스택에 저장된 모든 문자열 팝 >> ");
        int len=stack.length();     // pop을 하면 stack.length()의 리턴 값 tos가 계속 변하기 때문에 i가 length를 초과하는 순간
        // 반복문이 멈추게 됨. >> 초기 tos의 값을 len 변수에 담아 반복문 조건으로 설정해야함
        for(int i=0; i<len; i++) {
            System.out.print(stack.pop() + " ");
        }
    }
}
