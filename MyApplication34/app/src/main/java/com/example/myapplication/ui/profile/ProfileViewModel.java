package com.example.myapplication.ui.profile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public void ProfileViewModelViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public ProfileViewModel(MutableLiveData<String> mText) {
        this.mText = mText;
    }

    public LiveData<String> getText() {
        return mText;
    }
}