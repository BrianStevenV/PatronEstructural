public class Print {
    public static Account print(String input){
        switch (input){
            case "Normal Account":
                return new NormalAccount();
            case "QR Account":
                return new QRAccountAdapter(new QRAccount());
            default:
                return new NormalAccount();
        }
    }
}
