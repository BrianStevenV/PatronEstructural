public class NormalAccount implements Account {

    public NormalAccount() {
        System.out.println( " Normal account .... is ..... ! ");
    }

    @Override
    public void entry() {
        System.out.println("I'm entring with Normal Account...");
    }

    @Override
    public void withdrawl() {
        System.out.println("I'm withdrawiling...");
    }
}
