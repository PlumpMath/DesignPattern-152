package AbstractFactoryJDBC;

public interface Statement {
    ResultSet executeQuery(String sql);
}
