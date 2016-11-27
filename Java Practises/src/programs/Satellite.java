package programs;

public class Satellite {
	private static Satellite _instance;
	 Satellite(){
		
	}
	 
	 
	private static class Sathelper{
		private static final Satellite _innerInstance = new Satellite();
	}
	
	public static Satellite getInstance(){
		
		return Sathelper._innerInstance;
	}
	
public static Satellite getInstance1(){
		
		if(_instance == null){
			_instance = new Satellite();
		}
		
		return _instance;
	}
}
