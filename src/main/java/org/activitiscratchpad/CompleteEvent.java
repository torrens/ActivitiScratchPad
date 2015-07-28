package org.activitiscratchpad;

import org.activiti.engine.delegate.DelegateTask;

public class CompleteEvent implements org.activiti.engine.delegate.TaskListener {

	public void notify(DelegateTask delegateTask) {
		System.out.println("Complete Event");
	}
}
