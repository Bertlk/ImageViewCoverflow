package com.demo.imageviewcoverflow;

import android.view.View;
import android.view.ViewGroup;

public interface ICoverFlowAdapter {

	public int getCount();

	public Object getItem(int position);

	public long getItemId(int position);

	public View getView(int position, View convertView, ViewGroup parent) ;

	public void getData(View view,int position);
	
	
}
