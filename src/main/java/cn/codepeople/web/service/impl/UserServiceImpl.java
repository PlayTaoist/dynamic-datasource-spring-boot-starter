package cn.codepeople.web.service.impl;

import java.util.Date;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.codepeople.web.entity.User;
import cn.codepeople.web.mapper.UserMapper;
import cn.codepeople.web.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int insertUser(User user) {
		Random random=new Random();
		user.setAge(random.nextInt(90)+10);
		user.setUserName("管理员123");
		user.setCreateBy("adminOK");
		user.setCreateTime(new Date());
		user.setUpdateBy("adminOK");
		user.setUpdateTime(new Date());
		return userMapper.insertVo(user);
	}

}
