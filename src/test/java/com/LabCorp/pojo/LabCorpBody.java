package com.LabCorp.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(value = "id",allowGetters = true)
public class LabCorpBody {

    private Integer createdAt;
    private String employeeFirstname;
    private String employeeLastname;
    private String employeePhonenumbe;
    private String ademployeeEmaildress;
    private String citemployeeAddressy;
    private String stateemployeeDevLevel;
    private String employeeGender;
    private String employeeHireDate;
    private Boolean employeeOnleave;
    private List<Object> techStack = null;
    private List<Object> project = null;

    private int Id;

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public String getEmployeeFirstname() {
        return employeeFirstname;
    }

    public void setEmployeeFirstname(String employeeFirstname) {
        this.employeeFirstname = employeeFirstname;
    }

    public String getEmployeeLastname() {
        return employeeLastname;
    }

    public void setEmployeeLastname(String employeeLastname) {
        this.employeeLastname = employeeLastname;
    }

    public String getEmployeePhonenumbe() {
        return employeePhonenumbe;
    }

    public void setEmployeePhonenumbe(String employeePhonenumbe) {
        this.employeePhonenumbe = employeePhonenumbe;
    }

    public String getAdemployeeEmaildress() {
        return ademployeeEmaildress;
    }

    public void setAdemployeeEmaildress(String ademployeeEmaildress) {
        this.ademployeeEmaildress = ademployeeEmaildress;
    }

    public String getCitemployeeAddressy() {
        return citemployeeAddressy;
    }

    public void setCitemployeeAddressy(String citemployeeAddressy) {
        this.citemployeeAddressy = citemployeeAddressy;
    }

    public String getStateemployeeDevLevel() {
        return stateemployeeDevLevel;
    }

    public void setStateemployeeDevLevel(String stateemployeeDevLevel) {
        this.stateemployeeDevLevel = stateemployeeDevLevel;
    }

    public String getEmployeeGender() {
        return employeeGender;
    }

    public void setEmployeeGender(String employeeGender) {
        this.employeeGender = employeeGender;
    }

    public String getEmployeeHireDate() {
        return employeeHireDate;
    }

    public void setEmployeeHireDate(String employeeHireDate) {
        this.employeeHireDate = employeeHireDate;
    }

    public Boolean getEmployeeOnleave() {
        return employeeOnleave;
    }

    public void setEmployeeOnleave(Boolean employeeOnleave) {
        this.employeeOnleave = employeeOnleave;
    }

    public List<Object> getTechStack() {
        return techStack;
    }

    public void setTechStack(List<Object> techStack) {
        this.techStack = techStack;
    }

    public List<Object> getProject() {
        return project;
    }

    public void setProject(List<Object> project) {
        this.project = project;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    @Override
    public String toString() {
        return "LabCorpBody{" +
                "createdAt=" + createdAt +
                ", employeeFirstname='" + employeeFirstname + '\'' +
                ", employeeLastname='" + employeeLastname + '\'' +
                ", employeePhonenumbe='" + employeePhonenumbe + '\'' +
                ", ademployeeEmaildress='" + ademployeeEmaildress + '\'' +
                ", citemployeeAddressy='" + citemployeeAddressy + '\'' +
                ", stateemployeeDevLevel='" + stateemployeeDevLevel + '\'' +
                ", employeeGender='" + employeeGender + '\'' +
                ", employeeHireDate='" + employeeHireDate + '\'' +
                ", employeeOnleave=" + employeeOnleave +
                ", techStack=" + techStack +
                ", project=" + project +
                ", Id=" + Id +
                '}';
    }
}
