package use_case.clear_users;

import java.util.Collection;

import entity.User;

public interface ClearUserDataAccessInterface {
    void clear();
    Collection<User> listUsers();
}
