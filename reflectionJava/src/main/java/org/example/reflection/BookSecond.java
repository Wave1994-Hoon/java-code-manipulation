package org.example.reflection;

public class BookSecond {

    public static String A = "A";

    private String B = "B";

    public BookSecond() {
    }

    public BookSecond(String b) {
        B = b;
    }

    public void c() {
        System.out.println("C");
    }

    public int sum(int left, int right) {
        return left + right;
    }
}
