public class NewRelease extends MovieType {


    @Override
    public int getPriceCode() {
        return NEW_RELEASE;
    }


    @Override
    public double countAmount(int  days) {
        return days * 3;
    }

    @Override
    public int rentalPoint(int daysRented) {
        if (daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
