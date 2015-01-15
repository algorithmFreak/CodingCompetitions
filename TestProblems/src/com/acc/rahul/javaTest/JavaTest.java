package com.acc.rahul.javaTest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaTest {

	
	public static void main(String[] args) {

/*		int i ;
		for(int j=0;j<20;j++){
		i= (int) (Math.random()*100);
		System.out.println(i);
		}*/
		int[] arr = new int[]{1,3,2,9,2,7};
		int n = arr.length - 2;
		  int x = 0, y = 0;
		int xor =arr[0],count=0;
		for(int i=1;i<arr.length;i++){
			xor^=arr[i];
		}
		System.out.println(xor);
		for(int i=1;i<=n;i++){
			xor^=i;
		}
		System.out.println(xor);
		int set_bit_no = xor & ~(xor-1);
		System.out.println(set_bit_no);
		int i;
		 for(i = 0; i < arr.length; i++)
		  {
		    if((arr[i] & set_bit_no) == 1)
		      x = x ^ arr[i]; /*XOR of first set in arr[] */
		    else
		      y = y ^ arr[i]; /*XOR of second set in arr[] */
		  }
		  for(i = 1; i <= n; i++)
		  {
		    if((i & set_bit_no) ==1)
		      x = x ^ i; /*XOR of first set in arr[] and {1, 2, ...n }*/
		    else
		      y = y ^ i; /*XOR of second set in arr[] and {1, 2, ...n } */
		  }
		System.out.println(x+" "+y); 
		  
		/*Set s= new HashSet();
			s.add("e");
			s.add(2);
			
			s.add("r");
			Iterator itr1 = s.iterator();
			while(itr1.hasNext())
			System.out.println(itr1.next());
			char[] c = "abc".toCharArray();
			String cs= new String(c);
		System.out.println(cs);
		List<String> list = new ArrayList<String>();
		list.add("Rahul");
		list.add("Rahul1");
		list.add("Rahul2");
		list.add("Rahul3");
		Iterator<String> itr = list.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			System.out.println(str);
			itr.remove();
			}
		System.out.println(list.size());*/
		
		/*ConcurrentMap<String,String> map = new ConcurrentHashMap<String,String>();
		map.put("1","1");
		map.put("2","2");
		map.put("3","3");
		map.put("4","4");
		Set<String> set = map.keySet();
		for(String s:set){
			map.remove(s);
		}
		System.out.println(map.size());
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put(null, "value");
		map1.put("key", null);
		System.out.println(map1.get(null) +" "+ map1.get("key"));
		
		List<String> list = new ArrayList<String>();
		list.add("rahul");
		list.add("vipul");
		list.add("ashu");
		
	list = Collections.synchronizedList(list);*/
	

	}

}

class TH implements Runnable{
	public void run(){
		
	}
}

