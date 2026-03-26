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

    public void removeResult() {     //기록 삭제 기능
        if (!results.isEmpty()) {    // 컬렉션이 비어있지 않은지 확인
            results.remove(0);  // 컬렉션에서 가장 먼저 들어온 값 제거
            System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
        } else {
            System.out.println("삭제할 결과가 없습니다.");
        }
    }
    public List<Double> getResults() { //간접 접근을 통해 필드 데이터를 가져오는 Getter 메서드
        return results;
    }
    public void setResults(List<Double> results) {// 간접 접근을 통해 필드 데이터를 수정(교체)하는 Setter 메서드
        this.results = results;
    }


}
