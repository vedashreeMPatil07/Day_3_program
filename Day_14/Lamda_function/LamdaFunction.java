package Lamda_function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaFunction {
    public static void main(String[] args) {
         ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(31);

        arrayList.forEach(n -> {
            if (n % 10 == 0) {
                System.out.println("num is devisible by 10 : " +n);
            }
        });
System.out.println( );
        arrayList.forEach(n -> System.out.println("print all : " +n));

        List<Person> people = Arrays.asList(
            new Person("shri", 20),
            new Person("shri2", 15),
            new Person("shri3", 23)
        );

        List<Person> filteredList = people.stream()
            .filter(person -> person.getAge() > 18)
            .collect(Collectors.toList());
            System.out.println( "person:" );

        filteredList.forEach(System.out::println);
        List<Integer> ages = people.stream()
            .map(Person::getAge)
            .collect(Collectors.toList());
System.out.println("ages print : ");
        ages.forEach(System.out::println);

        int totalAge = people.stream()
            .map(Person::getAge)
            .reduce(0, Integer::sum);

        System.out.println("Total age: " + totalAge);
    }
    
}
