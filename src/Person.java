public class Person {
    private String name;

    //TODO: return the person's name
    public Person(String name) {
        this.name = name;
    }

    //TODO: change the name property to the passed value
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //TODO: print a message to the console using the person's name
    public void sayHello() {
        System.out.printf("Hello, I'm %s.%n", name);
    }

    public static void main(String[] args) {

//        The class should have a constructor that accepts a `String` value and sets
//        the person's name to the passed string.

        String personName = "Dean";
        Person person = new Person(personName);
        if (person.getName().equals(personName)) {
            person.sayHello();
        } else {
            System.out.println("not name");
        }

//        Create a `main` method on the class that creates a new `Person` object and
//        tests the above methods.

        personName = "Sam";
        person.setName(personName);
        if (person.getName().equals(personName)) {
            person.sayHello();
        } else {
            System.out.println("not name");
        }
        personName();
    }

    private static void personName() {

        Person person1 = new Person("Dean");
        Person person2 = new Person("Dean");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);


        person1 = new Person("Dean");
        person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Sam");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
