package chap20_lambda.clazz;


public class UserCharString {

	private String str;

	//생성자
	public UserCharString(String str) {
		this.str = str;
	}
		
	
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
	
	
	@Override
	public String toString() {
		return "UserCharString [str=" + str + "]";
	}


	public void changeStr(char ch, UserChar uc) {
		uc.findUserChar(ch, str);
	}
	
	
	
	
	
}
