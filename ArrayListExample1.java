class Test {
    void method1(){
        int arr[] = {21,32,56,22};
        System.out.println(arr[7]);
    }
    void method2(){
        method1();
    }

    void method3(){
        try {
            method2();
        } catch(ArrayIndexOutOfBoundsException ae) {
            System.out.println("Exception is caught");
        }
    }
    public static void main(String args[]) {
        Test obj = new Test();
        obj.method3();
    }
}

