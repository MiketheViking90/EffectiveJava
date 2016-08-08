package chap2.creatinganddestroyingobjects.considerstaticfactorymethodinsteadofconstructor;

import java.math.BigInteger;

public class UseStaticFactoryMethod {

    void booleanValueOf() {
        boolean b = Boolean.valueOf(false);
    }

    void confusingConstructor() {
        BigInteger bigInt = new BigInteger(0, 0, null);
        BigInteger preferableInstantiation = BigInteger.probablePrime(12, null);
    }

    class TestClass {

        int val1;
        int val2;

        public TestClass(int a, Integer b) {
            val1 = a;
            val2 = b;
        }

        public TestClass(Integer b, int a) {
            val1 = b;
            val2 = a;
        }
    }

}
