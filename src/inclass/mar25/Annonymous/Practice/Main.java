package inclass.mar25.Annonymous.Practice;

public class Main  {
    static void main(String[] args) {

        RogersGreeting rogersGreeting = new RogersGreeting() {
            @Override
            public void show() {
                System.out.println(" hello from rogers ");
            }
        };
        rogersGreeting.show();
        BellGreeting bellGreeting = new BellGreeting() {
            @Override
            public void place() {
                System.out.println(" hello from bell ");
            }
        };
        System.out.println();
        bellGreeting.place();
        System.out.println();

        FidoGreeting  fidoGreeting = new FidoGreeting();
        fidoGreeting.show();
        System.out.println();



    }
}
