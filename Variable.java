class Person {

    String name = "Java";
    int age = 20;
    double weight; 

    static int num = 5;

    public static void main(String[] args) {
        String firstName = "priya";
        System.out.println("Local variable firstName: " + firstName);
        System.out.println("Static variable num: " + Person.num);
        Person p1 = new Person(); 
        System.out.println("Instance variable name: " + p1.name);
        System.out.println("Instance variable age: " + p1.age);
        System.out.println("Instance variable weight : " + p1.weight);
    }
}
