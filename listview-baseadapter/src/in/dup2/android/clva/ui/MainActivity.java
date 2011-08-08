package in.dup2.android.clva.ui;

import in.dup2.android.clva.Contact;
import in.dup2.android.clva.R;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		ListView list = (ListView)findViewById(R.id.contacts);
		List<Contact> contacts = new ArrayList<Contact>();
		contacts.add(new Contact("Dev 01", "+1 111-111-1111", "dev01@example.com"));
		contacts.add(new Contact("Dev 02", "+2 222-222-2222", "dev02@example.com"));
		contacts.add(new Contact("Dev 03", "+3 333-333-3333", "dev03@example.com"));
		contacts.add(new Contact("Dev 04", "+4 444-444-4444", "dev04@example.com"));
		contacts.add(new Contact("Dev 05", "+5 555-555-5555", "dev05@example.com"));
		contacts.add(new Contact("Dev 06", "+6 666-666-6666", "dev06@example.com"));
		contacts.add(new Contact("Dev 07", "+7 777-777-7777", "dev07@example.com"));
		contacts.add(new Contact("Dev 08", "+8 888-888-8888", "dev08@example.com"));
		contacts.add(new Contact("Dev 09", "+9 999-999-9999", "dev09@example.com"));
		contacts.add(new Contact("Dev 10", "+1 111-222-0000", "dev10@example.com"));
		contacts.add(new Contact("Dev 11", "+1 111-333-0000", "dev11@example.com"));
		contacts.add(new Contact("Dev 12", "+1 111-444-0000", "dev12@example.com"));
		list.setAdapter(new CustomContactAdapter(getApplicationContext(), contacts));
	}
}