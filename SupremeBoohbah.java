public class SupremeBoohbah {
    protected String name;

    SupremeBoohbah(){
        this.name = "Zing Zing Zingbah";
        System.out.println(name + ",the supreme Boohbah leader has awaken!!! ");

    }
    public void command(){
        System.out.println("All hail the new leader, ZINGZINGZINGBAH");
    }

    public void command(String text){
        System.out.println(name + text);
    }
   @Override
    public String toString(){
       return "This is an example :3 ";
    }

}
