package use_case.clear_users;

import java.util.Collection;

import data_access.FileUserDataAccessObject;
import entity.User;

public class ClearInteractor implements ClearInputBoundary {
    public ClearUserDataAccessInterface userDataAccessObject;
    public ClearOutputBoundary clearPresenter;
    public ClearInteractor(ClearUserDataAccessInterface userDataAccessInterface,
                           ClearOutputBoundary clearOutputBoundary) {
        userDataAccessObject = userDataAccessInterface;
        clearPresenter = clearOutputBoundary;
    }

    @Override
    public void execute(ClearInputData clearInputData) {
        Collection<User> users = userDataAccessObject.listUsers();
        
        userDataAccessObject.clear();
        System.out.println(users.size());

        ClearOutputData outputData = new ClearOutputData(true, users);

        clearPresenter.prepareSuccessView(outputData);
    }
}
