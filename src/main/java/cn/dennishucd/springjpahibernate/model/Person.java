/**
 * Copyright 2016--2020 
 * Zhongtie Trimble Digital Engineering and Construction Co., Ltd
 *
 * @description 用户信息表
 *
 * @author dhu 
 * @date   2016年12月7日 下午1:44:43
 */
package cn.dennishucd.springjpahibernate.model;

import javax.persistence.Column;
import javax.persistence.NamedNativeQuery;
import javax.persistence.EntityResult;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.NamedNativeQueries;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

@NamedNativeQueries({
	@NamedNativeQuery(name = "getMobielByUserName", 
			query = "select a.* from person a, user b, rel_person_user c where b.login_name=? "
					+ "and b.userid=c.userid and c.personid = a.personid", 
			resultSetMapping = "returnPersonType")})
@SqlResultSetMappings({ @SqlResultSetMapping(name = "returnPersonType", 
entities = { @EntityResult(entityClass = Person.class) }) })

@Entity
@Table(name = "person")
public class Person {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "personid", unique = true, nullable = false)
	private Integer personid;
	
	@Column(name = "orgid", unique = true, nullable = true)
	private Integer orgid;
	
	@Column(name = "person_name", unique = true, nullable = false)
	private String person_name;
	
	@Column(name = "person_mobile", unique = true, nullable = false)
	private String person_mobile;
	
	@Column(name = "person_idcard", unique = true, nullable = true)
	private String person_idcard;
	
	@Column(name = "person_title", unique = true, nullable = true)
	private String person_title;

	public Person() {
	}

	public Integer getPersonid() {
		return personid;
	}

	public void setPersonid(Integer personid) {
		this.personid = personid;
	}

	public Integer getOrgid() {
		return orgid;
	}

	public void setOrgid(Integer orgid) {
		this.orgid = orgid;
	}

	public String getPerson_name() {
		return person_name;
	}

	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}

	public String getPerson_mobile() {
		return person_mobile;
	}

	public void setPerson_mobile(String person_mobile) {
		this.person_mobile = person_mobile;
	}

	public String getPerson_idcard() {
		return person_idcard;
	}

	public void setPerson_idcard(String person_idcard) {
		this.person_idcard = person_idcard;
	}

	public String getPerson_title() {
		return person_title;
	}

	public void setPerson_title(String person_title) {
		this.person_title = person_title;
	}
}
