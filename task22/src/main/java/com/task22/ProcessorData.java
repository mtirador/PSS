package com.task22;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;

public class ProcessorData {

    public static void processData() {
        ArrayList<Person> people = generatePerson();
        PersonController peopleManager =new PersonController(people);
        int legalAgeCount,minorCount,maleLegalAgeCount,femaleMinorCount;
        double legalAgePercentage,femalePercentage;

        legalAgeCount= peopleManager.countLegalAge();
        minorCount = peopleManager.countMinors();
        maleLegalAgeCount =peopleManager.countMaleLegalAge();
        femaleMinorCount=peopleManager.countFemaleMinors();

        legalAgePercentage =peopleManager.calculateLegalAgePercentage();
        femalePercentage= peopleManager.calculateFemalePercentage();

        View.showResults(legalAgeCount, minorCount, maleLegalAgeCount, femaleMinorCount, legalAgePercentage, femalePercentage);
    }

    public static ArrayList<Person> generatePerson() {
        String[]genders={"Male","Female"};
        int currentYear=LocalDate.now().getYear();
        int year,totalMonthsYear=12,month,day;
        String gender; 

        ArrayList<Person> people = new ArrayList<>();
        
        for (int countPerson=0;countPerson<50; countPerson++) {
            gender =randomGender(genders);
            year= randomYear(currentYear);
            month=randomMonth(totalMonthsYear);
            day=randomDayOfMonth(year, month);
            LocalDate birthdate = LocalDate.of(year, month, day);
            Person person = new Person(gender, birthdate);
            people.add(person);
        }
       

        return people;
    }

    private static int randomMonth(int totalMonthsYear) {
        int month;
        month=(int)(Math.random() * totalMonthsYear) + 1;
        return month;
    }

    private static int randomYear(int currentYear) {
        int year;
        int yearInitial = 1980;
        year = 1980 + (int)(Math.random()*(currentYear - yearInitial + 1));
        return year;
    }

    private static String randomGender(String[]genders) {
        String gender;
        gender = genders[(int)(Math.random()* genders.length)];
        return gender;
    }

    private static int randomDayOfMonth(int year, int month) {
        YearMonth yearMonth = YearMonth.of(year, month);
        int daysInMonth = yearMonth.lengthOfMonth();
        return (int)(Math.random() * daysInMonth) + 1;
    }
}
