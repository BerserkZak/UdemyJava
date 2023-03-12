
public class StringBuilderLesson {

    public static void main(String[] args) {


        String helloWorld = "Hello" + " World";
        helloWorld.concat(" Buy");

        StringBuilder build = new StringBuilder("Hello" + "World");
        build.append("buy");
        build.replace(1, 6, "0");

        System.out.println(build);
        System.out.println(helloWorld);


    }

    public static void printInformation(String string) {
        System.out.println("String = " + string);
        System.out.println("lenght =" + string.length());
    }

    public static void printInformation(StringBuilder builder) {
        System.out.println("StringBuilderLesson = " + builder);
        System.out.println("lenght =" + builder.length());
    }
}
