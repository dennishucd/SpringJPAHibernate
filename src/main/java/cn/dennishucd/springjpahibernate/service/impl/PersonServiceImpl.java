package cn.dennishucd.springjpahibernate.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.dennishucd.springjpahibernate.model.Person;
import cn.dennishucd.springjpahibernate.repository.PersonRepository;
import cn.dennishucd.springjpahibernate.service.PersonService;

@Service
@Transactional
public class PersonServiceImpl implements PersonService {
	private Logger logger = Logger.getLogger(this.getClass());
	
	@Autowired
	private PersonRepository personRepository;

	public void sendSMS() {
		Person person = personRepository.getMobielByUserName("crtb9527");
		
		logger.info("mobile is "+person.getPerson_mobile());
	}
}
