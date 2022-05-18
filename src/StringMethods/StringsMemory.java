package StringMethods;

public class StringsMemory {
    public static void main(String[] args){
        String text = "Hello";
        String anotherText = "Hello";
        String yetAnotherString = "Hello";
        text = "Helloooo";
        System.out.println(anotherText==text);
    }
}
