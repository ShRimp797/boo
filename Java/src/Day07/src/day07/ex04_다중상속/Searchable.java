package day07.ex04_다중상속;

public interface Searchable {
	//채널 검색
	//검색에 해닿하는 채넣번호를변환
	
	int ChannelSearch (String keyword);
	//컨텐츠컴색
	//검색어에 해당하는 컨텐츠를 반환
	String[] contentSearch(String keyword);
}
