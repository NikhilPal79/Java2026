package inclass.DesignPattern.Signleton;

public class Emp {

    private static  Singleton instance = null;

    private void Singleton (){
        System.out.println(" singleton constructor ");
    }

    public static Singleton getInstance(){

        if(instance == null){
            instance = new Singleton();
        }
        return  instance;
    }

    public void show(){
        System.out.println(" show method : " + instance.hashCode());
    }
}
