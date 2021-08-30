package com.java.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.java.test.ShowMeBug.StudentVo;

public class Tst9 {
	
	
	public static void main(String[] args) {
		Map<String, String> sMap = new HashMap<String, String>();
		
		sMap.put("a", "A");
		
		int[][] averageScore = new int[6][2];
		
		System.out.println(averageScore[3][1]);
		
		
		List<StudentVo> student = new ArrayList();
		
		Collections.sort(student,new Comparator<StudentVo>() {

			@Override
			public int compare(StudentVo o1, StudentVo o2) {
				// TODO Auto-generated method stub
				return (int)((o1.getTotalScore())-(o2.getTotalScore()));
			}
			
		});
		
		
		
		
		
		
		
	}

}
