package com.gitnavi.springboot.springbootsimpledemo.pojo.entity;

import java.util.Date;

import com.gitnavi.springboot.springbootsimpledemo.pojo.entity.enums.DeleteEnum;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel("用户对象")
@Data
public class SysUser extends SuperEntity<SysUser> {

	private static final long serialVersionUID = 8514016091254814311L;

	private String id;

	private Date createDate;

	@ApiModelProperty("用户登录名")
	private String loginName;

	@ApiModelProperty("用户邮箱")
	private String email;

	@ApiModelProperty("是否删除")
	private DeleteEnum deleteEnum;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public DeleteEnum getDeleteEnum() {
		return deleteEnum;
	}

	public void setDeleteEnum(DeleteEnum deleteEnum) {
		this.deleteEnum = deleteEnum;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

}