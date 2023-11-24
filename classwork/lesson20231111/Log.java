public class Log {
	public static void out(String s){
		System.out.println(s);
	}

	public static void logResult(boolean result, AbstractPlayer p){
		if(result) Log.out("Success, " + p.getName() + " 's hp is " + p.getHp() + ".");
		else Log.out("Missed");
	}
}