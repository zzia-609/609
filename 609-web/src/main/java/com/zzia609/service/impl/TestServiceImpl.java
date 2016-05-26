package com.zzia609.service.impl;

import org.springframework.stereotype.Service;

import com.zzia609.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Override
	public void test() {
		System.out.println(123);

	}

}
