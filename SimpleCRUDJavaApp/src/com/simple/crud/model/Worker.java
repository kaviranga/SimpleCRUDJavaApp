package com.simple.crud.model;

public class Worker{
  
    private Long workerId;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public Worker(){
      
    }
  
    public void setWorkerId(Long workerId){
        this.workerId = workerId;
    }
  
    public Long getWorkerId(){
        return workerId;
    }
  
    public void setfirstName(String firstName){
        this.firstName = firstName;
    }
  
    public String getfirstName(){
        return firstName;
    }
  
    public void setlastName(String lastName){
        this.lastName = lastName;
    }
  
    public String getlastName(){
        return lastName;
    }
    
    public void setemailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
  
    public String getemailAddress(){
        return emailAddress;
    }
}
