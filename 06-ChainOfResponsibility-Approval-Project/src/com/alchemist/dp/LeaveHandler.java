package com.alchemist.dp;

public abstract class LeaveHandler {
    protected LeaveHandler next;
 
    public void setNext(LeaveHandler next) {
        this.next = next;
    }
 
    public abstract void approveLeave(int days);
}
 
class TeamLead extends LeaveHandler {
    @Override
    public void approveLeave(int days) {
        if (days <= 2) {
            System.out.println("Team Lead approved leave");
        } else if (next != null) {
            next.approveLeave(days);
        }
    }
}
 
class Manager extends LeaveHandler {
    @Override
    public void approveLeave(int days) {
        if (days <= 5) {
            System.out.println("Manager approved leave");
        } else if (next != null) {
            next.approveLeave(days);
        }
    }
}
 
class Director extends LeaveHandler {
    @Override
    public void approveLeave(int days) {
        if (days <= 10) {
            System.out.println("Director approved leave");
        } else {
            System.out.println("Leave too long — rejected");
        }
    }
}
 
