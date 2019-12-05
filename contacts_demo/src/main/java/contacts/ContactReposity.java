package contacts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.swing.tree.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class ContactReposity {
    private JdbcTemplate jdbc;
    @Autowired
    public ContactReposity(JdbcTemplate jdbc){
        this.jdbc=jdbc;
    }
    public List<Contact> findAll(){
        return jdbc.query("select id,firstName,lastName,phoneNumber,emailAddress"+
                "from contracts order by lastName",new RowMapper<Contact>(){
            public Contact mapRow(ResultSet rs,int rowNum)
                throws SQLException{

            }
                }
        )
    }
}
