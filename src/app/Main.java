package app;

import app.dataprovider.DataProvider;
import app.handler.DataHandler;
import app.user.User;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        List<User> userList = new DataProvider().getAllUsersData();

        handler.printAllUsers(userList);
        handler.printFilteredUsers(userList);
    }
}
