import java.util.Scanner;

public class Menu {

    private static Scanner keyboard = new Scanner(System.in);
    private static Customer customer = new Customer();

    private boolean ageCheck(Movie movie, boolean check){
        if(!check){
            break;
        } else {
            if(customer.getAge() < movie.getAgeRating()){
                System.out.println("You are too young for this film, please select another");
            }
        }


    }

    public void main (String[] args){

        System.out.println("Welcome to the VIP theatre," +
                "\nPlease fill out our member form before continuing");

        Movie.memberForm(customer);

        System.out.println("What movie what you like to see?");



        boolean control = false;
        int selector;


        selector = keyboard.nextInt();
        while(!control) {
            switch (selector) {
                case 1:
                    Movie movie = new Movie("Age of Ultron", true, 12, 3, 6.50);
                    control = true;
                    break;
                case 2:
                    Movie movie1 = new Movie("Captain America: The first avenger", false, 4, 7.30);
                    control = true;
                    break;
                case 3:
                    Movie movie2 = new Movie("The Hulk", true, 15, 2, 5.20);
                    control = true;
                    break;
                case 4:
                    Movie movie3 = new Movie("Avengers: End game", true, 18, 5, 800);
                    control = true;
                    break;
                case 5:
                    Movie movie4 = new Movie("Iron Man 3", false, 4, 6.70);
                    control = true;
                    break;
                default:
                    System.out.println("Incorrect movie selection, please select from 1 to 5");
                    control = false;
            }
        }

    };
};


