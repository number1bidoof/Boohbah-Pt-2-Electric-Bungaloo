public class Jingbah extends SupremeBoohbah{

    public Jingbah(){
        super();
        this.name = "Jingbah";
        System.out.println(name + " wants everyone to stay peaceful");
    }

    public void command(String message, boolean whisper){
        if (whisper){
            System.out.println(name + " says quietly: " + message);
        } else {
            System.out.println(name + " says loudly: " + message);
        }
    }

    @Override
    public void command(){
        System.out.println(name + " says: Let’s all take a deep breath");
    }
}
