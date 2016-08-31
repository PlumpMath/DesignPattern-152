
public abstract class AbstractTestList {

    abstract String getTestValue(int index);
    abstract void setTestValue(int index, String value);
    abstract boolean addTestValue(String value);
    abstract boolean addIndexTestValue(int index, String value);
    abstract boolean removeTestValue(int index);
    abstract boolean removeTestObject(String string);
    abstract boolean addOnZeroElem(String string);
    abstract boolean addOnEndElem(String string);

}
