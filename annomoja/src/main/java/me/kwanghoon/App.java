package me.kwanghoon;

public class App {

    public static void main(String[] args) {
        Moja moja = new MojaFactory();
        System.out.println(moja.pullOut());
    }
}
