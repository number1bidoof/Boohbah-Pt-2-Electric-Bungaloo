public class BoohbahRebellionTest {
    public static void main(String[] args) {
        // begging of Chatgpt code, I didn't know how to do the array
        SupremeBoohbah[] boohbahs = new SupremeBoohbah[4];
        boohbahs[0] = new Humbah();
        boohbahs[1] = new Zumbah();
        boohbahs[2] = new Jumbah();
        boohbahs[3] = new Jingbah();
        // end of Chatgpt code

        System.out.println("\n****** Boohbah Rebellion Begins ******");
        for (SupremeBoohbah boohbah : boohbahs){
            boohbah.command();
        }

        System.out.println("\n****** Overloaded Commands ******");
        boohbahs[1].command(" says: I will dance to my OWN tune!!!");
        ((Jingbah)boohbahs[3]).command("Please calm down and we can talk it out!!!", false);

    }
}
