package com.acc.tick.fastadapter.adapter.base;

import java.util.List;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.acc.tick.fastadapter.R;
import com.acc.tick.fastadapter.util.ListUtil;

public abstract class ACCBaseAdapter<T> extends BaseAdapter {
	protected Context context;
	private final List<T> values;
	private final OnItemClickListener<T> onItemClickListener;
	private final int itemLayoutId;

	public ACCBaseAdapter(Context context, List<T> ts,
			OnItemClickListener<T> onItemClickListener, Integer itemLayoutId) {
		this.context = context;
		this.values = ts;
		this.onItemClickListener = onItemClickListener;
		this.itemLayoutId = itemLayoutId;
	}

	@Override
	public int getCount() {
		if (!ListUtil.isEmpty(this.values)) {
			return this.values.size();
		}
		return 0;
	}

	@Override
	public T getItem(int position) {
		if (ListUtil.isEmpty(this.values) || position > this.getCount() - 1) {
			return null;
		}
		return this.values.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	public interface OnItemClickListener<T> {
		void onItemClick(T t);
	}

	public abstract void updateView(View convertView, T t);

	public static <T extends View> T getView(View convertView, int id) {
		SparseArray<View> viewHolder = (SparseArray<View>) convertView.getTag();
		if (viewHolder == null) {
			viewHolder = new SparseArray<View>();
			convertView.setTag(viewHolder);
		}
		View childView = viewHolder.get(id);
		if (childView == null) {
			childView = convertView.findViewById(id);
			viewHolder.put(id, childView);
		}
		return (T) childView;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		if (ListUtil.isEmpty(this.values) || position > this.getCount() - 1) {
			return null;
		}
		if (convertView == null) {
			LayoutInflater mlnflater = LayoutInflater.from(context);
			convertView = mlnflater.inflate(this.itemLayoutId, null);
			convertView.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View v) {
					if (ACCBaseAdapter.this.onItemClickListener != null
							&& !ListUtil.isEmpty(values)) {
						ACCBaseAdapter.this.onItemClickListener
								.onItemClick(ACCBaseAdapter.this.values
										.get((Integer) v
												.getTag(R.id.tag_adapter_key)));
					}
				}
			});
		}
		convertView.setTag(R.id.tag_adapter_key, position);
		this.updateView(convertView, this.getItem(position));
		return convertView;
	}
}
