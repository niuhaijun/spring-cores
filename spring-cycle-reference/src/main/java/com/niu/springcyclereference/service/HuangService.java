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
public class HuangService {

	private NiuService niuService;

	public NiuService getNiuService() {

		return niuService;
	}

	@Autowired
	public void setNiuService(NiuService niuService) {

		this.niuService = niuService;
	}

	public void hello() {

		System.out.println("我是黄文君");
	}
}
