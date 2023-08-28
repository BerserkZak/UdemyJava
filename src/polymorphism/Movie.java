package polymorphism;

public class Movie {

    private final String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceName = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceName + " film");

    }
}

class Adventure extends Movie {

    public Adventure(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Some Bad Hap");
    }

}

class Thriller extends Movie {

    public Thriller(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Funny",
                "Family choice",
                "Some happy Hap");
    }

}
class Comedy extends Movie {

    public Comedy(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Cool",
                "Awesome",
                "Hihi haha");
    }

}


