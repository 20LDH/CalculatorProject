package calculator2.step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private   List<Integer> results = new ArrayList<>();
    public  Integer calculate(int num1, int num2, char symbol) {
        int result = 0;

        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '/') {
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

    public List<Integer> getResults() {  //
        return results;
    }
    public void removeResult() {     //기록 삭제 기능
        if (!results.isEmpty()) {    // 컬렉션이 비어있지 않은지 확인
            results.remove(0);  // 컬렉션에서 가장 먼저 들어온 값 제거
        }
    }

}
