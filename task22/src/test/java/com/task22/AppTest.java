package com.task22;


import static org.junit.Assert.assertEquals;


import java.time.LocalDate;
import java.util.ArrayList;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void checkLegalAgePerson()
    {
        ArrayList<Person>testPeople=new ArrayList<>();
        testPeople.add(new Person("Male",LocalDate.now().minusYears(20)));
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(25))); 
        PersonController peopleManager = new PersonController(testPeople);
    
        assertEquals(2, peopleManager.countLegalAge());
       
    }

    @Test
    public void checkMinorPerson(){
        ArrayList<Person>testPeople=new ArrayList<>();
        testPeople.add(new Person("Male",LocalDate.now().minusYears(10)));
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(15))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(25))); 
        PersonController peopleManager = new PersonController(testPeople);
        
        
        assertEquals(3, peopleManager.countMinors());
    }


    @Test
    public void checkMinorFemalePerson(){
        ArrayList<Person>testPeople=new ArrayList<>();
        testPeople.add(new Person("Male",LocalDate.now().minusYears(10)));
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(15))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(25))); 
        PersonController peopleManager = new PersonController(testPeople);
        
        
        assertEquals(1, peopleManager.countFemaleMinors());
    }


    @Test
    public void checkMaleLegalAge(){
        ArrayList<Person>testPeople=new ArrayList<>();
        testPeople.add(new Person("Male",LocalDate.now().minusYears(10)));
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(15))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(25))); 
        PersonController peopleManager = new PersonController(testPeople);
        
        
        assertEquals(0, peopleManager.countMaleLegalAge());
    }

    @Test
    public void checkPercentagePersonLegalAge(){
        ArrayList<Person> testPeople = new ArrayList<>();
        testPeople.add(new Person("Male", LocalDate.now().minusYears(30)));
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(15))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(25))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(15))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(25))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(25))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(25))); 
        PersonController peopleManager = new PersonController(testPeople);
        int countLegalPerson = 0;

        for (Person person : testPeople) {
           if(person.getAge() >= 18){
            countLegalPerson++;
           }
        }
 
        double testPercentage = ((double) countLegalPerson / testPeople.size()) * 100;
        double calculatedPercentage = peopleManager.calculateLegalAgePercentage();

        assertEquals(testPercentage, calculatedPercentage, 0.01); 
        
    }

    @Test
    public void checkPercentageFemale(){
        ArrayList<Person> testPeople = new ArrayList<>();
        testPeople.add(new Person("Male", LocalDate.now().minusYears(30)));
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(15))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(25))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(15))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(25))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(17))); 
        testPeople.add(new Person("Male", LocalDate.now().minusYears(25))); 
        testPeople.add(new Person("Female", LocalDate.now().minusYears(25))); 
        PersonController peopleManager = new PersonController(testPeople);
        int countWomen = 0;  double testPercentage,calculatedPercentage;

        for (Person person : testPeople) {
           if(person.getGender().equals("Female")){
            countWomen++;
           }
        }
 
        testPercentage = ((double) countWomen / testPeople.size()) * 100;
        calculatedPercentage = peopleManager.calculateFemalePercentage();

        assertEquals(testPercentage, calculatedPercentage, 0.01); 
        
    }
   
    @Test
    public void testEmptyList() {
        ArrayList<Person> emptyList = new ArrayList<>();
        PersonController peopleManager = new PersonController(emptyList);

        assertEquals(0, peopleManager.countLegalAge());
        assertEquals(0, peopleManager.countMinors());
        assertEquals(0, peopleManager.countMaleLegalAge());
        assertEquals(0, peopleManager.countFemaleMinors());
        assertEquals(0.0, peopleManager.calculateLegalAgePercentage(), 0.01);
        assertEquals(0.0, peopleManager.calculateFemalePercentage(), 0.01);
    }
    @Test
    public void testAllLegalAgeMale() {
        ArrayList<Person> listPeopleLegal = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listPeopleLegal.add(new Person("Male", LocalDate.now().minusYears(20)));
        }
        PersonController peopleManager = new PersonController(listPeopleLegal);

        assertEquals(10, peopleManager.countLegalAge());
        assertEquals(0, peopleManager.countMinors());
        assertEquals(10, peopleManager.countMaleLegalAge());
        assertEquals(0, peopleManager.countFemaleMinors());
        assertEquals(100.0, peopleManager.calculateLegalAgePercentage(), 0.01);
        assertEquals(0.0, peopleManager.calculateFemalePercentage(), 0.01);
    }

    @Test
    public void testAllLegalAgeFeMale() {
        ArrayList<Person> listPeopleLegal = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listPeopleLegal.add(new Person("Female", LocalDate.now().minusYears(20)));
        }
        PersonController peopleManager = new PersonController(listPeopleLegal);

        assertEquals(10, peopleManager.countLegalAge());
        assertEquals(0, peopleManager.countMinors());
        assertEquals(0, peopleManager.countMaleLegalAge());
        assertEquals(0, peopleManager.countFemaleMinors());
        assertEquals(100.0, peopleManager.calculateLegalAgePercentage(), 0.01);
        assertEquals(100.0, peopleManager.calculateFemalePercentage(), 0.01);
    }

    @Test
    public void testAllMinorsFeMale() {
        ArrayList<Person> listPeopleLegal = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listPeopleLegal.add(new Person("Female", LocalDate.now().minusYears(10)));
        }
        PersonController peopleManager = new PersonController(listPeopleLegal);

        assertEquals(0, peopleManager.countLegalAge());
        assertEquals(10, peopleManager.countMinors());
        assertEquals(0, peopleManager.countMaleLegalAge());
        assertEquals(10, peopleManager.countFemaleMinors());
        assertEquals(0, peopleManager.calculateLegalAgePercentage(), 0.01);
        assertEquals(100.0, peopleManager.calculateFemalePercentage(), 0.01);
    }
    @Test
    public void testAllMinors() {
        ArrayList<Person> allMinors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            allMinors.add(new Person("Female", LocalDate.now().minusYears(10)));
        }
        PersonController peopleManager = new PersonController(allMinors);

        assertEquals(0, peopleManager.countLegalAge());
        assertEquals(10, peopleManager.countMinors());
        assertEquals(0, peopleManager.countMaleLegalAge());
        assertEquals(10, peopleManager.countFemaleMinors());
        assertEquals(0.0, peopleManager.calculateLegalAgePercentage(), 0.01);
        assertEquals(100.0, peopleManager.calculateFemalePercentage(), 0.01);
    }

    @Test
    public void testAllSameGender() {
        ArrayList<Person> allSameGender = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            allSameGender.add(new Person("Male", LocalDate.now().minusYears(20)));
        }
        PersonController peopleManager = new PersonController(allSameGender);

        assertEquals(10, peopleManager.countLegalAge());
        assertEquals(0, peopleManager.countMinors());
        assertEquals(10, peopleManager.countMaleLegalAge());
        assertEquals(0, peopleManager.countFemaleMinors());
        assertEquals(100.0, peopleManager.calculateLegalAgePercentage(), 0.01);
        assertEquals(0.0, peopleManager.calculateFemalePercentage(), 0.01);
    }

   

}
