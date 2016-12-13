/**
 * Copyright 2016--2020 
 * Zhongtie Trimble Digital Engineering and Construction Co., Ltd
 *
 * @description 用户信息表数据库访问API
 *
 * @author dhu 
 * @date   2016年12月7日 下午1:44:43
 */
package cn.dennishucd.springjpahibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import cn.dennishucd.springjpahibernate.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
	@Query(name = "getMobielByUserName")
	Person getMobielByUserName(String userName);
}
