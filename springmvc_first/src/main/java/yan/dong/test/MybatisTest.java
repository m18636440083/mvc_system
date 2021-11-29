package yan.dong.test;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import yan.dong.dao.AccountDao;
import yan.dong.entity.Account;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MybatisTest {

    @Test
    public void testMybatis() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        AccountDao mapper = sqlSession.getMapper(AccountDao.class);
        List<Account> list = mapper.findAll();
        for (Account account : list) {
            System.out.println(account);
        }
        sqlSession.close();
    }
}
