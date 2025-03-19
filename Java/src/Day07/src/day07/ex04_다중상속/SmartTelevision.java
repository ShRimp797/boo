package day07.ex04_다중상속;

import java.text.MessageFormat;

//다중 구현
//public class 클래스명 implement 인터페이스a인터페이스B
public class SmartTelevision implements SmartRmoteControl,Searchable{
		int Volume;
		int channel;
		String Keyword;
		int x,y;
	
		@Override
		public void turnOn() {
			System.out.println("전원 on");
			
		}
		@Override
		public void turnOff() {
			System.out.println("전원 off");
			
		}
		@Override
		public void setVolum(int Volume) {
			this.Volume = Volume;
			
		}
		@Override
		public void setChannel(int channel) {
			this.channel = channel;
			System.out.println("channel" + channel);
		}
		@Override
		public String receiveVoice(String voice) {
			System.out.println("음성입력 : " + voice);
			return "voice : " + voice;
		}
		@Override
		public int ChannelSearch(String keyword) {
			int channel = 0;
			switch (keyword) {
			case "sbs" : channel = 5; break;  
			case "kbs" : channel = 7; break;  
			case "mbc" : channel = 11; break;  
			case "mnet" : channel = 27; break;  
			case "ena" : channel = 30; break;  
			}
			return channel;
		}
		@Override
		public void touch(int x, int y) {
			this.x = x;
			this.y = y;
			System.out.println("(x,y) : " + MessageFormat.format("{}, {}",x,y));
			
		}
		@Override
		public String[] contentSearch(String keyword) {
			String[] movieContents = {"포레스트 검프", "신세계", "러덜리스", "마녀", "말할수없는 비밀"};
			String[] idolContents = {"아이브", "블랙핑크", "Bts", "에스파", "뉴진스"};
			String[] recommentContents = {"노빠꾸", "경영자들", "핑계고", "굿데이", "알클"};
			String[] ChoiceContents;
			switch (keyword) {
			case "영화":
				ChoiceContents = movieContents;
				break;
			case "아이돌":
				ChoiceContents =  idolContents;
				break;
			
			default:
				ChoiceContents = recommentContents;
				break;
			}
 			return ChoiceContents;
		}
		
		

		
		
	}

