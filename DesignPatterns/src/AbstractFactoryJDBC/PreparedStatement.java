package AbstractFactoryJDBC;

public interface PreparedStatement extends Statement {
    ResultSet executeQuery(String sql);
}
