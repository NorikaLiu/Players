
public class GuildLeaders extends GUild{
	private String BR;
	private String GuildName;
	public GuildLeaders (String first, String last, String sex, String Num) {
		super(first, last, sex);
		BR = Num;
		
	}
	public String getBR() {
		return BR;
	}
	
	public void setRoom(String rm) {
		BR = rm;
	}
	
}
