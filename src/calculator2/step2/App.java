package calculator2.step2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator(); //인스턴스화 calculator가 가지고있는 필드나 메서드 사용가능
        int result = 0; //결과 담을 변수 초기화
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            if (num1 < 0) {
                System.out.println("양의 정수만 입력 가능합니다.");
                return;
            }
            System.out.print("사칙연산 기호를 입력하세요: ");
            char symbol = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            if (num2 < 0) {
                System.out.println("양의 정수만 입력 가능합니다.");
                return;
            }

            System.out.println("결과 = " + result);
            System.out.println("종료하려면 exit 입력 그렇지 않으면 아무 글자나 입력하세요.");
            input = sc.next();
        }
    }
}
