class Human {
    void walk()
    {
        System.out.println("walk() method of base class");
        System.out.println("Walking.");
    }
}
class Ram extends Human {
    void walk()
    {
        System.out.println("walk() method of derived class");
        System.out.println("Ram is walking.");
    }
}
class MethodOverriding {
    public static void main(String args[])
    {
        Ram d1 = new Ram();
        Human a1 = new Human();
        d1.walk();      
        a1.walk();
        Human one = new Ram();
        one.walk(); 
    }
}
