package dev.java.design.pattern.behavioral.chainofresponse;

/**
 * 
 * Behavioral Design Patterns
 * 
 * Concerned with the interaction and responsibility of objects.
 * 
 * In these design patterns,the interaction between the objects should be in
 * such a way that they can easily talk to each other and still should be
 * loosely coupled.
 * 
 * 
 * @author karth
 *
 */
public class ChainOfResposibility {

	public final static String PRIORITY_LOW = "LOW";
	public final static String PRIORITY_MEDIYUM = "MEDIYUM";
	public final static String PRIORITY_HIGH = "HIGH";

	public static void main(String[] args) {

		WorkFlow wfObj = new WorkFlow();
		wfObj.assign(new Task(PRIORITY_LOW));
		wfObj.assign(new Task(PRIORITY_MEDIYUM));
		wfObj.assign(new Task(PRIORITY_LOW));

	}
}

class WorkFlow {

	ScrumMaster masterObj;

	public WorkFlow() {
		// create the chain of object created like
		// AuditorObject(ExecutiveObject(StaffObject(null)))
		masterObj = new Auditor(new Exceutive(new Staff(null)));
	}

	public void assign(Task taskObj) {
		masterObj.process(taskObj);
	}
}

abstract class ScrumMaster {

	private ScrumMaster masterObj;

	public ScrumMaster(ScrumMaster master) {
		this.masterObj = master;
	}

	public void process(Task taskObj) {
		// recursive calls the method unto level == null
		if (masterObj != null) {
			// process is a generic method for sub class of ScrumMaster class
			masterObj.process(taskObj);
		}
	}

}

class Task {
	private String priority;

	// Constructor Setter method
	public Task(String priority) {
		this.priority = priority;
	}

	// Get the priority values using this Getter method
	public String getPriority() {
		return priority;
	}

}

class Auditor extends ScrumMaster {

	public Auditor(ScrumMaster masterObj) {
		super(masterObj);
	}

	@Override
	public void process(Task priority) {
		// calls for the Auditor Obj intially and then goes like order, else block, pass
		// the prioroty valus ans call the other process method of the ScrumMaster
		if (priority.getPriority().equalsIgnoreCase(ChainOfResposibility.PRIORITY_HIGH)) {
			System.out.println("Task done by Audtior ---> " + priority.getPriority());
		} else {
			super.process(priority);
		}
	}

}

class Exceutive extends ScrumMaster {

	public Exceutive(ScrumMaster masterObj) {
		super(masterObj);
	}

	@Override
	public void process(Task priority) {
		if (priority.getPriority().equalsIgnoreCase(ChainOfResposibility.PRIORITY_MEDIYUM)) {
			System.out.println("Task done by Executive  ---> " + priority.getPriority());
		} else {
			super.process(priority);
		}
	}

}

class Staff extends ScrumMaster {

	public Staff(ScrumMaster taObj) {
		super(taObj);
	}

	@Override
	public void process(Task priority) {
		if (priority.getPriority().equalsIgnoreCase(ChainOfResposibility.PRIORITY_LOW)) {
			System.out.println("Task done by Staff  ---> " + priority.getPriority());
		} else {
			super.process(priority);
		}
	}

}