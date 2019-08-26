package com.iwacchi.bottomnaviviewfragment.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.iwacchi.bottomnaviviewfragment.R;

public class NotificationsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle savedInstanceState){

        super.onCreateView(layoutInflater, viewGroup, savedInstanceState);
        return layoutInflater.inflate(R.layout.notifications_fragment, viewGroup, false);

    }

    @Override
    public void onViewCreated(View view, Bundle saveInstanceState){

        super.onViewCreated(view, saveInstanceState);

    }

}
