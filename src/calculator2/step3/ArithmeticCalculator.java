package calculator2.step3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    private List<Double> results = new ArrayList<>();
    public  Double calculate(double num1, double num2, OperatorType type) {
        double result = 0;


        if (type == OperatorType.ADD) {
            result = num1 + num2;
        } else if (type == OperatorType.SUB) {
            result = num1 - num2;
        } else if (type == OperatorType.MUL) {
            result = num1 * num2;
        } else if (type == OperatorType.DIV) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {            // 나눗셈시 분모가 0인 경우 방지
                throw new ArithmeticException(("0으로 나눌 수 없습니다."));
            }
        }
        else {
            throw new ArithmeticException(("사친연산 기호가 아닙니다."));
        }
        results.add(result);  // 결과 저장하기 위함
        return result; // 얘는 결과 전달만함
    }

    public List<Double> getResults() {  //
        return results;
    }
    public void removeResult() {     //기록 삭제 기능
        if (!results.isEmpty()) {    // 컬렉션이 비어있지 않은지 확인
            results.remove(0);  // 컬렉션에서 가장 먼저 들어온 값 제거
        }
    }
}
