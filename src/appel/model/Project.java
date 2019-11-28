package model;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author MyMac
 */
public class Project {


    private String name;
    private DateFormat startDate;
    private DateFormat enddate;
    private ArrayList<Milestone> milestones;
    private Status staus;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateFormat getStartDate() {
        return startDate;
    }

    public void setStartDate(DateFormat startDate) {
        this.startDate = startDate;
    }

    public DateFormat getEnddate() {
        return enddate;
    }

    public void setEnddate(DateFormat enddate) {
        this.enddate = enddate;
    }

    public ArrayList<Milestone> getMilestones() {
        return milestones;
    }

    public void setMilestones(ArrayList<Milestone> milestones) {
        this.milestones = milestones;
    }

    public Status getStaus() {
        return staus;
    }

    public void setStaus(Status staus) {
        this.staus = staus;
    }

    public Project(String name, DateFormat startDate, DateFormat enddate, ArrayList<Milestone> milestones, Status staus) {
        this.name = name;
        this.startDate = startDate;
        this.enddate = enddate;
        this.milestones = milestones;
        this.staus = staus;
    }

    public Project() {
        this.name = name;
        this.startDate = startDate;
        this.enddate = enddate;
        this.milestones = milestones;
        this.staus = staus;
    }


    public void updataStatus(Status status) {
        status = new Status();
        this.setStaus(staus);
    }

}

