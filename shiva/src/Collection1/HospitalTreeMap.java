package Collection1;

import java.util.*;
public class HospitalTreeMap {

	public static void main(String[] args) 
	{
		TreeMap <Integer,String>patientMap=new TreeMap<>();
		
		
		patientMap.put(102,"shiva");
		patientMap.put(101,"bharath");
		patientMap.put(104,"sai");
		patientMap.put(103,"Kamal");
		patientMap.put(105,"Jakkam");
		
		
		
		System.out.println("Sorted Patient List:");  
		for(Map.Entry<Integer, String>entry: patientMap.entrySet())
		{
		System.out.println("ID :" + entry.getKey() + "->" + entry.getValue());
		}
		
		System.out.println("First Patient ID: " + patientMap.firstKey());
		System.out.println("Last Patient ID: " + patientMap.lastKey());	
 
		
		System.out.println("Patient with ID 101 : " + patientMap.get(101));
	
		
		patientMap.remove(101);
		System.out.println("Remove Patient ID 101");
		
		 
		System.out.println("Has ID 101?" +patientMap.containsKey(101));
		
		System.out.println("Has ID 102?" +patientMap.containsKey(102));
		
		
		System.out.println("Descending Patient list:");
		NavigableMap<Integer, String> desMap=patientMap.descendingMap();
		for(Map.Entry<Integer, String>entry: desMap.entrySet())
		{
			System.out.println("ID: " + entry.getKey() + "->" + entry.getValue());
		}
	}

}
