package com.alchemist;

public interface ManageSubscriberAndNotifi {
	public void addSubscriber(NotifyCustomerInterface n);
	public void removeSubscriber(NotifyCustomerInterface n);
	public void notifyAllSubscribers(String tweet);
}
