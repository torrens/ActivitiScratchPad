package org.activitiscratchpad;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class UserCaseTask implements JavaDelegate {

	public void execute(DelegateExecution execution) {
		System.out.println("User Case Task");
	}
}
