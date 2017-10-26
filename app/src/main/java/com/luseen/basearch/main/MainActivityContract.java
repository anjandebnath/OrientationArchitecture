package com.luseen.basearch.main;


import com.luseen.arch.BaseContract;

/**
 * Created by Chatikyan on 20.05.2017.
 */

public interface MainActivityContract {

    interface View extends BaseContract.View {

        void showProgress();

        void hideProgress();

        void updateProgressPercentage(int percent);
    }

    interface Presenter extends BaseContract.Presenter<View> {

        void doSomethingAfterDelay(long delay);
    }
}
