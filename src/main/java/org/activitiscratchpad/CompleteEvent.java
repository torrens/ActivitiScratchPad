package org.activitiscratchpad;

import org.activiti.engine.delegate.DelegateTask;

public class CompleteEvent implements org.activiti.engine.delegate.TaskListener {

	public void notify(DelegateTask delegateTask) {
		System.out.println("Complete Event");
		Case theCase = (Case)delegateTask.getExecution().getVariable("case");
		System.out.println("Case ID: " + theCase.getId());
		System.out.println("Getting Notes");
		System.out.println("Notes: " + theCase.getNotes());

	}
}
