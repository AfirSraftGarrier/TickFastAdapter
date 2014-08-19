package com.acc.tick.fastadapter.manager;

import android.content.Context;
import android.widget.Toast;

public class ToastManager {
	private static ToastManager instance;
	private final Context context;

	public static ToastManager getInstance(Context context) {
		if (instance == null) {
			instance = new ToastManager(context);
		}
		return instance;
	}

	private ToastManager(Context context) {
		this.context = context;
		// super(context);
	}

	public void shortToast(int StringId) {
		Toast.makeText(context, StringId, Toast.LENGTH_SHORT).show();
	}

	public void shortToast(String toastString) {
		Toast.makeText(context, toastString, Toast.LENGTH_SHORT).show();
	}

	public void longToast(String toastString) {
		Toast.makeText(context, toastString, Toast.LENGTH_LONG).show();
	}

	public void longToast(int StringId) {
		Toast.makeText(context, StringId, Toast.LENGTH_LONG).show();
	}

	// @Override
	// public void refresh() {
	// }
	//
	// @Override
	// public void init(Context context) {
	// }
}
