package dev.java.design.pattern.creational.factory;

/**
 * 
 * Creational Design Pattern
 * 
 * Cond: Based on the inputs, Object will create in the Factory class and can
 * access the methods of the respective class.
 * 
 */
public class FactoryDP {

	public static void main(String[] args) {
		NotificationFactory notifyFactory = new NotificationFactory();
		// it will create the object and access respective methods of
		// the class based on the inputs condition
		// it calls the nofifyUser method in SMSNotification class.
		notifyFactory.sendNotify("SMS").notifyUser();
	}

}

interface Notification {
	void notifyUser();
}

class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("SMS Notification");
	}

}

class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Email Notification");
	}

}

class NotificationFactory {

	public Notification sendNotify(String type) {

		Notification notify;
		switch (type) {
		case "SMS":
			notify = new SMSNotification();
			break;

		default:
			notify = new EmailNotification();
			break;
		}
		return notify;
	}
}