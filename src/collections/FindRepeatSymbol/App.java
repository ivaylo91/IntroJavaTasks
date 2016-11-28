package collections.FindRepeatSymbol;

/**
 * Created by ivaylo on 11/28/16.
 */
public class App {

    public static void main(String[] args) {

        RepeatSymbol repeatSymbol = new RepeatSymbol();

        System.out.println(repeatSymbol.countSymbol("Hello Java"));

        repeatSymbol.wordCounter("Mamama Mamamma miq");
    }
}
