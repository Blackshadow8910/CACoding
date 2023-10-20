package interface_adapter.clear_users;

import java.util.Collection;

import entity.User;

public class ClearState {
    private Collection<User> clearedUsers;

    public Collection<User> getClearedUsers() {
        return clearedUsers;
    }
        
    public void setClearedUsers(Collection<User> clearedUsers) {
        this.clearedUsers = clearedUsers;
    }
}
