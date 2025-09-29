class Test {
    int value = 10;
    int x;
    public static void main(String[] args) {
        // find the value of x;
        Test t = new Test();
        System.out.println(t.x);
        System.out.println(t.value);

        // find the value or any error occur 
        int y;
        int newvalue = 20;
        try {
            // compile time error occur
            // System.out.println(y);
            System.out.println(newvalue);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Inside catch block");
        } finally {
            System.out.println("Finally will always run");
        }
    }
}