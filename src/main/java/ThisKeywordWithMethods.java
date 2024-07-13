public class ThisKeywordWithMethods {
    private final String name;

    public ThisKeywordWithMethods(String name) {
        this.name = name;
    }

    public void printMessage(){
        System.out.println("Hello, " + this.name + "!");//`this` keyword isn't necessary, but it gives clarity
    }
    public void greet(){
        this.printMessage();//`this` keyword isn't necessary, but it gives clarity
    }

    public static void main(String[] args) {
        ThisKeywordWithMethods myObj = new ThisKeywordWithMethods("Tek");
        myObj.greet();
    }
}