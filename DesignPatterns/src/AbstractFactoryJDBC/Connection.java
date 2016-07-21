package AbstractFactoryJDBC;


import java.sql.CallableStatement;

public interface Connection {
    public Statement createStatement();

    public PreparedStatement prepareStatement(String url);

    public CallableStatement prepareCall(String url);

}
