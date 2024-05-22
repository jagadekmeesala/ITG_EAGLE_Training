public class VariableScopeDemo {
    static int instanceVar = 10;
    public static void main(String[] args) {
        int localVarMain = 20;
        System.out.println("Instance variable within main method: " + instanceVar);
        System.out.println("Local variable within main method: " + localVarMain);
        method1();
    }
    static void method1() {
        int localVarMethod1 = 30;
        System.out.println("Instance variable within method1: " + instanceVar);
        System.out.println("Local variable within method1: " + localVarMethod1);
        method2();
    }
    static void method2() {
        System.out.println("Instance variable within method2: " + instanceVar);
    }
}
