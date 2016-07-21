package AbstractFactoryJDBC;

public interface Statement {
    public ResultSet executeQuery(String sql);
}
