package com.java.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * ���ڳ�������һ��ѧ���ɼ����ݣ�getScoreList()���ؽ������ÿ������Ϊĳ��ѧ����ĳ�Ƴɼ���ѧ���ɼ����ܲ���4�ƶ��У�������ȱ�ơ�
 * Ҫ����������ݽ�������ת���ͼ��㴦��ת����ѧ����¼�б�ÿ����¼������4�Ƴɼ����ܳɼ������ڴ˻����ϼ���ȫ���ƽ���ɼ���
 * Ҫ���б��ܳɼ��Ӹߵ������򡣼���ƽ���ɼ�ʱ���뿼��ȱ��ʱ�������
 * ��Ҫע����ǣ�������ɴ���Ĵ����������߼��Ƿ�����������/���������Ƿ����ȣ�������Ϊ�����׼��һ����
 * ��������¸�ʽ����̨�������
 * ����    ��ѧ  ����  Ӣ��  ����  �ܳɼ�
 * ����    77   82   90   65   434
 * ����    65   84   89       316
 * ����    89   76       76   313
 * ��
 * ƽ���ɼ� 83.5  70.5  78   82.5  314.5
 */
public class ShowMeBug {
	public static void main(String[] args) {
		new ShowMeBug().test();
	}

	public void test() {
		List<ScoreVo> scoreList = getScoreList();
		// TODO ���д����ʵ����ĿҪ��
		Map<String, StudentVo> studentList = new HashMap<String, StudentVo>();
		// ��ʼ��
		StudentVo studentVo;
		String studentName;
		for (ScoreVo scoreVo : scoreList) {
			studentName = scoreVo.studentName;
			// ���ڸ�ѧ��
			if (!studentList.containsKey(studentName)) {
				studentList.put(studentName, new StudentVo());
				studentList.get(studentName).setName(studentName);
			}
			studentVo = studentList.get(studentName);
			if (scoreVo.courseName == "����") {
				studentVo.setChineseScore(scoreVo.score);
			} else if (scoreVo.courseName == "��ѧ") {
				studentVo.setMathScore(scoreVo.score);
			} else if (scoreVo.courseName == "Ӣ��") {
				studentVo.setEnglishScore(scoreVo.score);
			} else {
				studentVo.setPhysicalScore(scoreVo.score);
			}
		}
		int[][] averageScore = new int[6][2];
		/* [][x] : 0 �ɼ� ��1 ����
		 * averageScore
		 * 1 :  ���ĳɼ� 
		 * 2 �� ��ѧ�ɼ�
		 * 3 �� Ӣ��ɼ�
		 * 4 �� ����ɼ�
		 * 5 :  ƽ���ɼ�
		 * ������� averageScore[x][0] / averageScore[x][1]
		 * 
		 */
		for(Map.Entry<String, StudentVo> entry: studentList.entrySet()) {
			
			entry.getValue().totalScore = entry.getValue().chineseScore + entry.getValue().englishScore + entry.getValue().mathScore + entry.getValue().physicalScore;
			
			//ͳ������
			if(entry.getValue().chineseScore != 0) {
				averageScore[1][0] += entry.getValue().chineseScore;
				averageScore[1][1] ++;
			}
			if (entry.getValue().englishScore != 0) {
				averageScore[2][0] += entry.getValue().englishScore;
				averageScore[2][1] ++;
			}
			if(entry.getValue().mathScore != 0) {
				averageScore[3][0] += entry.getValue().mathScore;
				averageScore[3][1] ++;
			}
			if(entry.getValue().physicalScore != 0) {
				averageScore[4][0] += entry.getValue().physicalScore;
				averageScore[4][1] ++;
			}
			averageScore[5][0] += entry.getValue().totalScore;
			averageScore[5][1] ++;		
		}

		List<StudentVo> student = new ArrayList(studentList.values());
		
		Collections.sort(student,new Comparator<StudentVo>() {

			@Override
			public int compare(StudentVo o1, StudentVo o2) {
				// TODO Auto-generated method stub
				return (int)((o2.getTotalScore())-(o1.getTotalScore()));
			}
			
		});
		
		
		
		
		System.out.println("����\t��ѧ\t����\tӢ��\t����\t�ܳɼ�");

		for(StudentVo stu:student) {
			System.out.println(stu.name + "\t" + stu.mathScore + "\t" + stu.chineseScore + "\t" + stu.englishScore +"\t" + stu.physicalScore + "\t" + stu.totalScore);
		}
		
		System.out.println("ƽ���ɼ�" + averageScore[2][0]/averageScore[2][1] + "\t" + averageScore[1][0]/averageScore[1][1] + "\t" +averageScore[3][0]/averageScore[3][1] + "\t" +averageScore[4][0]/averageScore[4][1] + "\t"+ averageScore[5][0]/averageScore[5][1]);
		
		System.out.println(scoreList.size());
	}

