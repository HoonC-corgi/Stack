package Stack;

public class StringStack implements Stack{
    private String [] elements;
    private int tos;    // top of stack

    StringStack(int capacity) { // main 메소드의 size를 capacity로 받아옴
        elements = new String [capacity];   // capacity 크기의 스트링 스택 생성
        tos=-1; // 인덱스는 0부터 시작하기 때문에 tos의 값을 -1로 초기화.
    }

    public int length() {
        return tos+1;   // 길이는 1부터 시작하기 때문에 기존 -1에서 시작한 tos에 1을 더해주어야 함
    }

    public int capacity() { // 스택의 크기
        return elements.length; // 스택의 길이를 리턴
    }

    public String pop() {
        if(tos==-1) {   // tos가 -1, 즉 문자열에 아무 값도 들어가지 않았을 때
            return null;
        }
        else {  // tos가 -1이 아닐 때, 즉 문자열이 스택에 채워졌을 때
            return elements[tos--]; // 배열의 tos 번째 인덱스의 밸류를 리턴 후 해당 인덱스를 제거하기 위해 후위 연산 --를 해줌
        }
    }

    @Override
    public boolean push(String val) {
        if (tos == capacity() - 1) {  // tos가 배열의 인덱스와 같을 때, 즉 문자열이 다 채워졌을 때
            return false;   // false를 리턴하여 동작을 멈춤
        } else {  // 채워지지 않았을 때
            elements[++tos] = val;    // elemenets의 인덱스를 올려주고 그 값에 밸류를 채움
            return true;
        }
    }
}
