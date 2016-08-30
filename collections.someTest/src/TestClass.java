

public class TestClass {
    static TestArrayList testArr = new TestArrayList();
    static TestLinkedList testLin = new TestLinkedList();

    static int LIST_LENGTH = 100_000;
    static int OPERATION_COUNT = 100_000;

    public static void main(String[] args) {


        getTest(testArr);
        getTest(testLin);
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");
        setTest(testArr);
        setTest(testLin);
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


    }

    public static void getTest(AbstractTestList list){
        int elemIndex = LIST_LENGTH / 2;

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT ; k++ ) {
            list.getTestValue(elemIndex);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\"get\" test for "+list.toString()+" Time : " + (endTime - startTime)+" ms");

    }

    public static void setTest(AbstractTestList list){

        int elemIndex = LIST_LENGTH / 2;

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT ; k++ ) {
            list.setTestValue(elemIndex,"B");
        }
        long endTime = System.currentTimeMillis();

        System.out.println("\"set\" test for "+list.toString()+" Time : " + (endTime - startTime)+" ms");

    }

}
