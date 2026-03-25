package calculator;
import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Double> results = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성

    public double calculate(int num1, int num2, char cal) {

        double result = 0;

        if (cal == '+') {
            result = num1 + num2;
        } else if (cal == '-') {
            result = num1 - num2;
        } else if (cal == '*') {
            result = num1 * num2;
        } else if (cal == '/') {
            if (num2 != 0) {
                result = num1 / num2;
            } else {            // 나눗셈시 분모가 0인 경우 방지
                System.out.println("0으로 나눌 수 없습니다.");
                return 0; // 나눗셈 오류로 반환 값이 없을 때 0반환
            }
        }
        results.add(result);
        return result;
    }
}
