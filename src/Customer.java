public class Customer {

    private String fName;
    private int age;
    private double wallet = 20.00;
    private boolean studentCard;

    public Customer(){

    }

    public Customer(String fName, int age, double wallet, boolean studentCard) {
        this.fName = fName;
        this.age = age;
        this.wallet = wallet;
        this.studentCard = studentCard;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public boolean isStudentCard() {
        return studentCard;
    }

    public void setStudentCard(boolean studentCard) {
        this.studentCard = studentCard;
    }
}
