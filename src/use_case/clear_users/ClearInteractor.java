package use_case.clear_users;

import data_access.FileUserDataAccessObject;

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

    }
}
