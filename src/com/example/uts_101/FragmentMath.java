package com.example.uts_101;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class FragmentMath extends Fragment {
	
	ListView lmmenu1;
	String[] mmenu = {"Aritmetika Dasar","Bangun Dasar","Baris Dan Deret"};
	
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_math,
				container,false);
		
		lmmenu1 = (ListView)rootView.findViewById(R.id.lvmenu1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1, mmenu);
        lmmenu1.setAdapter(adapter);
		lmmenu1.setOnItemClickListener(listClick);
        
		return rootView;}
		
		private AdapterView.OnItemClickListener listClick = new AdapterView.OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				
				if (arg2 == 2)
				{Fragmentbaris fragmentbaris = new Fragmentbaris();
		        FragmentManager fragmentManager = getFragmentManager();
		        FragmentTransaction ft = fragmentManager.beginTransaction();
		        ft.replace(R.id.content_frame, fragmentbaris);
		        ft.commit();}
				else
				{Toast.makeText(getActivity(), "Bukan Jatahku", Toast.LENGTH_SHORT).show();}
			}
		};


			};
