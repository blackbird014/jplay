package com.example.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author MikeW
 */
public class ComparatorTest {

  public static void main(String[] args) {
   
    List<Person> personList = Person.createShortList();
  
    // Sort with Inner Class
    Collections.sort(personList, new Comparator<Person>(){
      public int compare(Person p1, Person p2){
        return p1.getSurName().compareTo(p2.getSurName());
      }
    });
    
    System.out.println("=== Sorted Asc SurName ===");
    personList.forEach(com.example.lambda.Person::print);
    
    // Use Lambda instead
    
    // Print Asc
    System.out.println("=== Sorted Asc SurName ===");
    Collections.sort(personList, (Person p1, Person p2) -> p1.getSurName().compareTo(p2.getSurName()));

    personList.forEach(com.example.lambda.Person::print);
    
    // Print Desc
    System.out.println("=== Sorted Desc SurName ===");
    Collections.sort(personList, (p1,  p2) -> p2.getSurName().compareTo(p1.getSurName()));

    personList.forEach(com.example.lambda.Person::print);
  }
}