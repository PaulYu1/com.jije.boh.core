package com.jije.boh.core.service;


import java.util.Date;
import org.springframework.stereotype.Component;

import com.jije.boh.core.service.inter.IOperateService;

public class OperateService implements IOperateService {

	public String getDate() {
		return new Date().toString();
	}
}
