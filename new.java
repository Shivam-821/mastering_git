class Test {
    int value = 10;
    int x;
    public static void main(String[] args) {
        // find the value of x;
        Test t = new Test();
        System.out.println(t.x);  // 0
        System.out.println(t.value);  // 10

        // find the value or any error occur 
        int y;
        int newvalue = 20;
        try {
            // compile time error occur
            // System.out.println(y); 
            System.out.println(newvalue); // 20
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("Inside catch block");
        } finally {
            System.out.println("Finally will always run"); // Finally will always run
        }
    }
}