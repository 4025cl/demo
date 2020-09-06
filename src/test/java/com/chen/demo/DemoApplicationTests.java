package com.chen.demo;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.chen.demo.mapper.UseMapper;
import com.chen.demo.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Arrays;
import java.util.List;
@SpringBootTest
class DemoApplicationTests {

    @Autowired
    private UseMapper userMapper;
    @Test
    void contextLoads() {
// 参数是一个 Wrapper ，条件构造器，这里我们先不用 null
// 查询全部用户
        List<User> users = userMapper.selectList(null);
        users.forEach(System.out::println);
    }
    //测试更新操作
    //测试返回的结果
    @Test
     void testUpdate()
    {
        User user = new User();
       user.setId(5L);
       user.setName("关注公众号：狂神说");
      user.setAge(18);
    // 注意：updateById 但是参数是一个 对象！
     int i = userMapper.updateById(user);
     System.out.println(i);
    }

    //测试查询
    //通过一条id的值来进行查询整个的值
    @Test
      public  void testSelectById()
    {
        User  user=userMapper.selectById(1);
        System.out.println(user);
    }


    //执行批量操作
    //通过多个值来进行查询
    @Test
      public  void   SelectByBatchId()
    {
        List<User>   user=userMapper.selectBatchIds(Arrays.asList(1,2,3));
        user.forEach(System.out::println);
    }

    @Test
    public   void   testPage()
    {
        //current 当前的页数
        //size   获取页面的大小
        // 通过参数直接进行来设置分页的相关情况
        Page<User>   page=new Page<>(1,2);
        userMapper.selectPage(page,null);
        page.getRecords().forEach(System.out::println);
    }
}
