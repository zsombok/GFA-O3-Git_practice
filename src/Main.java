public class Main {

    public static void main(String[] args) {
        greet("Zsombok Dávid");
        Horoscope.future("Kos");
    }

    private static void greet(String name) {
        System.out.println("Greetings for the " + name);
    }

}
