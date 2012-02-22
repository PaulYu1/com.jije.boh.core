package com.jije.boh.core.service;

import java.util.Date;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.jije.boh.core.service.inter.IOperateService;

@Component("operateService")
public class OperateService implements IOperateService {
	private CrudRepository _crudRepository;

	public CrudRepository getCrudRepository() {
		BundleContext context = Activator.getContext();
		ServiceReference<?> serviceReference = context
				.getServiceReference(CrudRepository.class.getName());
		CrudRepository dao = (CrudRepository) context
				.getService(serviceReference);
		return dao;
	}

	OperateService() {
		this._crudRepository = getCrudRepository();
	}

	public long getCount() {
		return _crudRepository.count();
	}

	public String getDate() {
		return new Date().toString() + "there are: " + getCount() + " records";
	}
}
