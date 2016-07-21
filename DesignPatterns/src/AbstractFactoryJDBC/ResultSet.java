package AbstractFactoryJDBC;

public interface ResultSet {

    boolean next();

    int getInt(int index);

    String getString(int index);

    Double getDouble(int index);
}
