package com.wiipu.mall.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.wiipu.mall.R;

/**
 * 商品分类Fragment
 */
public class CategoryFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_category, container, false);
		initView(view);
		return view;
	}
	
	/**
	 * 初始化视图
	 * @param view 父视图
	 */
	private void initView(View view){
	}
	
}
