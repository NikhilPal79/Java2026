package inclass.apr26.FunctionalIterface;

public interface ISport {
    default void play(){
        System.out.println("play method ");
    }
}
