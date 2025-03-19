package day07.ex04_다중상속;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		tv.turnOn();
		tv.setVolum(20);
		int channel= tv.ChannelSearch("sbs");
		tv.setChannel(channel);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 컨텐츠 : ");
		String keyword = sc.nextLine();
		String[] content = tv.contentSearch(keyword);
		for (int i = 0; i < content.length; i++) {
			System.out.println(content[i]);
			if (i<content.length-1) {
				System.out.println(",");
			}
		}
		System.out.println();
		tv.receiveVoice("뉴스틀어줘");
		tv.turnOff();
		sc.close();
	}
}

