package inclass.mar25.Annonymous;

public class GreetingMain {
    static void main(String[] args) {


        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println(" hello from greeting class ");
                System.out.println(" reason behind this is not to create different class just to implement the single method");
            }
        };
        greeting.greet();
        System.out.println();


        HindiGreeting hindiGreeting = new HindiGreeting() {
            @Override
            public void greetHindi() {
                System.out.println(" namastey in hindi");
            }
        };
        hindiGreeting.greetHindi();
        System.out.println();

        FrenchGreeting frenchGreeting = new FrenchGreeting() {
            @Override
            public void greetFrench() {
                System.out.println(" bonjour in french ");
            }
        };
        System.out.println(" bonjour in french ");
        System.out.println();

        SpanishGreeting spanishGreeting = new SpanishGreeting() {
            @Override
            public void greetSpanish() {
                System.out.println(" hello from spanish class ");
            }
        };
        spanishGreeting.greetSpanish();
    }
}
