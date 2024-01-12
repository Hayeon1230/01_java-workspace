package com.br.mvc.controller;

import java.util.ArrayList;

import com.br.collection.model.vo.Music;

// 사용자의 요청을 처리해주는 클래스
public class MusicController {

	// list == 노래들을 보관하는 보관함
	private ArrayList<Music> list = new ArrayList();
	
	{ // 초기화 블럭 == 샘플데이터를 넣어두고자 할 때 주로 사용
		list.add(new Music("이유 있음을 믿네에", "마커스워십"));
		list.add(new Music("성도의 삶", "WELOVE"));
		list.add(new Music("주 음성 외에는", "김윤진"));
		
		
	}
	// 각 요청을 처리해주는 메소드들
	/**
	 * 전달되는 제목과 가수명으로 새로운 Music객체 생성해서
	 * list에 추가시켜주는 기능
	 * 
	 * @param title		- 사용자가입력한제목값
	 * @param artist	- 사용자가입력한가수명값
	 */
	// 전달되는 제목값과 가수명값으로 새로운 노래를 만들어서 list에 추가시켜주는 메소드
	public void insertMusic(String title, String artist) {
		list.add(new Music(title, artist));
		
	}
	/**
	 * 전체 리스트 반환하는 기능의 메소드
	 * @return
	 */
	public ArrayList<Music> selectMusic() {
		return list; // return은 이 메소드를 호출한 곳으로 값을 돌려주는 것
	}
	
	/**
	 * 삭제할 곡 명을 전달받아서
	 * 해당 리스트로부터 해당곡명의 곡을 찾아서 삭제시켜주는 기능
	 * @param title		- 사용자가 입력한 삭제할 곡명
	 * @return 
	 */
	public int deleteMusic(String title) {
		
		int result = 0; // 삭제한 곡의 갯수
		
		// 현재 곡들의 곡명과 사용자가 입력한 곡명을 일일히 비교
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i); // 해당 곡 삭제
				result++;
				//System.out.println("성공적으로 삭제되었습니다.");
				break;
			}
		}
		
		// restul = 0 (삭제할 곡을 못찾음) || result = 1(성공적으로 삭제함)
		return result;
		
		
	}
	
	public ArrayList<Music> searchMusic(String keyword) {
		
		// 해당 전달된 키워드값이 곡명에 포함되어있는
		// 곡을 찾아야됨
		ArrayList<Music> searchList = new ArrayList<>(); // 검색된 Music객체들을 담을 리스트
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				//해당 조건이 true일 때의 list.get(i) Music객체가 검색된 노래
				//System.out.println(list.get(i));
				//return list.get(i); // return 값이 하나가 아닐 수 있음
				searchList.add(list.get(i));
			}
		}
		// searchList => 텅빈상태 | 검색된 Music객체들이 담겨있는 상태
		return searchList;
		
	}
	
	public int changeMusic(String title, String changeTitle, String changeSinger) {
		int result = 0;
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				
				// 방법1. ArrayList의 set메소드 이용
				// list.set(i,new Music(changeTitle,changeSinger));
				// 주소달라짐
				
				// 방법2. Music객체의 필드값만 따로 수정
				list.get(i).setTitle(changeTitle);
				list.get(i).setSinger(changeSinger);
				
				result++;
				break;
				
				
			}
		}
		return result;
		
		
		
	}
	
}
