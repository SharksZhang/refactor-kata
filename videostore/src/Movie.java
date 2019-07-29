

public class Movie {


    private String title;
    private MovieType movieType;

    public Movie(String title, int priceCode) {
        this.title = title;
        try {
            this.movieType = MovieType.create(priceCode);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getPriceCode() {
        return this.movieType.getPriceCode();
    }

    public void setPriceCode(int code) {
        try {
            this.movieType = MovieType.create(code);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int rentalPoint(int daysRented){
        return this.movieType.rentalPoint(daysRented);
    }


    public double countAmount( int days){
        return  this.movieType.countAmount(days);
    }

    public String getTitle() {
        return title;
    }

}



