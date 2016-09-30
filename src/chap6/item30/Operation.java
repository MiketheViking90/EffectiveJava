package chap6.item30;

import java.util.function.DoubleBinaryOperator;

public enum Operation implements DoubleBinaryOperator {

    ADD {
        public double applyAsDouble(double left, double right) {
            return left + right;
        }
    },
    SUBTRACT {
        public double applyAsDouble(double left, double right) {
            return left - right;
        }
    },
    MULTIPLY {
        public double applyAsDouble(double left, double right) {
            return left * right;
        }
    },
    DIVIDE {
        public double applyAsDouble(double left, double right) {
            return left / right;
        }
    };

    public static void main(String[] args) {
        Operation add = Operation.ADD;
        System.out.println(add.applyAsDouble(1, 2));
    }
}
