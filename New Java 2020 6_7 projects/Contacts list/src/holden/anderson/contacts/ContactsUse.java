package holden.anderson.contacts;

public class ContactsUse {

	public ContactsUse() {
		Contacts lydia = new Contacts();
		System.out.println(lydia.name);
		Contacts Jaiden = new Contacts();
		Jaiden.name = "Jaiden";
		System.out.println(Jaiden.name);
	
	}
	
	public static void main(String [] args) {
			new ContactsUse();
			
	}

}