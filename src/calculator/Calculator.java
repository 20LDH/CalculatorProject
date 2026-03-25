package calculator;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";  //변수 선언 후 초기화

        while (!input.equals("exit")) {
            System.out.print("숫자 입력: ");
            int num1 = scanner.nextInt();
            System.out.print("기호 입력: ");
            char cal = scanner.next().charAt(0);  //공백이전까지의 문자열 입력받고 변수에 저장
            System.out.print("숫자 입력: ");
            int num2 = scanner.nextInt();

            int result = 0;
            if (cal == '+') {
                result = num1 + num2;
            } else if (cal == '-') {
                result = num1 - num2;
            } else if (cal == '*') {
                result = num1 * num2;
            } else if (cal == '/') {
                if (num2 != 0) {          //입력값이 0이 아닐 때
                    result = num1 / num2;
                } else {                // 나눗셈시 분모가 0인 경우 방지
                    System.out.println("0으로 나눌 수 없습니다.");
                }
            }
            System.out.println("결과: " + result);

            System.out.println("더 계산하시겠습니까? 아무키나 입력하세요. (exit 입력 시 종료)");
            input = scanner.next();    // 이미 위에 input이 선언됐기 때문에 자료형 필요 x
        }
    }
}