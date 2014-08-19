package com.acc.tick.fastadapter.activity;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import com.acc.tick.fastadapter.R;
import com.acc.tick.fastadapter.adapter.TickFastAdapter;
import com.acc.tick.fastadapter.adapter.base.ACCBaseAdapter.OnItemClickListener;
import com.acc.tick.fastadapter.manager.ToastManager;
import com.acc.tick.fastadapter.model.Company;
import com.acc.tick.fastadapter.model.CompanyType;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.initListView();
	}

	private List<Company> getCompanies() {
		List<Company> companies = new ArrayList<Company>();
		Company company = new Company();
		company.setName("百度");
		company.setCompanyType(CompanyType.NET);
		companies.add(company);
		Company secondCompany = new Company();
		secondCompany.setName("谷歌");
		secondCompany.setCompanyType(CompanyType.MANU);
		companies.add(secondCompany);
		return companies;
	}

	private void initListView() {
		ListView listView = (ListView) this.findViewById(R.id.lv_company);
		listView.setAdapter(new TickFastAdapter(this, this.getCompanies(),
				new OnItemClickListener<Company>() {

					@Override
					public void onItemClick(Company t) {
						ToastManager.getInstance(MainActivity.this).shortToast(
								"公司名称：" + t.getName());
					}
				}));
	}
}
