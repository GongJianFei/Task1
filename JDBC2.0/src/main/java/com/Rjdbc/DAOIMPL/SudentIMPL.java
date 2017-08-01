package main.java.com.Rjdbc.DAOIMPL;



import java.sql.*;

import main.java.com.Rjdbc.Dao.StudentDAO ;
import main.java.com.Rjdbc.bean.Student ;
import main.java.com.Rjdbc.Util.JDBCutil ;


public class SudentIMPL implements StudentDAO {

    public SudentIMPL(){};
    public Student queryByID(long id) {
        Connection conn= null;
        PreparedStatement ps = null;
        ResultSet rs=null;

        String sql ="SELECT * FROM t_student WHERE id = ?";
        conn =JDBCutil.jdbcGetConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            rs =ps.executeQuery();
            if(rs != null){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCutil.jdbcclose(rs,ps,conn);
        }return null;
    }


    public void update(Student stu) {
        Connection conn= null;
        PreparedStatement ps = null;

        String sql ="UPDATE t_student SET name = ?,age = ? WHERE id=?";
        conn =JDBCutil.jdbcGetConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, stu.getName());
            ps.setInt(2,stu.getAge());
            ps.setLong(3,stu.getId());
            ps.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCutil.jdbcclose(null,ps,conn);
        }
    }


    public void delete(long id) {
        Connection conn= null;
        PreparedStatement ps = null;

        String sql ="DELETE FROM t_student WHERE id=?";
        conn =JDBCutil.jdbcGetConnection();
        try {
            conn = JDBCutil.jdbcGetConnection();
            ps = conn.prepareStatement(sql);
            ps.setLong(1, id);
            ps.executeUpdate();

        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCutil.jdbcclose(null,ps,conn);
        }
    }

    public void add(Student stu) {
        Connection conn= null;
        PreparedStatement ps = null;

        String sql ="INSERT INTO t_student (name,age) VALUES (?,?)";
        conn =JDBCutil.jdbcGetConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,stu.getName());
            ps.setLong(2, stu.getAge());
            ps.executeUpdate();
            System.out.println(stu.getId());
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            JDBCutil.jdbcclose(null,ps,conn);
        }
    }

}
