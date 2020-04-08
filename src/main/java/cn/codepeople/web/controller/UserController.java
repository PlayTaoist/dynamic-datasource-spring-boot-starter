package cn.codepeople.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.codepeople.web.entity.Log;
import cn.codepeople.web.entity.User;
import cn.codepeople.web.service.LogService;
import cn.codepeople.web.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
@Api(value = "动态数据源测试接口")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private LogService logService;
	
	@ApiOperation(value = "添加用户", nickname = "添加用户接口", notes = "入参是复杂对象", produces = "application/json")
	@PostMapping("/user/insert")
	public int insert(@RequestBody User user) {
		return userService.insertUser(user);
	}
	
	@ApiOperation(value = "添加日志", nickname = "添加日志接口", notes = "入参是复杂对象", produces = "application/json")
	@PostMapping("/log/insert")
	public int insert(@RequestBody Log log) {
		return logService.insertLog(log);
	}
}
