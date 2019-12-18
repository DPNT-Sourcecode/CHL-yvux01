package befaster.solutions.CHL.discounters;

public class ASkuDiscounter implements Discounter {
    @Override
    public int getDiscount(int total, int noOfItems) {
        int validItemsForFirstDiscount = noOfItems / 5;
        int discountForFive = validItemsForFirstDiscount * 50;
        int remainingItems = noOfItems % 5;
        int validItemsForSecondDiscount = remainingItems / 3;
        int discountForThree = validItemsForSecondDiscount * 20;
        return discountForFive + discountForThree;
    }
}



