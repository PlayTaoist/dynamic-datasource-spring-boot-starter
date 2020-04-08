package cn.codepeople.web.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.dynamic.datasource.annotation.DS;

import cn.codepeople.web.entity.Log;
import cn.codepeople.web.mapper.LogMapper;
import cn.codepeople.web.service.LogService;
@Service
public class LogServiceImpl implements LogService {

	@Autowired
	private LogMapper logMapper;
	
	@Override
	@DS("slave")
	public int insertLog(Log log) {
		log.setLogName("log_name");
		log.setLogDetail("log_detail");
		log.setCreateBy("adminOK");
		log.setCreateTime(new Date());
		log.setUpdateBy("adminOK");
		log.setUpdateTime(new Date());
		return logMapper.insertVo(log);
	}

}
