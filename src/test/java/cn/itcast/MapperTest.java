package cn.itcast;

import cn.itcast.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 该类的作用:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MapperTest {
    @Autowired
    private UserService userService;
    @Test
    public void test(){
        List list = userService.findAll();
        System.out.println(list);
    }
}
