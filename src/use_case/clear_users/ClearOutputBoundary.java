package use_case.clear_users;

import use_case.clear_users.ClearOutputData;

public interface ClearOutputBoundary {
    void prepareSuccessView(ClearOutputData outputData);

    void prepareFailView(String error);
}
