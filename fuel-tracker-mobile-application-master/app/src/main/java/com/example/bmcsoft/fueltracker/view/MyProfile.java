package com.example.bmcsoft.fueltracker.view;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bmcsoft.fueltracker.R;

public class MyProfile extends Fragment {

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.view = inflater.inflate(R.layout.activity_my_profile,null);
        setProfile();
        return view;
    }

    private void setProfile(){

    }
}
