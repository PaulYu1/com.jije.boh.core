package com.jije.boh.core.service;

import java.util.Date;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.springframework.stereotype.Component;

import com.jije.boh.core.service.inter.IOperateJpaDao;
import com.jije.boh.core.service.inter.IOperateService;

@Component("operateService")
public class OperateService implements IOperateService {

	public String getDate() {
		BundleContext context = Activator.getContext();
		ServiceReference<?> serviceReference = context
				.getServiceReference(IOperateJpaDao.class.getName());
		IOperateJpaDao dao = (IOperateJpaDao) context
				.getService(serviceReference);
		dao.getList();
		return new Date().toString();
	}
}
