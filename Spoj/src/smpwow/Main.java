package smpwow;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard=new Scanner(System.in);
		String word="W";
		int input=keyboard.nextInt();
		//System.out.println(word);
		for (int i=0;i<input;i++){
			word=word.concat("o");
			
		}
		word=word.concat("w");
		System.out.println(word);

	}

}
