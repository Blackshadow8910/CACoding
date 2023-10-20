package interface_adapter.clear_users;

import interface_adapter.ViewManagerModel;
import interface_adapter.clear_users.ClearState;
import interface_adapter.clear_users.ClearViewModel;
import use_case.clear_users.ClearOutputBoundary;
import use_case.clear_users.ClearOutputData;
import view.SignupView;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class ClearPresenter implements ClearOutputBoundary {
    private final ClearViewModel clearViewModel;
    private ViewManagerModel viewManagerModel;
    private SignupView signupView;

    public ClearPresenter(ViewManagerModel viewManagerModel,
                           ClearViewModel clearViewModel,
                           SignupView signupView) {
        this.viewManagerModel = viewManagerModel;
        this.clearViewModel = clearViewModel;
        this.signupView = signupView;
    }

    @Override
    public void prepareSuccessView(ClearOutputData response) {
        JOptionPane.showMessageDialog(signupView, response.getClearedUserString());
    }

    @Override
    public void prepareFailView(String error) {
    }
}
