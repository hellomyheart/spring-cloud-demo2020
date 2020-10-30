package cn.hellomyheart.spring.cloud.demo2020.provider.service.impl;

import cn.hellomyheart.spring.cloud.demo2020.common.vo.ResponseResult;
import cn.hellomyheart.spring.cloud.demo2020.provider.dao.UserDao;
import cn.hellomyheart.spring.cloud.demo2020.provider.entity.User;
import cn.hellomyheart.spring.cloud.demo2020.provider.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description
 * @className: UserServiceImpl
 * @package: cn.hellomyheart.spring.cloud.demo2020.provider.service.impl
 * @author: Stephen Shen
 * @date: 2020/10/30 上午8:34
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public ResponseResult all() {
        return new ResponseResult(20000,userDao.findAll());
    }

    @Override
    public ResponseResult saveAll(int count) {
        List<User> list=new ArrayList<>(count);
        for (int i=1;i<=count;i++){
            list.add(new User("2020-"+i,"批量添加-"+i,"2020",1));
        }
        userDao.saveAll(list);
        return new ResponseResult(20000,"批量新增成功");
    }
}
