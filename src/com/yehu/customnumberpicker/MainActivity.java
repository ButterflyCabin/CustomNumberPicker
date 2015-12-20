package com.yehu.customnumberpicker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.yehu.customnumberpicker.view.CustomNumberPicker;
/**
 * 
 * @author yehu 
 * 时间	2015年12月17日下午5:42:53
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		CustomNumberPicker numberPicker = (CustomNumberPicker) findViewById(R.id.numberPicker);
		numberPicker.setMaxValue(23);
		numberPicker.setMinValue(01);
		numberPicker.setValue(49);
		numberPicker.setBackgroundColor(Color.LTGRAY);
		numberPicker.setNumberPickerDividerColor(numberPicker);
	}
}
