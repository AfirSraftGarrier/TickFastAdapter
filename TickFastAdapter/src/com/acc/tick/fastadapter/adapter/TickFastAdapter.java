package com.acc.tick.fastadapter.adapter;

import java.util.List;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.acc.tick.fastadapter.R;
import com.acc.tick.fastadapter.adapter.base.ACCBaseAdapter;
import com.acc.tick.fastadapter.model.Company;
import com.acc.tick.fastadapter.model.CompanyType;

public class TickFastAdapter extends ACCBaseAdapter<Company> {

	public TickFastAdapter(Context context, List<Company> ts,
			ACCBaseAdapter.OnItemClickListener<Company> onItemClickListener) {
		super(context, ts, onItemClickListener, R.layout.list_item_company,
				null);
	}

	@Override
	public void updateView(View convertView, Company t) {
		ImageView iconImageView = this.getView(convertView, R.id.iv_company);
		TextView tittleTextView = this.getView(convertView, R.id.tv_company);
		iconImageView
				.setImageResource(t.getCompanyType() == CompanyType.NET ? R.drawable.ic_launcher
						: R.drawable.notes);
		tittleTextView.setText(t.getName());
	}

}
