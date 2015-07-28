package org.activitiscratchpad;

import org.activiti.engine.delegate.DelegateTask;

public class CreateEvent implements org.activiti.engine.delegate.TaskListener {

	public void notify(DelegateTask delegateTask) {
		System.out.println("Create Event");
	}
}
