package test.main.java.com.Rjdbc.DAOIMPL; 

import main.java.com.Rjdbc.DAOIMPL.SudentIMPL;
import main.java.com.Rjdbc.Dao.StudentDAO;
import main.java.com.Rjdbc.bean.Student;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* SudentIMPL Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 26, 2017</pre> 
* @version 1.0 
*/ 
public class SudentIMPLTest { 
   private StudentDAO  studao = new SudentIMPL();
@Before
public void before() throws Exception {
    System.out.println("单元测试开始");
} 

@After
public void after() throws Exception {
    System.out.println("单元测试结束");
} 

/** 
* 
* Method: queryByID(long id) 
* 
*/ 
@Test
public void testQueryByID() throws Exception { 

          studao.queryByID(5);


} 

/** 
* 
* Method: update(Student stu) 
* 
*/ 
@Test
public void testUpdate() throws Exception {
    Student stu =new Student(6,"Benty",22);
    studao.update(stu);
} 

/** 
* 
* Method: delete(long id) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
studao.delete(5);
} 

/** 
* 
* Method: add(Student stu) 
* 
*/ 
@Test
public void testAdd() throws Exception {
    Student stu =new Student(5,"Jeff",25);
    studao.add(stu);
} 


} 
