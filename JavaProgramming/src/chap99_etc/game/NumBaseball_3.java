package chap99_etc.game;

//Game
//랜덤 값 범위 0`9 정수
//comp : 3개 랜덤 값 (중복 불가)
//user : 3개 입력 값 (중복 불가)

//comp 수 - user 수 비교
//수가 같으면 : 볼
//수와 위치 같으면 : 스트라이크
//n 스트라이크, m 볼 출력
//3 스크라이크 시 게임 종료 : 몇 회만에 게임 종료되었는지 출력
//재진행 여부 묻기 (1 다시, 0 종료)

import java.util.Random;
import java.util.Scanner;

public class NumBaseball_3 {


private int strike = 0;
private int ball = 0;

private int gamecnt = 0;

int com[] = new int[3];
int user[] = new int[3];

Scanner sc = new Scanner(System.in);
Random r = new Random();

public void start() {
   System.out.println("<야구 게임 시작>");
   while(true) {
      // comp 랜덤 값 생성
      System.out.println();
      generateRandom();
      System.out.println("com : " + com[0] + ", " + com[1] + ", " + com[2]); // comp 배열 확인
      
      while(true) {
         strike = 0;
         ball = 0;
         
         // user 값 입력 및 생성
         getUserInput();
         System.out.println("user : " + user[0] + ", " + user[1] + ", " + user[2]); // user 배열 확인
         
         // 스트라이크, 볼 여부 확인
         if(judgeStrike()) {      // judgeStrike() : true
            gamecnt++;
            System.out.println();
            System.out.println("<3 스트라이크 성공> " + gamecnt + "회 실행하여 스트라이크 성공!");
            System.out.println();
            break;
         } else {             // judgeStrike() : false
            gamecnt++;
            System.out.println();
            System.out.println("<3 스트라이크 실패> 스트라이크 : " + strike + ", "+ "볼 : " + ball);
            System.out.println("");
            
            continue;
         }
      }
      // 재진행 여부 확인
      if(reGame()) {   // reGame() : true
         gamecnt = 0;
         continue;
      } else {      // reGame() : false
         break;
      }
   }
}

// 중복 체크
public boolean checkDuplicate(int arr[], int num) {
   for(int k = 0; k < num; k++) {
      if(arr[num] == arr[k]) {
         return true;
      }
   }
   return false;
}

// Comp 랜덤 값 생성
public void generateRandom() {
   for(int i = 0; i < com.length; i++) {
      com[i] = r.nextInt(10);                  // 0`9 사이 랜덤 값 생성
      if(i > 0) {
         if(checkDuplicate(com, i) == true) {   // 중복 체크
            i--;
         }
      }
   }
}

// User 입력 값 생성
public void getUserInput() {
   for(int i = 0; i < user.length; i++) {
      System.out.printf("%d번째 공 입력 > ", i+1);   // 사용자 입력
      user[i] = sc.nextInt();
      if(i > 0) {
         if(checkDuplicate(user, i) == true) {   // 중복 체크
            System.out.println("중복되었습니다. 다시 입력해주세요.");
        	 i--;
         }
      }
   }
}

// 스트라이크, 볼 여부 확인
public boolean judgeStrike() {
   for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
         if(com[i] == user[j]) {   // com[0] - user[0][1][2] 비교 // com[1] - user[0][1][2] 비교 ...
            if(i==j) {
               strike += 1;
            } else {
               ball += 1;
            }
         }
      }
   }
   if(strike == 3) {            // for문 종료 후, Strike가 3이면 true 반환
      return true;
   } else {                  // 그렇지 않으면 false 반환
      return false;
   }
}
   
// 재진행 여부 확인
public boolean reGame() {
   while(true) {                              // 사용자가 질문에 대답할 때까지 반복
      System.out.print("다시 진행 ? (1 다시, 0 종료) > ");   // 재진행 질문
      int n = sc.nextInt();
      if(n==1) {
         return true;
      } else if (n==0) {
         return false;
      } else {                              // 0, 1 아니면 다시 질문
         continue;
      }
   }
}

public static void main(String[] args) {
	NumBaseball_3 fn = new NumBaseball_3(); 
	fn.start();
}

}



