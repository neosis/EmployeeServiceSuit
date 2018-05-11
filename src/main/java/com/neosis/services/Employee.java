package com.neosis.services;

public class Employee {
    private long id;
    private String firstName ;
    private String lastName ;
    private String employeeId;
    public Employee (String employeeId){
        this.employeeId = employeeId;
        if(!employeeId.equalsIgnoreCase("0")) {
            this.firstName = "First";
            this.lastName = "Last ";
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
