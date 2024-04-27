package com.katapotter;

public class PotterController {
    private final double PRICEBOOK= 8.0;
    private final double DISCOUNTTWO= 0.05;
    private final double DISCOUNTTHREE= 0.10;
    private final double DISCOUNTFOUR= 0.15;
    private final double DISCOUNTFIVE= 0.20;
    private final double DISCOUNTSIX =0.30;
    private final double DISCOUNTSEVEN= 0.45;

    public double calculatePurchasePrice(int[][] books) {
        double totalPrice=0.0,discount=0.0;
        int countTotalBooks=0;
        int countDifferentBook=0;

    for (int bookCollection = 0; bookCollection< books.length; bookCollection++) {
            for (int countBook = 0; countBook<books[bookCollection].length; countBook++) {
                countTotalBooks += books[bookCollection][countBook];
                if (books[bookCollection][countBook] > 0) {
                    countDifferentBook++;
                }
            }
        }
        discount = calculateDiscount(countDifferentBook);
        totalPrice = countTotalBooks * PRICEBOOK;
        totalPrice-= totalPrice * discount;

        return totalPrice;
    }

    public double calculateDiscount(int differentBookCount) {
        double discount = 0.0;
        switch (differentBookCount) {
            case 2:discount = DISCOUNTTWO; break;
            case 3:discount = DISCOUNTTHREE; break;
            case 4:discount = DISCOUNTFOUR; break;
            case 5:discount = DISCOUNTFIVE; break;
            case 6:discount = DISCOUNTSIX; break;
            case 7:discount = DISCOUNTSEVEN; break;
        }
        return discount;
    }
}
