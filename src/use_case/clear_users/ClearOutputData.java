package use_case.clear_users;

import java.util.Collection;

import entity.User;

public class ClearOutputData {
    private boolean success;
    private Collection<User> clearedUsers;

    public ClearOutputData(boolean result, Collection<User> users) {
        success = result;
        clearedUsers = users;
    }

    public boolean isSuccess() {
        return success;
    }

    public Collection<User> getClearedUsers() {
        return clearedUsers;
    }

    public String getClearedUserString() {
        StringBuilder result = new StringBuilder();
        for (User user : clearedUsers) {
            result.append(user.getName());
            result.append("\n");
        }
        return result.toString();
    }
}
