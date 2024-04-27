package com.katapotter;

public class BookStore {
    public static void getTotalPrice() {
        PotterController controller = new PotterController();
        int[][] purchasedBooks = ReadData.readPurchasedBooks();

        double totalPrice = controller.calculatePurchasePrice(purchasedBooks);
        System.out.println("Total prize: " + totalPrice + " euros.");
    }
}
