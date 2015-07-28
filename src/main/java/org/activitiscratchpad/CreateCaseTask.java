package org.activitiscratchpad;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.JavaDelegate;

public class CreateCaseTask implements JavaDelegate {

	public void execute(DelegateExecution execution) {
		Case theCase = new Case();
		theCase.setId("One");
		execution.setVariable("case", theCase);
		System.out.println("Case Created");
	}
}
