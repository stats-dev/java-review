package chap05_array;

import java.util.Random;
import java.util.Scanner;

public class _04_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner sc = new Scanner(System.in);
				Random rd = new Random();
				
				//해당 판의 승무패를 담아줄 배열(w, d, l)
				char[] wdlArr = new char[10];
				int[] resultCnt = new int[3];
				
				
				for(int i = 0; i < 10; i++) {
					int com = rd.nextInt(3);
					
					//가위, 바위, 보 10판 진행
					//배열에 각 판의 승무패 저장
					//배열에 저장된 승, 무, 패를 세서 몇승 몇무 몇패인지 출력
					
					System.out.print("가위, 바위, 보 중 하나를 입력하세요. : ");
					String input = sc.nextLine();
					int inputNum = 0;
					
					if(input.equals("가위")) {
						inputNum = 0;
					} else if(input.equals("바위")) {
						inputNum = 1;
					} else if(input.equals("보")) {
						inputNum = 2;
					}
					
					if(com == inputNum) {
						System.out.println("비겼습니다.");
						wdlArr[i] = 'd';
						resultCnt[1]++;
					} else {
						if((inputNum == 0 && com == 1) ||
							(inputNum == 1 && com == 0) ||
							(inputNum == 2 && com == 2)) {
							System.out.println("이겼습니다.");
							wdlArr[i] = 'w';
							resultCnt[0]++;
						} else {
							System.out.println("졌습니다.");
							wdlArr[i] = 'l';
							resultCnt[2]++;
						}
					}

					
										
										
					
				}
				sc.close();
				System.out.println(wdlArr);
				
				//몇승,몇무,몇패 출력
				System.out.println("승부 결과는" + resultCnt[0] + "승" + resultCnt[1] + "무" + resultCnt[2] + "패 입니다.");
				
				
				
				
				
			}
				
				

}
