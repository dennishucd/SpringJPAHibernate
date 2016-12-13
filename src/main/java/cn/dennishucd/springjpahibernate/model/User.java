/**
 * Copyright 2016--2020 
 * Zhongtie Trimble Digital Engineering and Construction Co., Ltd
 *
 * @description 用户登录表
 *
 * @author dhu 
 * @date   2016年12月7日 下午1:44:43
 */
package cn.dennishucd.springjpahibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "userid", unique = true, nullable = false)
	private Integer userid;
	
	@Column(name = "login_name", unique = true, nullable = false)
	private String login_name;
	
	@Column(name = "login_passwd", unique = true, nullable = false)
	private String login_passwd;
	
	@Column(name = "createTime", unique = true, nullable = false)
	private Date createTime;
	
	@Column(name = "last_login", unique = true, nullable = true)
	private String last_login;
	
	@Column(name = "datastatus", unique = true, nullable = false)
	private Integer datastatus;

	public User() {
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getLogin_name() {
		return login_name;
	}

	public void setLogin_name(String login_name) {
		this.login_name = login_name;
	}

	public String getLogin_passwd() {
		return login_passwd;
	}

	public void setLogin_passwd(String login_passwd) {
		this.login_passwd = login_passwd;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	public Integer getDatastatus() {
		return datastatus;
	}

	public void setDatastatus(Integer datastatus) {
		this.datastatus = datastatus;
	}
}
