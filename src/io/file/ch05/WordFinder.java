package io.file.ch05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordFinder {

	// 공백 기준으로 자르기. 가장 많이 쓰여진 단어 찾아내기
	public static void main(String[] args) {

		String fileName = "Seoul.txt";

		try (FileInputStream fis = new FileInputStream(fileName);
				InputStreamReader isr = new InputStreamReader(fis);
				BufferedReader br = new BufferedReader(isr)) {

			// 단어 빈도를 저장하기 위한 HashMap 생성
			Map<String, Integer> wordCountMap = new HashMap<>();
			String line;
			while ((line = br.readLine()) != null) { // != null 일때까지 데이터를 읽어라.
				String[] words = line.split("\\s+"); // 한 라인을 읽을 만큼의 배열이 생성, \\s+ : 공백 기준

				// 분리된 단어들을 반복 처리
				for (String word : words) {
					//System.out.println("word : " + word);

					// 빈 문자열이 아닐 경우에만 처리
					if (!word.isEmpty()) {
						// getOrDefault - 분리한 word 단어가 이미 map 구조에 존재한다면 
						// 현재 값을 가져오고 없다면 0을 반환한다.
						// wordCountMap key - String
						// wordCountMap value - Integer
						wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1); 
						// 처음이라면 0을 셋팅. 그게 아니라면 + 1
					}
				}
			} // end of while

			String mostCommon = null; // 가장 많이 담을 변수
			int maxCount = 0;
			
			// Key와 value가 set 계열로 변환이 된다. 
			for(Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
				if(entry.getValue() > maxCount) {
					mostCommon = entry.getKey();
					maxCount = entry.getValue();
				}
			}
			
			System.out.println("가장 많이 사용된 단어 : " + mostCommon + "," + maxCount + "회");
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // end of main
} // end of class
