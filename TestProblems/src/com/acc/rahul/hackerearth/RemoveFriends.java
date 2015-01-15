package com.acc.rahul.hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class RemoveFriends {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		int T = Integer.parseInt(line);
		String[] popularity;
		int totalFriends;
		int toBeDeleted;
		String[] friends;

		List<String> list;
		for (int t = 0; t < T; t++) {
			list = new ArrayList<String>();
			friends = br.readLine().split("\\ ");
			totalFriends = Integer.parseInt(friends[0]);
			toBeDeleted = Integer.parseInt(friends[1]);
			popularity = br.readLine().split("\\ ");
			/*for (String s : popularity)
				list.add(s);*/

			/*while (toBeDeleted > 0) {
				delete(list);
				toBeDeleted--;
			}*/
			int last=totalFriends;
			while (toBeDeleted > 0) {
				delete(popularity, last-1);
				toBeDeleted--;
				last--;
			}
			
		/*	for (String s : list) {
				System.out.print(s + " ");
			}*/
			for (String s : popularity) {
				if(s!=null)
				System.out.print(s + " ");
			}
			System.out.println();
		}
	}

	public static void delete(List<String> list) {
		boolean deleteFriend = false;
		for (int i = 0; i < list.size() - 1; i++) {
			if (Integer.parseInt(list.get(i)) < Integer.parseInt(list
					.get(i + 1))) {
				list.remove(i);
				deleteFriend = true;
				break;
			}
		}
		if (!deleteFriend) {
			list.remove(list.size() - 1);
		}
	}
	
	public static void delete(String[] popularity, int last) {
		boolean deleteFriend = false;
		int len = popularity.length;
		for (int i = 0; i < len - 1; i++) {
			if(popularity[i]!=null && popularity[i+1]!=null &&
			Integer.parseInt(popularity[i]) < Integer.parseInt(popularity[i+1])) {
				popularity[i]=null;
				deleteFriend = true;                                                                                                                         
				break;
			}
		}
		if (!deleteFriend) {
			popularity[last]=null;
		}
	}
}
