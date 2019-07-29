
import java.util.*;

public class Customer {

    private String name;
    private List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        String result = "Rental Record for " + getName() + "\n";
        for (Rental rental : rentals) {
            result += "\t" + rental.getTitle() + "\t"
                    + rental.countAmount() + "\n";
        }
        result += "You owed " + getTotalAmount() + "\n";
        result += "You earned " + countFrequentRenterPoints() + " frequent renter points\n";


        return result;
    }

    private double getTotalAmount() {
        return rentals.stream().map(rental -> (rental.countAmount())).reduce(0.0, (x, y) ->(x +y));
    }

    private int countFrequentRenterPoints() {
        return rentals.stream().map((rental) -> (rental.rentalPoint())).reduce(0, (x, y) -> (x +y));

    }


}