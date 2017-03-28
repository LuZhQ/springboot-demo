package com.yfwl.yfpay.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.yfwl.yfpay.domain.TestStock;
import com.yfwl.yfpay.mapper.TestStockMapper;
import com.yfwl.yfpay.service.TestStockService;

@Configuration
public class TestStockServiceImpl implements TestStockService {

	@Autowired
	private TestStockMapper testStockMapper;
	
	@Override
	public TestStock getTest() {
		// TODO Auto-generated method stub
		return testStockMapper.getTest();
	}

}
