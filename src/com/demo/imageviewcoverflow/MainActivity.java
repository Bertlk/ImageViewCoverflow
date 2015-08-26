package com.demo.imageviewcoverflow;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demo.imageviewcoverflow.CoverFlowAdapter.Holder;


public class MainActivity extends Activity implements View.OnClickListener {

	private Button previous_btn;
	private Button forward_btn;
	private Button get_top_btn;
	private Button get_top_view_btn;
	private CoverFlowView coverFlowView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		coverFlowView = (CoverFlowView) findViewById(R.id.coverflow);
		previous_btn = (Button) findViewById(R.id.previous_btn);
		forward_btn = (Button) findViewById(R.id.forward_btn);
		forward_btn.setOnClickListener(this);
		previous_btn.setOnClickListener(this);
		get_top_btn = (Button) findViewById(R.id.get_top_btn);
		get_top_btn.setOnClickListener(this);
        get_top_view_btn = (Button) findViewById(R.id.get_top_view_btn);
        get_top_view_btn.setOnClickListener(this);

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


		// 给coverFlowView的TOPView 添加点击事件监听
		coverFlowView.setOnTopViewClickLister(new CoverFlowView.OnTopViewClickLister() {
			@Override
			public void onClick(int position, View itemView) {

				Holder holder = (Holder)coverFlowView.getTopView().getTag();
				Toast.makeText(MainActivity.this.getApplicationContext(),
						"  点击事件  position : " + position + " text : " + holder.tv.getText(),
						Toast.LENGTH_SHORT).show();
			}
		});

		// 给coverFlowView的TOPView 添加长时间点击事件监听
		coverFlowView.setOnTopViewLongClickLister(new CoverFlowView.OnTopViewLongClickLister() {
			@Override
			public void onLongClick(int position, View itemView) {
				Holder holder = (Holder)coverFlowView.getTopView().getTag();
				Toast.makeText(MainActivity.this.getApplicationContext(),
						"  长点击事件  position : " + position + " text : " + holder.tv.getText(),
						Toast.LENGTH_SHORT).show();
			}
		});


		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()){
			case R.id.previous_btn ://回前一页
				coverFlowView.gotoPrevious();
				break;
			case R.id.forward_btn :
				coverFlowView.gotoForward();//向后一页
				break;
			case R.id.get_top_btn ://获取最上面Item的position
				int position = coverFlowView.getTopViewPosition();
				Toast.makeText(this.getApplicationContext(),position+"",Toast.LENGTH_SHORT).show();
                break;
			case R.id.get_top_view_btn ://获取最上面Item的View
                Holder holder = (Holder)coverFlowView.getTopView().getTag();
				Toast.makeText(this.getApplicationContext(), holder.tv.getText() + "", Toast.LENGTH_SHORT).show();

				break;
			default :
				break;
		}
	}
}
