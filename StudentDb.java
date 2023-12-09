import java.sql.SQLException;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;


public class StudentDb {
    public static ConnectionSource connectDb() throws SQLException {
        ConnectionSource connect = new JdbcConnectionSource("jdbc:h2:~/test","sa", "");
        System.out.println("Подключение к базе прошло успешно");
        return connect;
    }
}
