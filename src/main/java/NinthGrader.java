public class NinthGrader extends Student  { // SOME CODE NEEDED IN THIS LINE
    public NinthGrader(String a, String b){
        super(a, b, 2025);
    }
    @Override
    public void doSomething(){
        System.out.println("I am preparing for a Harkness discussion!");
    }

    public String toString(){
        String str = this.getFirstName() + " " + this.getLastName() + ", " + this.getClassYear() + " (Ninth Grader)";
        return str;
    }
}
