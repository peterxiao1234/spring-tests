import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.util.List;

/**
 * Created by peter.xiao on 10/4/2018.
 */
public class StudentJDBCTemplate implements StudentDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        System.out.println("in setDataSource");
    }

    public void create(String name, Integer age) {
        String SQL = "insert into Student (name, age) VALUES (?, ?)";
        jdbcTemplate.update(SQL, name, age);
        System.out.println("Created record with name=" + name);
        return;
    }

    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = "+ id;
        Student student = jdbcTemplate.queryForObject(SQL, new StudentMapper());
        //Could use new Integer[]{id} for if all the arguments are integer object
//        Student student = jdbcTemplate.queryForObject(SQL, new Integer[]{id}, new StudentMapper());
        System.out.println("in getStudent: " + student.getName());
        return student;
    }

    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List<Student> students = jdbcTemplate.query(SQL, new StudentMapper());
        System.out.println("in listStudents!");
        return students;
    }

    public void delete(Integer id) {
        String SQL = "delete from Student where id=?";
        jdbcTemplate.update(SQL, id);
        System.out.println("in delete!");
    }

    public void update(Integer id, Integer age) {
        String SQL = "update Student set age=? where id="+id;
        jdbcTemplate.update(SQL, age);
        System.out.println("in update!");
    }
}
