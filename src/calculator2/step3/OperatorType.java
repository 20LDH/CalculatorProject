package calculator2.step3;

public enum OperatorType {

    //속성
    ADD('+'),
    SUB('-'),
    MUL('*'),
    DIV('/');

    private final char symbol;

    // 생성자
    OperatorType(char symbol) {
        this.symbol = symbol;
    }

    public char getSymbol() {
        return symbol;
    }

    public static OperatorType fromSymbol(char inputSymbol) { // 기호를 입력받으면 해당 기호인 enum목록을 찾아주는 메서드
        for (OperatorType type : OperatorType.values()) {
            if (type.getSymbol() == inputSymbol) {
                return type;
            }
        }
        // 만약 맞는 기호가 없다면 예외를 던집니다.
        throw new IllegalArgumentException("해당하는 연산 기호가 없습니다: " + inputSymbol);
    }
}
