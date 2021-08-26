package main;

import java.util.Scanner;

import jihee.Jihee;
import kwanghun.TestSkh;
import juyeong.Jy;

public class MainProj {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Jy n = new Jy();
		TestSkh skh = new TestSkh();
		Jihee sj = new Jihee();
		int num;
		while(true) {
			System.out.println("1.이주영님 2.성기룡님 3.설지희님 4.서광훈님 5.송영관님");
			num=input.nextInt();
			switch(num) {
			case 1:
				System.out.println(n.jy);
				break;
			case 2: break;
			case 3: sj.sjh();
				break;
			case 4: skh.display();
				break;
			case 5: break;
			}
		}
	}
}