package in.dup2.android.clva;

public class Contact {
	private final String name;
	private final String phone;
	private final String email;
	

	public Contact(String name, String phone, String email) {
		this.name = name;
		this.email = email;
		this.phone = phone; 
	}

	public String getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}

	public String getEmail(){
		return email; 
	}
	
}
