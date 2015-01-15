package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RickLife {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		int walkers;
		List<Integer> distance=new ArrayList<Integer>();
		String[] dist;
		int shot,reload,len,count;
		for (int t = 0; t < T; t++) {
			shot=0;reload=0;count=0;
			walkers = Integer.parseInt(br.readLine());
			distance.clear();
			dist = br.readLine().split("\\s");
			for(int i=0;i<walkers;i++){
				distance.add(Integer.parseInt(dist[i]));
			}
			Collections.sort(distance);
			while(!distance.isEmpty() && distance.get(0)-count>0){
				distance.remove(0);
				shot++;reload++;
				count++;
				/*len=distance.size();
				for(int i=0;i<len;i++){
					if(reload==6){
						distance.set(i, distance.get(i)-2);
					}else{
						distance.set(i, distance.get(i)-1);
					}
				}*/
				if(reload==6){
					reload=0;
					count++;
				}
			}
			//System.out.println(distance);
			if(distance.isEmpty()){
				System.out.println("Rick now go and save Carl and Judas");
			}else{
				System.out.println("Goodbye Rick");
				System.out.println(shot);
			}
			
		}
	}
	
}
