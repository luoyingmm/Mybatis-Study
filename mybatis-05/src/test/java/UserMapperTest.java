import com.luoyingmm.dao.UserMapper;
import com.luoyingmm.pojo.User;
import com.luoyingmm.utils.MybatisUtils;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void UserTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUser(1);
        System.out.println(user.toString());
        sqlSession.close();
    }

    @Test
    public void UserLimitTest(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Integer> startIndex = new HashMap();
        startIndex.put("startIndex",1);
        startIndex.put("pageSize",2);
        List<User> userLimit = mapper.getUserLimit(startIndex);
        for (User user : userLimit) {
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void getRowBounds(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        RowBounds rowBounds = new RowBounds(1, 2);
        List<User> userList = sqlSession.selectList("com.luoyingmm.dao.UserMapper.getRowBounds",null,rowBounds);
        for (User user : userList) {
            System.out.println(user);
        }
        sqlSession.close();
    }
}
