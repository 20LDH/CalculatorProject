package calculator;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";  //변수 선언 후 초기화
        Calculator calc = new Calculator(); // Calculator 인스턴스 생성

        while (!input.equals("exit")) {
            System.out.print("숫자 입력: ");
            int num1 = scanner.nextInt();
            System.out.print("기호 입력: ");
            char cal = scanner.next().charAt(0);  //공백이전까지의 문자열 입력받고 변수에 저장
            System.out.print("숫자 입력: ");
            int num2 = scanner.nextInt();

            double result = calc.calculate(num1, num2, cal); // Calculator.java가 연산을 하고
            System.out.println("결과: " + result);

            System.out.println("현재까지 저장된 결과들: " + calc.getResults());

            System.out.println("더 계산하시겠습니까? 아무키나 입력하세요. (exit 입력 시 종료)");
            input = scanner.next();    // 이미 위에 input이 선언됐기 때문에 자료형 필요 x

            System.out.print("가장 먼저 저장된 결과를 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String command = scanner.next();

            if (command.equals("remove")) {
                // [ ] 생성한 인스턴스(calc)를 통해 삭제 메서드 활용
                calc.removeResult();

                // 삭제 후 상태를 확인하기 위해 Getter 호출
                System.out.println("현재 저장된 결과 목록: " + calc.getResults());
            }
        }
    }
}