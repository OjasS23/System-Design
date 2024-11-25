package singletonDesign;

public class Example {
    public static void main(String[] args) {
        Samosa samosa = Samosa.getSamosa();
        System.out.println("Singleton instance: " + samosa);
    }
}
