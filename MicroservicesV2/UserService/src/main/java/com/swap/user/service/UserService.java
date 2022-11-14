package com.swap.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.swap.user.VO.Department;
import com.swap.user.VO.ResponseTemplateVO;
import com.swap.user.entity.User;
import com.swap.user.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("Inside the saveUser method of UserService");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);
		
		Department dept = restTemplate.getForObject("http://department-service/departments/"+user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(dept);
		
		return vo;
	
	}
}
