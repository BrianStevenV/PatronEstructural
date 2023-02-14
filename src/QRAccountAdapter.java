public class QRAccountAdapter implements Account {
    private QRAccount qrAccount;

    public QRAccountAdapter(QRAccount qrAccount) {
        this.qrAccount = new QRAccount();
        System.out.println("This is QR Account Adapter...");
    }

    @Override
    public void entry() {
        System.out.println("Im a entring with QR Account...");
        this.qrAccount.entryQR();
        this.qrAccount.readQR();
    }

    @Override
    public void withdrawl() {
        System.out.println("I'm withdrawiling with QR Account");
        this.qrAccount.confirmationQR();
    }
}
