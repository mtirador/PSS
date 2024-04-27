package com.katapotter;

import java.util.Scanner;

public class ReadData {
    public static int[][] readPurchasedBooks() {
        Scanner input = new Scanner(System.in);
        int[][] purchasedBooks = new int[7][1]; //filas:libros ,columnas:cuantoss :)

        for (int BooksCollection = 0; BooksCollection < 7; BooksCollection++) {
            System.out.print("How many units of book " + (BooksCollection + 1) + " do you want to buy? ");
            purchasedBooks[BooksCollection][0] =input.nextInt();   
        }
        
        input.close();
        return purchasedBooks;
       
    }
}
