package com.task22;

import java.time.LocalDate;

public class Person {
    private String gender;
    private LocalDate birthdate;

    public Person(){
        
    }

    public Person(String gender, LocalDate birthdate) {
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public int getAge() {
        //si son bisiestos o no tener en cuenta beetween

    
        return LocalDate.now().getYear() - birthdate.getYear();
    }

   
}
