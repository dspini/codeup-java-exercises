public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello, I'm %s.%n", name);
    }

    public static void main(String[] args) {

        String personName = "john";
        Person person = new Person(personName);
        if (person.getName().equals(personName)) {
            person.sayHello();
        } else {
            System.out.println("not name");
        }

        personName = "jane";
        person.setName(personName);
        if (person.getName().equals(personName)) {
            person.sayHello();
        } else {
            System.out.println("not name");
        }
        personName();
    }

    private static void personName() {

        Person person1 = new Person("John");
        Person person2 = new Person("John");
        System.out.println(person1.getName().equals(person2.getName()));
        System.out.println(person1 == person2);

        person1 = new Person("John");
        person2 = person1;
        System.out.println(true);

        person1 = new Person("John");
        person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
