package com.simplilearn.listener;

import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.simplilearn.event.SweetEvent;

@Component
public class AppListener {

	@EventListener
	public void contextStarted(ContextStartedEvent event) {
		System.out.println("Context started event occurred!");
	}
	
	@EventListener
	public void contextStarted1(ContextStartedEvent event) {
		System.out.println("Context started event occurred@@@@@!");
	}
	
	@EventListener
	public void shubham(SweetEvent event) {
		System.out.println("Shubham Received sweet!");
	}
	
	
	@EventListener
	public void bhargavi(SweetEvent event) {
		System.out.println("Bhargavi Received sweet!");
	}
	
	
	@EventListener
	public void pramita(SweetEvent event) {
		System.out.println("Pratima Received Sweet !");
	}
	
	
	@EventListener
	public void twarit(SweetEvent event) {
		System.out.println("Twarit Received Sweet!");
	}
	
	
	@EventListener
	public void contextStopped(ContextStoppedEvent event) {
		System.out.println("Context stopped event occurred@@@@@!");
	}
	
	
}
