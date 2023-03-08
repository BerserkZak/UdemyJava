public class StringMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startIndex = birthDate.indexOf("1982");
        System.out.println("Starting index = " + startIndex);
        System.out.println("Birth year = " + birthDate.substring(startIndex));
        System.out.println("Birth month = " + birthDate.substring(3 ,5));

        String newDate = String.join("/", "25", "11", "1982");
        System.out.println("New date = " + newDate);

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");
        System.out.println(newDate);
        System.out.println(newDate.replace("/", "*"));
        System.out.println("-=".repeat(20));
        System.out.println("Players info".indent(12));
        System.out.println("-=".repeat(20));


    }

}
