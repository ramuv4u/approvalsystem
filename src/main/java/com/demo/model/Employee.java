package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
    @Id
    public String id;
    public String name;
    public String status;
    public String requestId;
    public String escalate;
    public String manager;

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getEscalate() {
        return escalate;
    }

    public void setEscalate(String escalate) {
        this.escalate = escalate;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
