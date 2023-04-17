package dlte.spring.project.service;

import dlte.spring.project.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Service
public class RoleService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Role> readNames(String name,String pass){
        return jdbcTemplate.query("select * from role where username=? and password=?",new Object[]{name,pass},new RoleMapper());
    }


    public List<Role> listAll(){
        return jdbcTemplate.query("select * from role", new RoleMapper());
        }

        class RoleMapper implements RowMapper<Role> {
            @Override
                public Role mapRow(ResultSet rs, int rowNum) throws SQLException {
                    Role role = new Role();
                    role.setRole_id(rs.getInt("role_id"));
                    role.setUsername(rs.getString("username"));
                    role.setPassword(rs.getString("password"));
                    return role;
                }
            }
        }
