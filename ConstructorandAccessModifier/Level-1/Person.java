public class Person {
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    //Copy Constructor
    Person(Person other)
    {
        this.name = other.name;
        this.age = other.age;
    }
}
