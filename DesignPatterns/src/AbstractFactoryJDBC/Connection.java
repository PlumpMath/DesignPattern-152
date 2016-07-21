package AbstractFactoryJDBC;


import java.sql.CallableStatement;

public interface Connection {
    Statement createStatement();

    PreparedStatement prepareStatement(String url);

    CallableStatement prepareCall(String url);

}
