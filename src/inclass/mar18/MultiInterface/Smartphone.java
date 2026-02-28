package inclass.mar18.MultiInterface;

public class Smartphone extends MusicPlayer implements Calculator, Camera, Telephone {


    @Override
    public void getMathDone() {
        System.out.println(" solve maths problem ");

    }

    @Override
    public void getPicsClick() {

        System.out.println(" 20 magapixel camera ");
    }

    @Override
    public void getVideoRecording() {
        System.out.println(" 4k video recording ");
    }
    @Override
    public  void getCalls(){

        System.out.println( " audio and video calls ");
    }

    void getMultiFeatures(){
        System.out.println(" coming with big screen ");

    }
}
