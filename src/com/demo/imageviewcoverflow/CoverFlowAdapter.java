package com.demo.imageviewcoverflow;

import java.util.ArrayList;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CoverFlowAdapter implements ICoverFlowAdapter {

	private ArrayList<String> images;
	private Context context;
	
	public CoverFlowAdapter(ArrayList<String> images,Context context){
		this.context = context;
		this.images = images;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return images==null?0:images.size();
	}

	@Override
	public Object getItem(int position) {
        // TODO Auto-generated method stub
        return images.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return position;
    }

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		Holder holder = null;
		if(convertView==null){
			holder = new Holder();
			convertView = View.inflate(context, R.layout.item_view, null);
			holder.tv = (TextView)convertView.findViewById(R.id.tv);
		}else{
			holder = (Holder) convertView.getTag();
		}
		holder.tv.setText(""+position);
		convertView.setTag(holder);
        return convertView;
    }

	@Override
	public void getData(View view,int position){
		Holder holder = (Holder) view.getTag();
		holder.tv.setText("position : " + position);
	}
	
	public static class Holder{
		public TextView tv;
	}
	
}
