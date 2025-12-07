package com.alchemist;

import java.util.ArrayList;
import java.util.List;

public class InsuranceCompany  implements ManageSubscriberAndNotifi{
	String name;
	InsuranceCompany(String name){
		this.name = name;
	}
	
	List<NotifyCustomerInterface> subscriberList = new ArrayList<>();
	
	@Override
	public void addSubscriber(NotifyCustomerInterface n) {
		subscriberList.add(n);
		
	}

	@Override
	public void removeSubscriber(NotifyCustomerInterface n) {
		subscriberList.remove(n);
		
	}

	@Override
	public void notifyAllSubscribers(String tweet) {
		subscriberList.forEach(f -> f.notification(tweet));
		
	}
	
	public void tweet(String tweet) {
		notifyAllSubscribers(tweet);
	}
	
}
