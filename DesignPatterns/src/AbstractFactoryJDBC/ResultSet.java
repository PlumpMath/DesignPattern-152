package AbstractFactoryJDBC;

public interface ResultSet {

    boolean next();

    int getInt(int index);

    String getString(int index);

    Double getDouble(int index);
}

class Test2{

    public static void main(String[] args) {
        ResultSet rs= null;
        while(rs.next()){
            int age = rs.getInt(1);
            String name = rs.getString(2);
        }
    }
}