package com.task22;

public class View {
    public static void showResults(int legalAgeCount, int minorCount, int maleLegalAgeCount, int femaleMinorCount, double legalAgePercentage, double femalePercentage) {
        System.out.println("Number of people of legal age: " + legalAgeCount);
        System.out.println("Number of minors: " + minorCount);
        System.out.println("Number of male people of legal age: " + maleLegalAgeCount);
        System.out.println("Number of female minors: " + femaleMinorCount);
        System.out.println("Percentage represented by people of legal age: " + legalAgePercentage + "%");
        System.out.println("Percentage that women represent: " + femalePercentage + "%");
    }
}
