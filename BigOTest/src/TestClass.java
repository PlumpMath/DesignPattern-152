

public class TestClass {


    static TestArrayList testArr = new TestArrayList();
    static TestLinkedList testLin = new TestLinkedList();

    static int LIST_LENGTH = 100_000;
    static int OPERATION_COUNT = 100_000;

    public static void main(String[] args) {
        long arrayListTime, linkedListTime;


        arrayListTime = getTest(testArr);
        linkedListTime = getTest(testLin);
        System.out.println("Time diff a/l : " + arrayListTime / linkedListTime + " times");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        arrayListTime = setTest(testArr);
        linkedListTime = setTest(testLin);
        System.out.println("Time diff a/l : " + arrayListTime / linkedListTime + " times");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        arrayListTime = addTest(testArr);
        linkedListTime = addTest(testLin);
        System.out.println("Time diff a/l : " + arrayListTime / linkedListTime + " times");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        arrayListTime = removeIndexTest(testArr);
        linkedListTime = removeIndexTest(testLin);
        System.out.println("Time diff a/l : " + arrayListTime / linkedListTime + " times");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        arrayListTime = addIndexTest(testArr);
        linkedListTime = addIndexTest(testLin);
        System.out.println("Time diff a/l : " + arrayListTime / linkedListTime + " times");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        arrayListTime = removeObjectTest(testArr);
        linkedListTime = removeObjectTest(testLin);
        System.out.println("Time diff a/l : " + arrayListTime / linkedListTime + " times");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        arrayListTime = addZeroTest(testArr);
        linkedListTime = addZeroTest(testLin);
        System.out.println("Time diff a/l : " + arrayListTime / linkedListTime + " times");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


        arrayListTime = addEndTest(testArr);
        linkedListTime = addEndTest(testLin);
        System.out.println("Time diff a/l : " + arrayListTime / linkedListTime + " times");
        System.out.println("--------------------------------");
        System.out.println("--------------------------------");


    }


    public static long getTest(AbstractTestList list) {
        int elemIndex = LIST_LENGTH / 2;

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.getTestValue(elemIndex);
        }
        long endTime = System.currentTimeMillis();

        long time = endTime - startTime;
        System.out.println("\"get(index)\" test for " + list.toString() + " Time : " + time + " ms");

        return time;

    }

    public static long setTest(AbstractTestList list) {

        int elemIndex = LIST_LENGTH / 2;

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.setTestValue(elemIndex, "B");
        }

        long endTime = System.currentTimeMillis();


        long time = endTime - startTime;
        System.out.println("\"set(index,value)\" test for " + list.toString() + " Time : " + time + " ms");

        return time;
    }

    public static long addTest(AbstractTestList list) {

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.addTestValue("B");
        }

        long endTime = System.currentTimeMillis();


        long time = endTime - startTime;
        System.out.println("\"add()\" test for " + list.toString() + " Time : " + time + " ms");

        return time;


    }

    public static long addIndexTest(AbstractTestList list) {

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.addIndexTestValue(k, "A");
        }

        long endTime = System.currentTimeMillis();


        long time = endTime - startTime;
        System.out.println("\"add(index,value)\" test for " + list.toString() + " Time : " + time + " ms");

        return time;


    }

    public static long removeIndexTest(AbstractTestList list) {

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.removeTestValue(k);
        }

        long endTime = System.currentTimeMillis();


        long time = endTime - startTime;
        System.out.println("\"remove(index)\" test for " + list.toString() + " Time : " + time + " ms");

        return time;

    }

    private static long removeObjectTest(AbstractTestList list) {

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.removeTestObject("A");
        }

        long endTime = System.currentTimeMillis();


        long time = endTime - startTime;
        System.out.println("\"remove(object)\" test for " + list.toString() + " Time : " + time + " ms");

        return time;


    }

    public static long addZeroTest(AbstractTestList list){

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.addOnZeroElem("A");
        }

        long endTime = System.currentTimeMillis();

        long time = endTime - startTime;
        System.out.println("\"add(0,value)\" test for " + list.toString() + " Time : " + time + " ms");

        return time;


    }

    public static long addEndTest(AbstractTestList list){

        long startTime = System.currentTimeMillis();

        for (int k = 0; k < OPERATION_COUNT; k++) {
            list.addOnEndElem("A");
        }

        long endTime = System.currentTimeMillis();

        long time = endTime - startTime;
        System.out.println("\"add(N-1,value)\" test for " + list.toString() + " Time : " + time + " ms");

        return time;


    }
}
