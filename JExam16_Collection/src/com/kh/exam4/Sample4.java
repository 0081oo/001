package com.kh.exam4;

import java.io.*;
import java.util.*;

class Lotto{
	private Random rand = new Random();
	private Vector<Integer> lotto = new Vector<>();
	
	// 가변매개변수
//	public Lotto(int... nums) {
//		
//	}
	
	public Vector<Integer> auto(){ 
		for(int i = 0; i < 6; i++) {
			int tmp = rand.nextInt(45) + 1;
			lotto.add(tmp);
			for(int j = 0; j < i; j++) {
				if(tmp == lotto.get(j)) {
					i--; break;
				}
			}
		}
		return lotto;
	}
	
	public Vector<Integer> manual(int[] subList){
		int length = subList.length;
		if(length == 6) {
			for(int i = 0; i < 6; i++) {
				lotto.add(subList[i]);
			}
			return lotto;
		}
		
		for(int i = 0; i < length; i++) {
			lotto.add(subList[i]);
		}
		for(int i = length - 1; i < 6; i++) {
			int tmp = rand.nextInt(45) + 1;
			lotto.add(tmp);
			for(int j = 0; j < i; j++) {
				if(tmp == lotto.get(j)) {
					i--; break;
				}
			}
		}
		return lotto;
	}
	
}

public class Sample4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f =new File("/users/heeminchun/Desktop/Lotto.txt");
		try {
			f.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		String yOrN;
		Lotto myLotto = new Lotto();
		
		System.out.print("Do you wanna manual? (yes or no): ");
		yOrN = sc.next();
		
		if("yes".equals(yOrN)) {
			int num;
			System.out.print("How many numbers do you want to choose?: ");
			num = sc.nextInt();
			
			int[] user = new int[num];
			for(int i = 0; i < user.length; i++) {
				System.out.print("Your " + (i+1) + "th Num : ");
				user[i] = sc.nextInt();
			}
			
//			System.out.println("\nThis is your Lotto numbers : " + myLotto.manual(user));
			try {
				FileWriter fw = new FileWriter(f);
				fw.write(myLotto.manual(user).toString());
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else if("no".endsWith(yOrN)) {
//			System.out.println("\nThis is your Lotto numbers : " + myLotto.auto());
			try {
				FileWriter fw = new FileWriter(f);
				String str = myLotto.auto().toString();
				System.out.println(str);
//				fw.write("Lotto num is : ");
				fw.write(str);
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
