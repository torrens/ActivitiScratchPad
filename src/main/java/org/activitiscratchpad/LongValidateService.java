package org.activitiscratchpad;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

import java.util.Date;

public class LongValidateService implements JavaDelegate {

	public void execute(DelegateExecution execution) throws Exception {
		Long isbn = (Long) execution.getVariable("isbn");
		System.out.println("received isbn " + isbn + " and going to sleep");
		Thread.sleep(2000);
		System.out.println("Back from sleep, setting validate time");
		execution.setVariable("validatetime", new Date());
	}
}
