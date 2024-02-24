package app.handler;

import app.output.Outputer;
import app.user.User;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class DataHandler {
    private Outputer outputer;

    public DataHandler() { this.outputer = new Outputer();}

    public void printAllUsers(List<User> userList) {
        outputer.getOutput("All users" + "\n-----------------------------------");
        int count = 0;
        for (User user : userList) {
            count++;
            outputer.getOutput(count + ") " + user);
        }
    }

    public void printFilteredUsers(List<User> userList) {
        Stream<User> allUsers = userList.stream();
        Stream<User> filteredUsers = allUsers.filter(str -> str.getEmail().contains("123"));
        AtomicInteger count = new AtomicInteger(1);
        outputer.getOutput("\nFiltered users ('123' in e-mail)" + "\n-----------------------------------");
        filteredUsers.forEach(user -> outputer.getOutput(count.getAndIncrement() + ") " + user));
    }
}
