/**
 * Copyright 2016--2020 
 * Zhongtie Trimble Digital Engineering and Construction Co., Ltd
 *
 * @description 用户登录与信息表之间的关系
 *
 * @author dhu 
 * @date   2016年12月7日 下午1:44:43
 */
package cn.dennishucd.springjpahibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rel_person_user")
public class RelPersonUser {
	@Id
	@Column(name = "userid", unique = true, nullable = false)
	private Integer userid;
	
	@Column(name = "personid", unique = true, nullable = false)
	private Integer personid;
	
	public RelPersonUser() {
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public Integer getPersonid() {
		return personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}
}
