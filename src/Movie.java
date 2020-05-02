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

    Movie[] movieList = {
            Movie movie1 = new Movie("Age of Ultron", true, 12, 3, 6.50),
            Movie movie2 = new Movie("Captain America: The first avenger", false, 4, 7.30),
            Movie movie3 = new Movie("The Hulk", true, 15, 2, 5.20),
            Movie movie4 = new Movie("Avengers: End game", true, 18, 5, 800),
            Movie movie5 = new Movie("Iron Man 3", false, 4, 6.70);
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
