import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class ArraysExercises {

    public static Person[] addPerson(Person[] stooges, Person newStooge) {
        Person[] newStooges = copyOf(stooges, stooges.length + 1);
        newStooges[newStooges.length - 1] = newStooge;
        return newStooges;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] stooge = new Person[3];
        stooge[0] = new Person("Moe");
        stooge[1] = new Person("Larry");
        stooge[2] = new Person("Curley");

        Person[] newStooges = addPerson(stooge, new Person("Shemp"));
        for (Person character : newStooges) {
            System.out.println(character.getName());
        }
    }
}
