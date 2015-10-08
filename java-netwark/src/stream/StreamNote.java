package stream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @file_name : StreamNote.java
 * @author 	  : apfl1@naver.com
 * @date 	  : 2015. 10. 8.
 * @Story	  : 스트림 문법
 */
public class StreamNote {
	/**
	 * 모든 스트림(데이터의 흐름 : 강줄기, 수돗물) - 두가지 종류가 있다.
	 * 1. 바이트 스트림(튜브의 지름이 작고, 작지만 빠르다.)
	 * 2. 문자 스트림(튜브의 지름이 바이트 두배 크다. 용량이 크다.)
	 * 바이트 스트림은 InputStream => IS로 끝나고
	 * 기본형타입 (prinitive) => P타입
	 * 객체형타입 (reference) => R타입
	 * DataIS(OS) : P타입
	 * ObjectIS(OS) : R타입
	 * BufferedIS(OS) : 바이트를 버퍼에 저장했다가 한꺼번에 입출력
	 * 문자 스트림은 Reader(Writer) => getter, setter 를 클래화 한 형상
	 */
	
	 public static void main(String[] args) {
		 String fileName = "C:\\Users\\HB0201\\Desktop\\temp\\test.txt" , buffer ="";
		 
		 BufferedWriter bw;
		 BufferedReader br;
		try {
			 bw = new BufferedWriter(new FileWriter(new File(fileName)));
			 bw.write("안녕");
			 bw.newLine(); //System.out.println();
			 bw.write("반갑다. 패턴아...");
			 bw.close(); // 항상 닫아주어야 저장이 됨. 카톡에서 문자를 쓰고 엔터를 누르는 것과 동일
			 
			 
			 br = new BufferedReader(new FileReader(new File(fileName)));
			 while ((buffer =br.readLine()) != null) { // 읽어들인 내용 끝까지
				 System.out.println(buffer);
				
			}
			 br.close(); // 마찬가지로 꼭 닫아야함
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
