package com.katapotter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

public class AppTest {

    @Test
    public void testCalculatePriceNoBooks() {
        PotterController controller = new PotterController();
        int[][] noBooks = new int[7][1];
        double totalPriceNoBooks = controller.calculatePurchasePrice(noBooks);
        assertEquals(0.0, totalPriceNoBooks,0.1);
    }

    @Test
    public void testPrizeABook() {
        PotterController controller = new PotterController();
        int[][] oneBook = new int[7][1];
        oneBook[0][0]=1;
        double totalPriceOneBook = controller.calculatePurchasePrice(oneBook);
        assertEquals(8.0, totalPriceOneBook,0.1);
    }

    @Test
    public void testTwoDifferentBooks() {
        PotterController controller=new PotterController();
        int[][] twoDifferentBooks = new int[7][1];
        twoDifferentBooks[0][0]= 1; 
        twoDifferentBooks[1][0]=1;
        double totalPriceTwoDifferentBooks=controller.calculatePurchasePrice(twoDifferentBooks);
        assertEquals(15.2, totalPriceTwoDifferentBooks,0.1); 
    }

    @Test
    public void testSameBookMultiple() {
        PotterController controller = new PotterController();
        int[][] threeBooks = {{3},{0},{0},{0},{0},{0},{0}};
        double totalPriceSameBook = controller.calculatePurchasePrice(threeBooks);
        assertEquals(24.0, totalPriceSameBook,0.1); 
    }

    @Test
    public void testSameBookMultipleDifferentBook() {
        PotterController controller = new PotterController();
        int[][] threeDifferentBooks = {{3},{1},{0},{0},{0},{0},{0}};
        double totalPriceThreeDifferentBooks = controller.calculatePurchasePrice(threeDifferentBooks);
        assertEquals(30.4, totalPriceThreeDifferentBooks,0.1); 
    }


    @Test
    public void testThreeDifferentBooks() {
        PotterController controller = new PotterController();
        int[][] threeDifferentBooks = {{1},{1},{1},{0},{0},{0},{0}};
        double totalPriceThreeDifferentBooks = controller.calculatePurchasePrice(threeDifferentBooks);
        assertEquals(21.6, totalPriceThreeDifferentBooks,0.1); 
    }

    @Test
    public void testFourDifferentBooks() {
        PotterController controller = new PotterController();
        int[][] fourDifferentBook = {{1},{1},{1},{1},{0},{0},{0}};
        double totalPriceFourDifferentBooks = controller.calculatePurchasePrice(fourDifferentBook);
        assertEquals(27.2, totalPriceFourDifferentBooks,0.1); 
    }

    @Test
    public void testFiveDifferentBooks() {
        PotterController controller = new PotterController();
        int[][] fiveDifferentBook = {{1},{1},{1},{1},{1},{0},{0}};
        double totalPriceFiveDifferentBooks = controller.calculatePurchasePrice(fiveDifferentBook);
        assertEquals(32.0, totalPriceFiveDifferentBooks,0.1); 
    }

    @Test
    public void testSixDifferentBooks() {
        PotterController controller = new PotterController();
        int[][] sixDifferentBook = {{1},{1},{1},{1},{1},{1},{0}};
        double totalSixDifferentBooks = controller.calculatePurchasePrice(sixDifferentBook);
        assertEquals(33.6, totalSixDifferentBooks,0.1); 
    }
    

    @Test
    public void testAllCollection() {
        PotterController controller = new PotterController();
        int[][] allCollection = {{1},{1},{1},{1},{1},{1},{1}};
        double totalSaga = controller.calculatePurchasePrice(allCollection);
        assertEquals(30.8, totalSaga,0.1); 
    }

    

}

