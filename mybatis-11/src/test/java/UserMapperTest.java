import com.luoyingmm.dao.UserMapper;
import com.luoyingmm.pojo.User;
import com.luoyingmm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class UserMapperTest {
    @Test
    public void getUserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        SqlSession sqlSession2 = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        UserMapper mapper2 = sqlSession2.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user);
        sqlSession.close();

        User user1 = mapper2.getUser(1);
        System.out.println(user1);
        System.out.println(user.equals(user1));

        sqlSession2.close();
        sqlSession.close();
    }
}
