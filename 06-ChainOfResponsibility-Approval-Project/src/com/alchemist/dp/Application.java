package com.alchemist.dp;

public class Application {
    public static void main(String[] args) {
        LeaveHandler tl = new TeamLead();
        LeaveHandler mgr = new Manager();
        LeaveHandler dir = new Director();
 
        tl.setNext(mgr);
        mgr.setNext(dir);
 
        tl.approveLeave(7);
    }
}