	public List<ScoreVo> getScoreList() {
		List<ScoreVo> scoreList = new ArrayList<ScoreVo>();
		scoreList.add(new ScoreVo("����", "����", 80));
		scoreList.add(new ScoreVo("����", "����", 76));
		scoreList.add(new ScoreVo("����", "����", 78));
		scoreList.add(new ScoreVo("éʮ��", "Ӣ��", 65));
		scoreList.add(new ScoreVo("����", "��ѧ", 88));
		scoreList.add(new ScoreVo("����", "����", 87));
		scoreList.add(new ScoreVo("����", "����", 67));
		scoreList.add(new ScoreVo("����", "��ѧ", 76));
		scoreList.add(new ScoreVo("����", "Ӣ��", 89));
		scoreList.add(new ScoreVo("����", "��ѧ", 65));
		scoreList.add(new ScoreVo("����", "����", 95));
		scoreList.add(new ScoreVo("����", "Ӣ��", 78));
		scoreList.add(new ScoreVo("����", "����", 65));
		scoreList.add(new ScoreVo("����", "����", 89));
		scoreList.add(new ScoreVo("����", "Ӣ��", 87));
		scoreList.add(new ScoreVo("����", "����", 78));
		scoreList.add(new ScoreVo("����", "��ѧ", 65));
		scoreList.add(new ScoreVo("����", "Ӣ��", 87));
		scoreList.add(new ScoreVo("����", "Ӣ��", 56));
		scoreList.add(new ScoreVo("����", "����", 76));
		scoreList.add(new ScoreVo("����", "��ѧ", 89));
		scoreList.add(new ScoreVo("����", "Ӣ��", 98));
		scoreList.add(new ScoreVo("����", "����", 56));
		scoreList.add(new ScoreVo("����", "����", 76));
		scoreList.add(new ScoreVo("Ǯ��", "����", 88));
		scoreList.add(new ScoreVo("Ǯ��", "��ѧ", 67));
		scoreList.add(new ScoreVo("éʮ��", "��ѧ", 43));
		scoreList.add(new ScoreVo("Ǯ��", "Ӣ��", 75));
		scoreList.add(new ScoreVo("éʮ��", "����", 45));
		scoreList.add(new ScoreVo("éʮ��", "����", 56));

		return scoreList;
	}

	class ScoreVo {
		public String studentName;
		public String courseName;
		public double score;

		public ScoreVo(String studentName, String courseName, double score) {
			this.studentName = studentName;
			this.courseName = courseName;
			this.score = score;
		}

		public String toString() {
			return this.studentName + "\t" + this.courseName + "\t" + this.score;
		}
	}

	class StudentVo {
		private String name;
		private double chineseScore;
		private double mathScore;
		private double englishScore;
		private double physicalScore;
		private double totalScore;

		public StudentVo() {

		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public double getChineseScore() {
			return chineseScore;
		}

		public void setChineseScore(double chineseScore) {
			this.chineseScore = chineseScore;
		}

		public double getMathScore() {
			return mathScore;
		}

		public void setMathScore(double mathScore) {
			this.mathScore = mathScore;
		}

		public double getEnglishScore() {
			return englishScore;
		}

		public void setEnglishScore(double englishScore) {
			this.englishScore = englishScore;
		}

		public double getPhysicalScore() {
			return physicalScore;
		}

		public void setPhysicalScore(double physicalScore) {
			this.physicalScore = physicalScore;
		}

		public double getTotalScore() {
			return totalScore;
		}

		public void setTotalScore(double totalScore) {
			this.totalScore = totalScore;
		}
	}
}
