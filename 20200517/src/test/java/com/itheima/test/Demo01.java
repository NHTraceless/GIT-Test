package com.itheima.test;

import com.itheima.dao.UserDao;
import com.itheima.domain.QuaryVo;
import com.itheima.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Description:
 * @PackageName: com.itheima.test
 * @ClassName: Demo01
 * @Author: NH on 2020/5/17:15:51
 */
public class Demo01 {
    InputStream resourceAsStream=null;
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder=null;
    SqlSessionFactory sqlSessionFactory=null;
    SqlSession sqlSession=null;
    UserDao userDaoMapper=null;
    @Before
    public void init() throws IOException {
        resourceAsStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession();
        userDaoMapper = sqlSession.getMapper(UserDao.class);
    }

    @After
    public  void destory() throws IOException {
        sqlSession.commit();
        resourceAsStream.close();
        sqlSession.close();
    }


    @Test
    public void test01(){
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }
    }

    // 测试保存操作
    @Test
    public void test02(){
        User user=new User();
        user.setUsername("麻子2");
        user.setBirthday(new Date());
        user.setAddress("河南");
        user.setSex("女");
        System.out.println(user);
        userDaoMapper.saveUser(user);
        System.out.println(user);
    }
    // 测试更新
    @Test
    public void test03(){
        User user=new User();
        user.setId(49);
        user.setUsername("update2");
        user.setBirthday(new Date());
        user.setAddress("河南");
        user.setSex("女");
        userDaoMapper.updateUser(user);
    }

    // 测试删除
    @Test
    public void test04(){
        userDaoMapper.deleteUser(49);
    }

    // 查询一个
    @Test
    public void test05(){
        User one = userDaoMapper.findOne(48);
        System.out.println(one);
    }

    // 模糊查询
    @Test
    public void test06(){
        List<User> like = userDaoMapper.findLike("小");
        for (User user : like) {
            System.out.println(user);
        }
    }

    // 查询总记录数
    @Test
    public void test07(){
        int totle = userDaoMapper.findTotle();
        System.out.println(totle);
    }


    // 条件查询
    @Test
    public void test08(){
        User user=new User();
        user.setUsername("老王");
        List<User> tiaoJian = userDaoMapper.findTiaoJian(user);
        for (User user1 : tiaoJian) {
            System.out.println(user1);
        }
    }

    // 条件查询
    @Test
    public void test09(){
        QuaryVo quaryVo=new QuaryVo();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(41);
        list.add(42);
        list.add(43);
        quaryVo.setIds(list);
        List<User> tiaoJian = userDaoMapper.findIds(quaryVo);
        for (User user1 : tiaoJian) {
            System.out.println(user1);
        }
    }

    @Test
    public void test010(){
        List<User> byLianHe = userDaoMapper.findByLianHe();
        for (User user : byLianHe) {
            System.out.println(user);
        }
    }
}
