public class Jingbah extends SupremeBoohbah{

    public void command(String message, boolean whisper){
        if (whisper){
            System.out.println("Jingbah says quietly: " + message);
        } else {
            System.out.println("Jingbah says loudly: " + message);
        }
    }
    @Override
    public void command(){
        System.out.println("Jingbah wants everyone to stay peaceful");
    }
}
