package com.itheima.dao;

import com.itheima.domain.QuaryVo;
import com.itheima.domain.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description:
 * @PackageName: com.itheima.dao
 * @ClassName: UserDao
 * @Author: NH on 2020/5/17:15:37
 */
public interface UserDao {

    /**
     * 方法描述： 查询所有用户
     * @param
     * @return java.util.List<com.itheima.domain.User>
     * @author NH
     * @date 2020/5/18:10:38
     */
    List<User> findAll();


    /**
     * 方法描述：用户保存方法
     * @param user
     * @return void
     * @author NH
     * @date 2020/5/18:10:38
     */
    void saveUser(User user);


    /**
     * 方法描述：跟新数据
     * @param user
     * @return void
     * @author NH
     * @date 2020/5/18:10:48
     */
    void updateUser(User user);


    /**
     * 方法描述：根据Id删除用户
     * @param id
     * @return void
     * @author NH
     * @date 2020/5/18:11:01
     */
    void deleteUser(Integer id);

    /**
     * 方法描述：查询一条数据
     * @param id
     * @return com.itheima.domain.User
     * @author NH
     * @date 2020/5/18:11:09
     */
    User findOne(Integer id);


    /**
     * 方法描述：模糊查询
     * @param key
     * @return java.util.List<com.itheima.domain.User>
     * @author NH
     * @date 2020/5/18:11:10
     */
    List<User> findLike(String key);

    /**
     * 方法描述：返回用户总条数
     * @param
     * @return int
     * @author NH
     * @date 2020/5/18:11:20
     */
    int findTotle();

    /**
     * 方法描述：条件查询
     * @param user
     * @return java.util.List<com.itheima.domain.User>
     * @author NH
     * @date 2020/5/18:15:09
     */
    List<User> findTiaoJian(User user);

    /**
     * 方法描述：根据QuaryVo中的Ids集合查询信息
     * @param quaryVo
     * @return java.util.List<com.itheima.domain.User>
     * @author NH
     * @date 2020/5/18:15:22
     */
    List<User> findIds(QuaryVo quaryVo);


    /**
     * 方法描述：一对多 两张表联合查询
     * @param
     * @return java.util.List<com.itheima.domain.User>
     * @author NH
     * @date 2020/5/19:9:55
     */
    List<User> findByLianHe();
}
