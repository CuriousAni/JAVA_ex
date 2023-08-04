package aaa;

class Person {
    private String name;
    private int age;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();

        // Set the name and age using the setter methods
        person.setName("John");
        person.setAge(30);

        // Get the name and age using the getter methods
        String name = person.getName();
        int age = person.getAge();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}