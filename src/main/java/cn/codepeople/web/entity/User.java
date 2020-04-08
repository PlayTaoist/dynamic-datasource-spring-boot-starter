package cn.codepeople.web.entity;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ApiModel(value = "用户模型")
public class User {

	@ApiModelProperty(value = "id")
	private Long id;
	
	@ApiModelProperty(value = "userName")
	private String userName;
	
	@ApiModelProperty(value = "age")
	private Integer age;
	
	@ApiModelProperty(value = "createBy")
	private String createBy;
	
	@ApiModelProperty(value = "createTime")
	private Date createTime;
	
	@ApiModelProperty(value = "updateBy")
	private String updateBy;
	
	@ApiModelProperty(value = "updateTime")
	private Date updateTime;
	
	@ApiModelProperty(value = "remark")
	private String remark;
}
