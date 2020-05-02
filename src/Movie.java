import java.util.Scanner;

public class Movie {

    private String title;
    private boolean ageCheck;
    private int ageRating;
    private int starRating;
    private double price;

    private static Scanner pen = new Scanner(System.in);

    public Movie(String title, boolean ageCheck, int ageRating, int starRating, double price) {
        this.title = title;
        this.ageCheck = ageCheck;
        this.ageRating = ageRating;
        this.starRating = starRating;
        this.price = price;
    }

    public Movie(String title, boolean ageCheck, int starRating, double price) {
        this.title = title;
        this.ageCheck = ageCheck;
        this.starRating = starRating;
        this.price = price;
    }

    public static void memberForm(Customer customer){
        String answer = "";

        System.out.print("What is your full name?");
        customer.setfName(pen.nextLine());
        System.out.print("What age are you?");
        customer.setAge(pen.nextInt());

        if(customer.getAge() >= 15 && customer.getAge() <= 30){
            System.out.println("Do you have a student card?");
            answer = pen.nextLine();
        }

        if(answer.toLowerCase().equals("y") || answer.toLowerCase().equals("yes")){
            customer.setStudentCard(true);
        } else {
            customer.setStudentCard(false);
        }
    }

    public boolean ageCheckNeeded() {
        return ageCheck;
    }

    public void setAgeCheck(boolean ageCheck) {
        this.ageCheck = ageCheck;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
