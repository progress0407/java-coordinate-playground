package coordinate.grammertest;

import java.util.function.Function;

import static java.lang.System.out;

public class MyGrameerTest {
    public static void main(String[] args) {
        Foo.create().introduce();

        Function<Foo, Boo> trans = Foo::getBoo;

        MyGrameerTest grameerTest = new MyGrameerTest();
        grameerTest.doFunction(trans);
        grameerTest.doFunction(Foo::getBoo2);
    }

    public void doFunction(Function<Foo, Boo> trans) {
        Foo foo = new Foo();
        trans.apply(foo);
    }

    static class Foo {

        private static Boo boo;

        public static Boo create() {
            if (boo == null) {
                out.println("Boo Create !");
                boo = new Boo();
            }
            return boo;
        }

        public Boo getBoo() {
            return new Boo("Foo를 통해 생성된 Boo 입니다");
        }

        public Boo getBoo2() {
            return new Boo("Foo를 통해 생성된 Boo 입니다 2");
        }
    }

    static class Boo {

        private int val = 11;

        private String message = "";

        public Boo() {
        }

        public Boo(String message) {
            this.message = message;
            out.println("message = " + message);
        }

        public void introduce() {
            out.println("I'm Boo");
        }
    }
}
