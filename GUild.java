
public class GUild {
		private String Name;
		private String BR;
		private String Class;   
		
		public GUild(String first, String last, String sex) {
			
			Name = first;
			BR = last;
			Class = sex;
		}
		
	


public String getFirstName() {
	return Name;
}

public String getLastName() {
	return BR;
}

public String getGender() {
	return Class;
}

public void getPersonInfo() {
	System.out.println("" + Name + " BR: " + BR + " and is a " + Class);
}

}
