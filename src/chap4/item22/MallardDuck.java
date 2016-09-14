package chap4.item22;

public final class MallardDuck implements Duck {

    private final String name;

    public MallardDuck(String name) {
        this.name = name;
    }

    @Override
    public void quack() {
        System.out.println(name + " Quack quack");
    }

    @Override
    public void swim() {
        System.out.println(name + " Splash");
    }

    @Override
    public void fly() {
        System.out.println(name + " Flap flap");
    }

    public Turkey toTurkey() {
        return new DuckToTurkeyAdapter(this);
    }

    private class DuckToTurkeyAdapter implements Turkey {

        private final Duck duck;

        public DuckToTurkeyAdapter(Duck duck) {
            this.duck = duck;
        }

        @Override
        public void gobble() {
            duck.quack();
        }

        @Override
        public void trot() {
            duck.fly();
        }
    }

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck("Bruce");
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.swim();

        Turkey turkey = mallardDuck.toTurkey();
        turkey.gobble();
        turkey.trot();
    }
}
