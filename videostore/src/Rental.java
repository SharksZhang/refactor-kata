
public class Rental {
    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int rentalPoint(){
        return this.getMovie().rentalPoint(daysRented);
    }


    public double  countAmount() {
        return  this.getMovie().countAmount(this.daysRented);
    }

    public String getTitle() {
        return this.movie.getTitle();
    }
}