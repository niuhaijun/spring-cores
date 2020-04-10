package com.niu.springcyclereference.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author niuhaijun
 * @date 2020-04-10 12:37
 * @version 1.0
 * @description: xxx
 */
@Service
public class NiuService {

	private HuangService huangService;

	public HuangService getHuangService() {

		return huangService;
	}

	@Autowired
	public void setHuangService(HuangService huangService) {

		this.huangService = huangService;
	}

	public void hello() {

		System.out.println("我是牛海军");
	}
}
