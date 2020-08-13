package com.example.walcius.dzielnypacjent.Powiadomienia;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.walcius.dzielnypacjent.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PowiadomieniaLekiFragment extends Fragment {


    public PowiadomieniaLekiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_powiadomienia_leki, container, false);
        Button button = (Button) view.findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent i = new Intent(getContext(),DodajPowiadomienieLek.class);
                startActivity(i);
                /*FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DodajPowiadomienieLekFragment hello = new DodajPowiadomienieLekFragment();
                fragmentTransaction.add(R.id.pager, hello, "HELLO");
                fragmentTransaction.commit();*/
            }
        });
        return view;
    }


}
