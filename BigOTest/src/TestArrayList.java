import java.util.ArrayList;

public class TestArrayList extends AbstractTestList{

    private ArrayList<String> testArrList = new ArrayList<>();

    static int numberOfElements = 100_000;

    public TestArrayList() {
        for (int i = 0; i < numberOfElements; i++) {
            testArrList.add("A");
        }
    }


    public String getTestValue(int index){

        return testArrList.get(index);
    }

    @Override
    void setTestValue(int index, String value) {
        testArrList.set(index, value);
    }

    @Override
    boolean addTestValue(String value) {
        testArrList.add(value);
        return true;
    }

    @Override
    boolean addIndexTestValue(int index, String value) {
        testArrList.add(index,value);
        return true;
    }

    @Override
    boolean removeTestValue(int index) {
        testArrList.remove(index);
        return true;
    }

    @Override
    boolean removeTestObject(String string) {
        testArrList.remove(string);
        return true;
    }

    @Override
    boolean addOnZeroElem(String value) {
        testArrList.add(0,value);
        return true;
    }

    @Override
    boolean addOnEndElem(String string) {
        testArrList.add(numberOfElements-1,string);
        return true;
    }


    @Override
    public String toString() {
        return "ArrayList";
    }
}
