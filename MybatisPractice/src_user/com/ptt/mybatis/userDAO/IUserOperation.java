package com.ptt.mybatis.userDAO;
import com.ptt.mybatis.model.User;

import java.util.List;

//接口实现了增删改查

public interface IUserOperation {
    public User selectUserByID(int id);//通过ID查询单个

    public List<User> selectUsers(String userName);//通过userName的匹配来查询一组

    public void addUser(User user);//插入一个User

    public void updateUser(User user);//更新一个User

    public void deleteUser(int id);//通过删除一个User
}