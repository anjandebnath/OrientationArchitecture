package com.luseen.arch;

import android.arch.lifecycle.ViewModel;
import android.util.Log;

/**
 * Created by Chatikyan on 20.05.2017.
 */

public final class BaseViewModel<V extends BaseContract.View, P extends BaseContract.Presenter<V>>
        extends ViewModel {

    private P presenter;

    void setPresenter(P presenter) {
        if (this.presenter == null) {
            this.presenter = presenter;
        }
    }

    P getPresenter() {
        return this.presenter;
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        presenter.onPresenterDestroy();
        presenter = null;
    }
}
