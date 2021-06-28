package cm.luoyingmm.dao;

import com.luoyingmm.dao.UserMapper;
import com.luoyingmm.pojo.User;
import com.luoyingmm.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserTest {
    @Test
    public void UserList(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> user = mapper.getUser();
        for (User user1 : user) {
            System.out.println(user1.toString());
        }
    }
}
