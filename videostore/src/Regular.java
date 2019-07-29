public class Regular extends MovieType {


    @Override
    public int getPriceCode() {
        return REGULAR;
    }

    @Override
    public double countAmount(int  days) {
        double result = 2;
        if (days > 2) {
            result += (days - 2) * 1.5;
        }
        return result;
    }
}
