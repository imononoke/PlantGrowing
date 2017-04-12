package com.isa.growing;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

/**
 * Created by Izumi on 17/4/12.
 */

public class VarietyFragment extends Fragment {

    private GridView gridView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        //        return super.onCreateView(inflater, container, savedInstanceState);
        View view = inflater.inflate(R.layout.layout_variety, container, false);
        gridView = (GridView) view.findViewById(R.id.varietyGridView);

        return view;
    }

}
