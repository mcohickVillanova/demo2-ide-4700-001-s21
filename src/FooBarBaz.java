public class FooBarBaz {

    public static void main(String[] args) {
        FooBarBaz fbb = new FooBarBaz();
        System.out.println(fbb.transform(3));
        System.out.println(fbb.transform(35));
    }

    public String transform(int i) {
        String result = "";

        if (i % 3 == 0) {
            result += "foo";
        }

        if (i % 5 == 0) {
            result += "bar";
        }

        if (i % 7 == 0) {
            result += "baz";
        }

        if (result.isEmpty()) {
            result += i;
        }

        return result;
    }

}