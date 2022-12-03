package com.example.SmartSensor.HomeScreen;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.example.SmartSensor.Batterylife;
import com.example.SmartSensor.MapsActivity;
import com.example.SmartSensor.R;
import com.example.SmartSensor.ReportActivity;
import com.example.SmartSensor.SupportActivity;
import com.example.SmartSensor.addrelative;
import com.example.SmartSensor.emergency;
import com.example.SmartSensor.helpline;
import com.example.SmartSensor.siren;

public class DashBoardFragment extends Fragment {


    Intent map;
    Intent battery;
    Intent siren;
    Intent sos;
    Intent contact;
    Intent helplines;
    Intent report;
    Intent supports;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.dashboard_fragment, container, false);
        map = new Intent(getActivity(), MapsActivity.class);
        final CardView cardView = root.findViewById(R.id.Location);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(map);
            }
        });

        battery = new Intent(getActivity(), Batterylife.class);
        final CardView cardView2 = root.findViewById(R.id.BatteryLife);

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(battery);
            }
        });


        siren = new Intent(getActivity(), siren.class);
        final CardView cardView3 = root.findViewById(R.id.siren);

        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(siren);
            }
        });



        sos = new Intent(getActivity(), emergency.class);
        final CardView cardView4 = root.findViewById(R.id.Panic);

        cardView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(sos);
            }
        });


        contact= new Intent(getActivity(), addrelative.class);
        final CardView cardView5 = root.findViewById(R.id.emergency_contact);

        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(contact);
            }
        });

        helplines= new Intent(getActivity(), helpline.class);
        final CardView cardView6 = root.findViewById(R.id.helpline_Contact);

        cardView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(helplines);
            }
        });

        report= new Intent(getActivity(), ReportActivity.class);
        final CardView cardView7 = root.findViewById(R.id.Crime);

        cardView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(report);
            }
        });


        supports= new Intent(getActivity(), SupportActivity.class);
        final CardView cardView8 = root.findViewById(R.id.support);

        cardView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(supports);
            }
        });

        return root;
    }
}
