package com.yehu.customnumberpicker.view;

import java.lang.reflect.Field;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
/**
 * 
 * @author yehu 
 * 时间	2015年12月17日下午5:43:03
 */
public class CustomNumberPicker extends NumberPicker {

	public CustomNumberPicker(Context context, AttributeSet attrs,
			int defStyleAttr) {
		super(context, attrs, defStyleAttr);
	}

	public CustomNumberPicker(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public CustomNumberPicker(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addView(View child) {
		this.addView(child, null);
	}

	@Override
	public void addView(View child, android.view.ViewGroup.LayoutParams params) {
		this.addView(child, -1, params);
	}

	@Override
	public void addView(View child, int index,
			android.view.ViewGroup.LayoutParams params) {
		super.addView(child, index, params);
		setNumberPicker(child);
	}

	/**
	 * 设置CustomNumberPicker的属性 颜色 大小
	 * @param view
	 */
	public void setNumberPicker(View view) {
		if (view instanceof EditText) {
			((EditText) view).setTextColor(0xffff5000);
			((EditText) view).setTextSize(18);
		}
	}

	/**
	 * 设置分割线的颜色值 
	 * @param numberPicker
	 */
	@SuppressWarnings("unused")
	public void setNumberPickerDividerColor(NumberPicker numberPicker) {
		NumberPicker picker = numberPicker;
		Field[] pickerFields = NumberPicker.class.getDeclaredFields();
		for (Field pf : pickerFields) {
			if (pf.getName().equals("mSelectionDivider")) {
				pf.setAccessible(true);
				try {
					pf.set(picker, new ColorDrawable(Color.GREEN));
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (Resources.NotFoundException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				}
				break;
			} 
		}
	}

}
