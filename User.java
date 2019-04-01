package edu.dmacc.codedsm.homework14;

import java.util.List;

public class User {

    private String name;
    private String gender;
    private List<Task> Task;

    public User(String name, String gender, List<Task> task) {
        this.name = name;
        this.gender = gender;
        Task = task;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<Task> getTask() {
        return Task;
    }

    public void setTask(List<Task> task) {
        Task = task;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", Task=" + Task +
                '}';
    }
}
