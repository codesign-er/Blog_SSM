package tech.acodesigner.dao;

import tech.acodesigner.entity.User;

/**
 * Created by 77239 on 2017/3/28/0028.
 */
public interface UserDao {

    public User getUser(User user);

    public int saveUser(User user);

}