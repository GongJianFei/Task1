package main.java.com.Rjdbc.Dao;

import main.java.com.Rjdbc.bean.Student;

public interface StudentDAO {
    Student queryByID(long id);       //查询
    public void update(Student stu);  //更新
    public void delete(long id);      //删除
    public void add(Student stu);     //增加

}
