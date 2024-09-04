package rev.stringexcercise;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharCount {
   public static void main(String[] args) {
	   String str=" sharmila srushti Malkar";	  
	   char ch[]=str.toCharArray();
	   Map<Character,Integer> map=new HashMap<>();
	   for(char keys:ch)
	   {
		   if(Character.isAlphabetic(keys))
		   {
			   if(map.containsKey(keys))
			   {
				   map.put(keys, map.get(keys)+1);
			   }
			   else
			   {
				   map.put(keys,1);
			   }
		   }
	   }
	   map.entrySet().removeIf(s->s.getValue()==1);
	   for(Map.Entry<Character, Integer>entry:map.entrySet())
	   {
		   System.out.println(entry.getKey()+":"+entry.getValue());
	   }
	   System.out.println(map);
	
}
}


//https://www.youtube.com/watch?v=YdIcoNJY7wo