package org.edu.java;

import java.util.*;

/**
 * @author MaxJDev
 * Usage examples: Lambdas, Method Reference, Streams and Exception
 */

public class MainTest {
    public static void main(String[] args) {
        // Instantiating necessary classes
        Scanner scan = new Scanner(System.in);
        Set<PersonTest> setPersonTests = new HashSet<>();

        // Registered people counter for example of use
        int peopleAdded = 0;

        while (peopleAdded < 3) {
            System.out.println("<----- Add the " + (peopleAdded + 1) + "ª person ----->");
            System.out.println("Use a comma to separate the gender name in English (Male or Female)");
            System.out.println("example: Mary, Female");
            System.out.print("R: ");

            // Reading and separating
            String people = scan.nextLine();
            String[] parts = people.split(", ");

            // Checks if it contains name and gender
            if (parts.length == 2) {
                String name = parts[0];
                String gender = parts[1];

                setPersonTests.add(new PersonTest(name, gender));
            } else {
                throw new IllegalArgumentException("invalid format, fill in as follows: Name, Gender");
            }
            peopleAdded++;
        }
        scan.close();

        // Separates female people into a separate list
        List<PersonTest> femaleStream = filterFemaleNames(setPersonTests);

        // Formatted print
        System.out.println("**********************************************");
        System.out.println("-----> Female Persons <-----");
        femaleStream.forEach(s -> System.out.println("Name: " + s.getName() + " | Gender: " + s.getGender()));

        // Print Refs
        System.out.println("**********************************************");
        System.out.println("-----> Female Persons Refs <-----");
        femaleStream.forEach(System.out::println);
    }

    public static List<PersonTest> filterFemaleNames(Set<PersonTest> setPersonTests) {
        List<PersonTest> femaleStream = setPersonTests.stream()
                .filter(p -> p.getGender().trim().equalsIgnoreCase("female"))
                .toList();
        return femaleStream;
    }
}
