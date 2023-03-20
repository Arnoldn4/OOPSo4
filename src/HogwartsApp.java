public class HogwartsApp {
    // list all attributes
    String firstName;
    String lastName;
    int age;

    // default constructor
    public HogwartsApp(){
        firstName = "Harry";
        lastName = "Potter";
        age = 12;
    }

    // parameterised constructor
    public HogwartsApp (String firstName, String lastName, int age) { // pass on parameters
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    // main methods
    public static void main(String[] args) {
        HogwartsApp student1 = new HogwartsApp();
        System.out.println(student1.firstName + " " + student1.lastName + " " + student1.age);

        HogwartsApp student2 = new HogwartsApp("Hermione", "Granger", 12);
        System.out.println(student2.firstName + " " + student2.lastName + " " + student2.age);

        HogwartsApp student11 = new HogwartsApp("Tony", "Stark", 54);
        System.out.println(student11.firstName + " " + student11.lastName + " " + student11.age);

        HogwartsApp student4 = new HogwartsApp("Draco", "Malfoy", 15 );
        System.out.println(student4.firstName + " " + student4.lastName + " " + student4.age);

        HogwartsApp student6 = new HogwartsApp("Greg", "Watson", 38);
        System.out.println(student6.firstName + " " + student6.lastName + " " + student6.age);

        HogwartsApp student3 = new HogwartsApp("Engelbert", "Humperdink", 76);
        System.out.println(student3.firstName + " " + student3.lastName + " " + student3.age);

        HogwartsApp student9 = new HogwartsApp("Goku", "dragonball", 500);
        System.out.println(student1.firstName + " " + student1.lastName + " " + student1.age);

        HogwartsApp student8 = new HogwartsApp("wICKED", "fAIRY", 12);
        System.out.println(student8.firstName + " " + student8.lastName + " " + student8.age);

        HogwartsApp student22 = new HogwartsApp("Ellen", "Books", 16);
        System.out.println(student22.firstName + " " + student22.lastName + " " + student22.age);

        HogwartsApp student12 = new HogwartsApp("Majakal", "Studentus", 120);
        System.out.println(student12.firstName + " " + student12.lastName + " " + student12.age);
    }
}





