public abstract class MovieType {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    public static MovieType create(int typeCode) throws Exception {
        switch (typeCode) {
            case CHILDRENS:
                return new Children();
            case REGULAR:
                return new Regular();
            case NEW_RELEASE:
                return new NewRelease();
            default:
                throw new Exception("Incorrect Type Code");
        }
    }

    abstract public int getPriceCode();

    abstract public double countAmount(int  days);
    public int rentalPoint(int daysRented){
        return 1;
    }
}


