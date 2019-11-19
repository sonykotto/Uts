package com.example.uts_101;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragmentbaris extends Fragment {
	
    EditText eatm;
    Button batm;
    TextView thasilatm;
	
	@Override
	public View onCreateView(LayoutInflater inflater,
			ViewGroup container, Bundle savedInstanceState){
		View rootView = inflater.inflate(R.layout.fragment_baris,
				container,false);
		
		eatm = (EditText)rootView.findViewById(R.id.etatm);
		batm = (Button)rootView.findViewById(R.id.btnatm);
		thasilatm = (TextView)rootView.findViewById(R.id.tvhasilatm);
		
		
		batm.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			
				String pesan = eatm.getText().toString();
				if(pesan.equals("21"))
				{thasilatm.setText("\n Selamat Anda Benar  \n");}
				else
				{thasilatm.setText("\n Anda Salah Goblog\n");}
			}
		});
		
		return rootView;

		
}}
