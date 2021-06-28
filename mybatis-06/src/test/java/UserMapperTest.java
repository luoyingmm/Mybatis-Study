import com.luoyingmm.dao.UserMapper;
import com.luoyingmm.pojo.User;
import com.luoyingmm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;



public class UserMapperTest {
    static Logger logger = Logger.getLogger(UserMapperTest.class);
    @Test
    public void getUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void log4jTest(){
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
    }
}
