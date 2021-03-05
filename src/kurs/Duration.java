package kurs;

public class Duration {
    private long fixNanoTime;

    public void fix(String message) {
        System.out.println(message);
        System.out.println("старт...");
        fixNanoTime = System.nanoTime();
    }

    public void out(String message) {
        long currentNanoTime = System.nanoTime();
        System.out.println("прошло наносекунд: " + (currentNanoTime - fixNanoTime));
        if (message != null) fix(message);
    }

    public void out() {
        out(null);
    }
}
