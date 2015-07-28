package org.activitiscratchpad;

import org.activiti.engine.delegate.DelegateTask;

public class CreateEvent implements org.activiti.engine.delegate.TaskListener {

	public void notify(DelegateTask delegateTask) {
		System.out.println("Create Event");
		Case theCase = (Case)delegateTask.getExecution().getVariable("case");
		System.out.println("Case ID: " + theCase.getId());
		System.out.println("Setting Notes");
		theCase.setNotes("Some Notes");
		delegateTask.getExecution().setVariable("case", theCase);
	}
}
