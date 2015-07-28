package org.activitiscratchpad;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import java.util.Date;

public class ValidateService implements JavaDelegate {
	
	@Override
	public void execute(DelegateExecution execution) {
		System.out.println("execution id " + execution.getId());
		Long isbn = (Long) execution.getVariable("isbn");
		System.out.println("received isbn " + isbn);
		execution.setVariable("validatetime", new Date());
	}
}
