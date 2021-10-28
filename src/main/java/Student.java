public class Student extends Person {
    // Instance variables:
    // firstName and lastName are already inherited
    private int classYear;

    // Constructors
    // A constructor that takes three parameters for the
    // firstName, lastName, and classYear
    // super(a,b) lets us call the constructor from the parent class
    // you can call super with different number of arguments depending on what constructor you want to call
    public Student(String a, String b, int c) {
        super(a, b);
        this.classYear = c;
    }

    // A constructor that assumes that a default student is a ninth-grader
    public Student(String a, String b) {
        super(a, b);
        this.classYear = 2025;
    }

    // A default/no-argument constructor
    public Student() {
        super("Jerry", "Seinfeld");
        this.classYear = 2024;
    }
     // @Override
    // doSomething() method
    // method overriding: the child class's method REPLACES the parent's
    public void doSomething() {
        System.out.println("I'm studying!");
    }

    // toString()
         @Override
    public String toString() {
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.classYear;
        return str;
    }



    // Getters
    // We've already inherited getFirstName() and getLastName()
    // so we only need to add getClassYear
    public int getClassYear() {
        return this.classYear;
    }

    // Setters
    public void setClassYear(int classYear) {
        this.classYear = classYear;
    }
}
