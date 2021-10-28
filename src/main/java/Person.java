public class Person {
    private String FirstName;
    private String LastName;

public Person(String a, String b){
    this.FirstName=a;
    this.LastName=b;
}
public String getFirstName(){
    return this.FirstName;
}
public String getLastName(){
    return this.LastName;
}
public void setFirstName(String str){
    this.FirstName = str;
}
public void setLastName(String str) {
    this.LastName = str;
}
public void doSomething(){
    System.out.println("I am watching Netflix");
}
public String toString(){
    String str = (this.getFirstName() + " " + this.getLastName());
    return str;
}

}
