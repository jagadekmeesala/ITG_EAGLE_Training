public class VariableDemo {
    String instanceVariable = "This is an instance variable";

    public static void main(String[] args) {
        int localVar = 10;
        
        VariableDemo obj = new VariableDemo();
        
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + obj.instanceVariable);
        
        displayStaticVariable();
    }
    
    static String staticVariable = "This is a static variable";
    
    static void displayStaticVariable() {
        System.out.println("Static Variable: " + staticVariable);
    }
}
