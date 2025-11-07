public class Jumbah extends SupremeBoohbah{

    public Jumbah(){
        super();
        this.name = "Jumbah";
        System.out.println(name + " refuses to kneel!!");
    }

    @Override
    public void command(){
        System.out.println(name + " strikes back!");
    }
}
