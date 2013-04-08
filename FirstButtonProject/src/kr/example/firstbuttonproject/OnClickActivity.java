package kr.example.firstbuttonproject;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class OnClickActivity extends Activity implements OnClickListener{
	static final int[] BUTTONS = 
		{
			R.id.button1,
			R.id.button2,
			R.id.button3
		};
	
	public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);

		for(int btnId:BUTTONS){
			Button tmpButton = (Button) findViewById(btnId);
			tmpButton.setOnClickListener(this);
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			Toast.makeText(OnClickActivity.this, "가위를 내셨습니다", Toast.LENGTH_SHORT).show();
			break;
		case R.id.button2:
			Toast.makeText(OnClickActivity.this, "바위를 내셨습니다", Toast.LENGTH_SHORT).show();
			break;
		case R.id.button3:
			Toast.makeText(OnClickActivity.this, "보를 내셨습니다", Toast.LENGTH_SHORT).show();
			break;
		}
	}
}
