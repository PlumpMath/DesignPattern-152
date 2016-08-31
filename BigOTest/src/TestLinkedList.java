import java.util.LinkedList;

public class TestLinkedList extends AbstractTestList {
    private LinkedList<String> testLinList = new LinkedList<>();

    static int numberOfElements = 100_000;

    public TestLinkedList() {
        for (int i = 0; i < numberOfElements; i++) {
            testLinList.add("A");
        }
    }
    public String getTestValue(int index){
        return testLinList.get(index);
    }

    @Override
    void setTestValue(int index, String value) {
        testLinList.set(index, value);
    }

    @Override
    boolean addTestValue(String value) {

        testLinList.add(value);
        return true;
    }

    @Override
    boolean addIndexTestValue(int index, String value) {
        testLinList.add(index,value);
        return true;
    }

    @Override
    boolean removeTestValue(int index) {
        testLinList.remove(index);
        return true;
    }

    @Override
    public String toString() {
        return "LinkedList";
    }
}
