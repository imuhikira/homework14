package edu.dmacc.codedsm.homework14;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Task task1 = new Task(1,"church","April 07 2019: 07:00 AM","April 01 2019: 09:30 AM","running",1,"playing");
        List<Task> Tasks = new ArrayList<>();
        Tasks.add(task1);
        User user1 = new User("Ismael","Male", Tasks);
        List<User> users = new ArrayList<>();
        users.add(user1);
        System.out.println(user1.toString());

    }
}
