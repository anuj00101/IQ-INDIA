package mapinjava;

import java.util.HashMap;

public class MAPinjava {

	public static void main(String[] args) {
		HashMap <Integer,String> hm= new HashMap<Integer,String>(); 
		hm.put(1051, "anuj");
		hm.put(1024, "rahul");
		hm.put(1032, "anoop");
		//hm.put(1024, "ratna");
		
		hm.clear();
		
		System.out.println(hm);
		
		hm.get(1024);
		//System.out.println(hm.get(1024));
		hm.containsKey(1032);
	//	System.out.println(hm.containsKey(1032));
		hm.containsValue("anoop");
		System.out.println(hm.containsValue("anoop"));
		hm.clear();
	
      
	}
}



