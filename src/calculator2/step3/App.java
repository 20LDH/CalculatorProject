package calculator2.step3;
import java.util.Scanner;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArithmeticCalculator calculator = new ArithmeticCalculator(); //인스턴스화 calculator가 가지고있는 필드나 메서드 사용가능
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = sc.nextDouble();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            if (num1 < 0) {
                System.out.println("양의 정수만 입력 가능합니다.");
                return;
            }
            System.out.print("사칙연산 기호를 입력하세요: ");
            char symbol = sc.next().charAt(0);
            OperatorType operator = OperatorType.fromSymbol(symbol);

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = sc.nextDouble();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            if (num2 < 0) {
                System.out.println("양의 정수만 입력 가능합니다.");
                return;
            }

            Double calculate = calculator.calculate(num1, num2, operator);

            System.out.println("결과 = " + calculate);
            System.out.println("현재까지 저장된 결과들: " + calculator.getResults());
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? 네 / 아니요");
            String removeInput = sc.next();
            if ("네".equals(removeInput)) {
                calculator.removeResult();  // 컬렉션에서 가장 먼저 들어온 값 제거
                System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
            }
            System.out.println("정수를 입력하고 그보다 큰 결과값만 출력하시겠습니까 네 / 아니요");
            String answer = sc.next();
            if ("네".equals(answer)) {
                System.out.println("정수를 입력하세요: ");
                double threshold = sc.nextDouble();
                List<Double> filteredList = calculator.getResultsBig(threshold); // threshold : 결과값, 임계값
                System.out.println(threshold + "보다 큰 결과값: " + filteredList);
            }

            System.out.println("종료하려면 exit 입력 그렇지 않으면 아무 글자나 입력하세요.");
            input = sc.next();
        }
    }
}