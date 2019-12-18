package befaster.solutions.CHL.discounters;

public class ASkuDiscounter implements Discounter {
    @Override
    public int getDiscount(int total, int noOfitems) {
        return noOfitems / 3 * 20;
    }
}


