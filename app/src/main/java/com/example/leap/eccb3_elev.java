package com.example.leap;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link eccb3_elev.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link eccb3_elev#newInstance} factory method to
 * create an instance of this fragment.
 */
public class eccb3_elev extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_eccb1_elev, container, false);
    }

    public eccb3_elev(){


    }

}