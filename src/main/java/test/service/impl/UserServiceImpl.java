package test.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import test.IDao.IUserDao;
import test.domain.User;
import test.service.IUserService;

/**
 * Created by yinmuyang on 17/5/21.
 */

@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource(name="userDao")
    private IUserDao userDao;


    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}
