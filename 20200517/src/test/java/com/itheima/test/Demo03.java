package com.itheima.test;

import com.itheima.dao.AccountDao;
import com.itheima.dao.RoleDao;
import com.itheima.domain.Account;
import com.itheima.domain.Role;
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
import java.util.List;

/**
 * @Description:
 * @PackageName: com.itheima.test
 * @ClassName: Demo01
 * @Author: NH on 2020/5/17:15:51
 */
public class Demo03 {
    InputStream resourceAsStream=null;
    SqlSessionFactoryBuilder sqlSessionFactoryBuilder=null;
    SqlSessionFactory sqlSessionFactory=null;
    SqlSession sqlSession=null;
    RoleDao roleDaoMapper =null;
    @Before
    public void init() throws IOException {
        resourceAsStream = Resources.getResourceAsStream("SqlMapperConfig.xml");
        sqlSessionFactoryBuilder=new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession();
        roleDaoMapper = sqlSession.getMapper(RoleDao.class);
    }

    @After
    public  void destory() throws IOException {
        sqlSession.commit();
        resourceAsStream.close();
        sqlSession.close();
    }

    /**
     * 方法描述：联合查询
     * @param
     * @return void
     * @author NH
     * @date 2020/5/18:16:29
     */
    @Test
   public void test01(){
        List<Role> all = roleDaoMapper.findAll();
        for (Role role : all) {
            System.out.println(role);
            List<User> user = role.getUser();
            for (User user1 : user) {
                System.out.println("user:"+user1);
            }
        }
    }
}
