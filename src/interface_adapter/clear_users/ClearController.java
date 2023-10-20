package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import use_case.clear_users.ClearInputBoundary;
import use_case.clear_users.ClearInputData;
import use_case.clear_users.ClearInteractor;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearUserDataAccessInterface;
import use_case.login.LoginInputData;
import view.SignupView;

public class ClearController {
    ClearInputBoundary clearUseCaseInteractor;
    public ClearController(ClearInputBoundary clearUseCaseInteractor) {
        this.clearUseCaseInteractor = clearUseCaseInteractor;
    }

    public void execute() {
        clearUseCaseInteractor.execute(new ClearInputData());
    }

    public static ClearController create(ViewManagerModel viewManagerModel, ClearViewModel clearViewModel, SignupView signupView, ClearUserDataAccessInterface userDataAccessObject) {
        ClearOutputBoundary clearOutputBoundary = new ClearPresenter(viewManagerModel, clearViewModel, signupView);

        ClearInputBoundary userClearInteractor = new ClearInteractor(
          userDataAccessObject, clearOutputBoundary
        );
        return new ClearController(userClearInteractor);
    }
}
