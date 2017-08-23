
public class Top3Guild {
	public static void main(String[] args) {
		

	GUild bystander1 = new GUild("Osborn", "100,000,000", "Berserker");
	GUild bystander2 = new GUild("Kahuna", "160,000,000", "Berserker");
	GUild bystander3 = new GUild("Sicada", "59,000,000", "Sorceress");
	BRofGuild Guild1 = new BRofGuild("Destination", "2 Billion", "BladeDancer");
	BRofGuild Guild2 = new BRofGuild("Nightmare", "186 Million", "Berserker");
	BRofGuild Guild3 = new BRofGuild("LOSDIABLOS2", "175 Million", "Berserker");
	GuildLeaders First = new GuildLeaders ("Angela", "600 m ", "Sorceress", "High");
	GuildLeaders Second= new GuildLeaders ("Kahuna", "160 m ", "Berserker", "Low High");
	GuildLeaders Third= new GuildLeaders ("C8yme", "33 m ", "BladeDancer", "Medium");

	bystander1.getPersonInfo();
	System.out.println();
	bystander2.getPersonInfo();
	System.out.println();
	bystander3.getPersonInfo();
	System.out.println();
	Guild1.getPersonInfo();
	
	System.out.println();
	Guild2.getPersonInfo();
	System.out.println();
	Guild3.getPersonInfo();
	System.out.println();
	First.getPersonInfo();
	System.out.println();
	System.out.println("The Strongest Person is Angela");
	System.out.println();
}
}
