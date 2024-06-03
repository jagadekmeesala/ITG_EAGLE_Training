class MethodOverloading {
    static int mul(int a, int b) { return a * b; }
    static int mul(int a, int b, int c)
    {
        return a * b * c;
    }

    public static void main(String args[])
    {
        System.out.println("mul() with 2 parameters");
        System.out.println(mul(4, 6));

        System.out.println("mul() with 3 parameters");
        System.out.println(mul(4, 6, 7));
    }
}
