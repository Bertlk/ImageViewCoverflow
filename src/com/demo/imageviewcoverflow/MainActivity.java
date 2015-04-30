package com.demo.imageviewcoverflow;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		CoverFlowView coverFlowView = (CoverFlowView) findViewById(R.id.coverflow);
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		arrayList.add("1");
		
		CoverFlowAdapter coverFlowAdapter = new CoverFlowAdapter(arrayList,this);
		coverFlowView.setAdapter(coverFlowAdapter);
		
	}

}
