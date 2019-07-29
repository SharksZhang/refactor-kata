public class Children extends MovieType {


    @Override
    public int getPriceCode() {
        return CHILDRENS;
    }

    @Override
    public double countAmount(int  days) {
        double result = 1.5;
        if (days > 3) {
            result += (days - 3) * 1.5;
        }
        return result;
    }

}
