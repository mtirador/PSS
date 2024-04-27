package com.task22;

import java.util.ArrayList;

public class PersonController {
    private ArrayList<Person> people;

    public PersonController(ArrayList<Person> people) {
        this.people = people;
    }

    public int countLegalAge() {
        int count=0,legalAge=18;
        try {
            for(Person person : people) {
                if(person.getAge()>=legalAge) {
                    count++;
                }
            }
        } catch (Exception e) {
           System.out.println("Error... Something went wrong");
        }
        
        return count;
    }

    public int countMinors() {
        int count=0,legalAge=18;
        try {
            for (Person person : people) {
                if(person.getAge()<legalAge) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error... something went wrong");
        }
        
        return count;
    }

    public int countMaleLegalAge() {
        int count = 0,legalAge=18;
        try {
            for (Person person : people) {
                if(person.getAge()>=legalAge && person.getGender().equals("Male")) {
                    count++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error... somenthing went wrong");
        }
        
        return count;
    }

    public int countFemaleMinors() {
        int count = 0,legalAge=18;
        try {
            for (Person person : people) {
                if(person.getAge()<legalAge && person.getGender().equals("Female")) {
                    count++;
                }
            }
        } catch (Exception e) {
           System.out.println("Error...something went wrong");
        }
        
        return count;
    }

    public double calculateLegalAgePercentage() {
        try {
            if(people.isEmpty()){
            return 0.0;
            }
        } catch (Exception e) {
           System.out.println("Error... something went wrong");
        }
        
        return ((double)countLegalAge()/people.size()*100);
    }

    public double calculateFemalePercentage() {
        if(people.isEmpty()){
            return 0.0;
        }
        int  totalCountFemale=0;
        try {
            for (Person person2 : people) {
                if(person2.getGender().equals("Female")){
                    totalCountFemale++;
                }
            }
        } catch (Exception e) {
           System.out.println("Error...something went wrong");
        }
          
        return ((double)totalCountFemale/people.size())* 100; 
    }
    
}
