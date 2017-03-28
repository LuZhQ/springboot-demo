package com.yfwl.yfpay.controller;

import io.swagger.annotations.ApiOperation;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yfwl.yfpay.domain.TestStock;
import com.yfwl.yfpay.service.TestStockService;

@RestController
@RequestMapping("/test")
public class TestStockController {
	
	@Autowired
	private TestStockService testStockService;
	
	@ApiOperation(value="测试接口", notes="")
	@RequestMapping(value ="/1",method = RequestMethod.GET)
	public Map<String ,Object> getTest(){
		Map<String,Object> map = new HashMap<String,Object>();
		TestStock ts = testStockService.getTest();
		map.put("data", ts);
		return map;
	}

}
