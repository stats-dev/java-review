package chap19_multiThread.clazz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoardDAO_kh {
	public List<Map<String, String>> selectBoardList() {
		List<Map<String, String>> boardList = new ArrayList<Map<String, String>>();
		
		for(int i = 1; i <= 100000; i++) {
			Map<String, String> map = new HashMap<String, String>();
			
			map.put("boardNo", String.valueOf(i));
			map.put("boardTitle", String.valueOf(i));
			map.put("boardContent", String.valueOf(i));
			map.put("boardWriter", String.valueOf(i));
			map.put("boardNo", String.valueOf(i));
			
			/*
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 * 
			 */
			
			
			
			
			
			
			boardList.add(null);
		}
		
		return boardList;
	}

}
