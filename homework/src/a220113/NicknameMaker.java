package a220113;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class NicknameMaker {   
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    StringBuffer buffer = new StringBuffer();
    
    Random random = new Random();

    //지역명 받아오기
    System.out.print("살고 있는 지역명을 입력하세요. →");
    String inputD;
    inputD = scanner.nextLine();

    String[] nick1 = { "역시", "답없는", "심각한", "굉장한", "엄청난", "코찔찔이", "세계제일", "당당한", "어리석은", "심심한" };// 별명 수식어 배열

    // 수식어 랜덤으로 추출하기
    List<String> nick1S = Arrays.asList(nick1);
    int i = (int) (Math.random() * nick1.length); // 랜덤 순서
    nick1S.get(i).toString();

    String[] nick2 = { "그", "대벌레", "자벌레", "얼레벌레", "이거다", "얼대벌레", "잼민이", "고인물", "씹덕폭포", "차슈", "촤수", "챠슈", "기쨩형님", "바보",
            "바견민", "젬베", "북", "말하는 감자", "돌멩이"};// 별명 배열

    // 별명 랜덤으로 추출하기
    List<String> nick2S = Arrays.asList(nick2);
    int k = (int) (Math.random() * nick2.length);
    nick2S.get(k).toString();

    System.out.print("별명 : " + inputD + "의 " + nick1S.get(i).toString() + " " + nick2S.get(k).toString());

	}
}

