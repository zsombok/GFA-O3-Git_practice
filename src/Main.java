public class Main {

    public static void main(String[] args) {
        greet("Zsombok Dávid", "Coding");
        Horoscope.future("Kos");
    }

    private static void greet(String name, String hobby) {
        System.out.printf("%s %s%n", name, hobby);
    }

}
