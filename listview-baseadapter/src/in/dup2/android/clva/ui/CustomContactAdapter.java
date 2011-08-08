package in.dup2.android.clva.ui;

import in.dup2.android.clva.Contact;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import in.dup2.android.clva.R;

public class CustomContactAdapter extends BaseAdapter {

	private List<Contact> items = null;
	private Context context;

	public CustomContactAdapter(Context context, List<Contact> items) {
		// TODO Auto-generated constructor stub
		this.items = items;
		this.context = context;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return items.size();
	}

	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return items.get(position);
	}

	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
		LinearLayout rowLayout = null;
		if (convertView == null) {
			rowLayout = (LinearLayout) LayoutInflater.from(context).inflate(
					R.layout.list_item, parent, false);
		} else {
			rowLayout = (LinearLayout) convertView;
		}
		TextView name = (TextView) rowLayout.findViewById(R.id.name);
		name.setText(items.get(position).getName());
		TextView phone = (TextView) rowLayout.findViewById(R.id.phone);
		phone.setText(items.get(position).getPhone());
		TextView email = (TextView) rowLayout.findViewById(R.id.email);
		email.setText(items.get(position).getEmail());
		return rowLayout;
	}
}