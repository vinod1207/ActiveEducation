package com.attentive.activeeducation.ui.college_module.fragment.school_backend;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.attentive.activeeducation.R;

/**
 * Created by vinod on 28/3/18.
 */

public class CollegeDashboardFragment extends Fragment {
    private View view;


    public static CollegeDashboardFragment newInstance(Bundle b) {
        CollegeDashboardFragment fragment = new CollegeDashboardFragment();
        fragment.setArguments(b);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.frag_school_dashboard, container, false);

        return view;
    }

}

