/**
 * 
 */
package com.jije.boh.core.web.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.jije.boh.core.service.inter.IOperateService;

import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

/**
 * @author Murphy
 * 
 */
@Controller
public class MainController {

	@Autowired
	private IOperateService operateService;

	@RequestMapping("/hello")
	public ModelAndView hello() {
//		BundleContext context = FrameworkUtil.getBundle(this.getClass())
//				.getBundleContext();
//		ServiceReference<?> serviceReference = context
//				.getServiceReference(IOperateService.class.getName());
//		IOperateService operateService = (IOperateService) context
//				.getService(serviceReference);
		String str = operateService.getDate();
		return new ModelAndView("hello", "date", str);
	}

}
