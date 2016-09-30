package chap6.item30;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;

public enum Operation implements DoubleBinaryOperator {

    ADD("+") {
        public double applyAsDouble(double left, double right) {
            return left + right;
        }
    },
    SUBTRACT("-") {
        public double applyAsDouble(double left, double right) {
            return left - right;
        }
    },
    MULTIPLY("*") {
        public double applyAsDouble(double left, double right) {
            return left * right;
        }
    },
    DIVIDE("/") {
        public double applyAsDouble(double left, double right) {
            return left / right;
        }
    };

    private final String symbol;

    private static final Map<String, Operation> stringToEnum = new HashMap<>();
    static {
        for (Operation op : Operation.values()) {
            stringToEnum.put(op.toString(), op);
        }
    }

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public static Operation fromString(final String value) {
        return stringToEnum.get(value);
    }

    public static void main(String[] args) {
        Operation add = Operation.ADD;
        System.out.println(add.applyAsDouble(1, 2));

        for (Operation op : Operation.values()) {
            System.out.println(op.name());
            System.out.println(op.applyAsDouble(12, 5) + " " + op);
        }

        Operation mult = Operation.fromString("*");
        System.out.println(mult.applyAsDouble(12, 4));
    }
}
