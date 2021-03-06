package com.journalio.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activity_ProfilePage extends Activity {
	// Initialising the app_header layout
		//RelativeLayout app_header;
		
		//Initialising edittext
		EditText et_email, et_pswd_0,et_pswd_1;
		
		//Initialising the sign_up button
		Button bttn_sign_up;
		
		
		//initialise the trending textview
		TextView nav_tv_0, nav_tv_1;

		//Initialising the context
		Context ctx;
		
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			
			// Setting the view of the profile_page_layout
			setContentView(R.layout.profile_page_layout);
			
			ctx = Activity_ProfilePage.this;
			
			//Referencing the individual element in the UI
			
			//app_header=(RelativeLayout) findViewById(R.id.app_header_id);
			
			et_email =(EditText) findViewById(R.id.et_email);
			
			et_pswd_0 =(EditText) findViewById(R.id.et_pswd_0);
			
			et_pswd_1 =(EditText) findViewById(R.id.et_pswd_1);
			
			bttn_sign_up =(Button) findViewById(R.id.bttn_sign_up);
			
			nav_tv_0 = nav_TV(3, "nav_tv_",0);
			
			nav_tv_1 = nav_TV(3, "nav_tv_",1);
			
			
			
			nav_tv_1.setOnTouchListener(new OnTouchListener() {
				
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					if(v.getId()==nav_tv_1.getId()) {
					switch (event.getActionMasked()){

	  						case MotionEvent.ACTION_DOWN:
	  						case MotionEvent.ACTION_POINTER_DOWN: {
	  							//change color or background  ( new )
	  							break;
	  						}

	  						case MotionEvent.ACTION_UP:
	  						case MotionEvent.ACTION_POINTER_UP: {
	  							
	  							//change color to default
	  							
	  							//do the action
	  							Intent activity_Post_intent = new Intent(Activity_ProfilePage.this, Activity_Poster.class );
	  							startActivity(activity_Post_intent);
	  							
	  							
	  							break;
	  						}
	  						case MotionEvent.ACTION_MOVE:{
	  							
	  							//finger moved : deactivate the whole action 
	  							
	  							break;
	  						}
	  					}
					}
					return true;
				}
			});

			
			nav_tv_0.setOnTouchListener(new OnTouchListener() {
				
				@Override
				public boolean onTouch(View v, MotionEvent event) {
					if(v.getId()==nav_tv_0.getId()) {
					switch (event.getActionMasked()){

	  						case MotionEvent.ACTION_DOWN:
	  						case MotionEvent.ACTION_POINTER_DOWN: {
	  							//change color or background  ( new )
	  							break;
	  						}

	  						case MotionEvent.ACTION_UP:
	  						case MotionEvent.ACTION_POINTER_UP: {
	  							
	  							//change color to default
	  							
	  							//do the action
	  							Intent activity_MainNewsPage_intent = new Intent(Activity_ProfilePage.this, Activity_MainNewsPage.class );
	  							startActivity(activity_MainNewsPage_intent);
	  							
	  							
	  							break;
	  						}
	  						case MotionEvent.ACTION_MOVE:{
	  							
	  							//finger moved : deactivate the whole action 
	  							
	  							break;
	  						}
	  					}
					}
					return true;
				}
			});

		for(int x=0; x<3; x++) {
		
		//because we are in the Activity_MainNewsPage,
		//turn off all the views under the tv except 
		//the first one.
		if(x==2){//trending
			nav_V(3, "nav_v_", x).setVisibility(View.VISIBLE);
		}else{
			nav_V(3, "nav_v_", x).setVisibility(View.GONE);
		}
		}	
			
		}

		@Override
		protected void onStart() {
			// TODO Auto-generated method stub
			super.onStart();
		}

		@Override
		protected void onRestart() {
			// TODO Auto-generated method stub
			super.onRestart();
		}

		@Override
		protected void onResume() {
			// TODO Auto-generated method stub
			super.onResume();
		}

		@Override
		protected void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
		}

		@Override
		protected void onStop() {
			// TODO Auto-generated method stub
			super.onStop();
		}

		@Override
		protected void onDestroy() {
			// TODO Auto-generated method stub
			super.onDestroy();
		}
		public TextView nav_TV(int total_num_i, String prefix_str, int tv_i){

			String[] textView_tv_ids = new String[total_num_i];

			TextView[] textView_full_IDs = new TextView[total_num_i];

			textView_tv_ids[tv_i] = prefix_str+Integer.toString(tv_i);

			int textView_tv_ID = ctx.getResources().getIdentifier(textView_tv_ids[tv_i], "id", "com.journalio.android");
			textView_full_IDs[tv_i] = (TextView)findViewById(textView_tv_ID);

			return textView_full_IDs[tv_i];
		}

		public View nav_V(int total_num_i, String prefix_str, int v_i){

			String[] view_ids = new String[total_num_i];

			View[] view_full_IDs = new View[total_num_i];

			view_ids[v_i] = prefix_str+Integer.toString(v_i);

			int view_ID = ctx.getResources().getIdentifier(view_ids[v_i], "id", "com.journalio.android");
			view_full_IDs[v_i] = (View)findViewById(view_ID);

			return view_full_IDs[v_i];
		}
		
		


}
