package com.java.test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 现在程序中有一组学生成绩数据（getScoreList()返回结果），每条数据为某个学生的某科成绩。学生成绩可能不是4科都有，可能有缺科。
 * 要求对这组数据进行数据转换和计算处理，转换成学生记录列表，每条记录里面有4科成绩和总成绩，并在此基础上计算全班的平均成绩。
 * 要求列表按总成绩从高到低排序。计算平均成绩时，请考虑缺课时的情况。
 * 需要注意的是，最终完成代码的代码质量（逻辑是否清晰，变量/方法命名是否合理等），将作为考察标准的一部分
 * 结果按以下格式控制台输出即可
 * 姓名    数学  语文  英语  物理  总成绩
 * 王五    77   82   90   65   434
 * 张三    65   84   89       316
 * 李四    89   76       76   313
 * …
 * 平均成绩 83.5  70.5  78   82.5  314.5
 */
public class ShowMeBug {
	public static void main(String[] args) {
		new ShowMeBug().test();
	}

	public void test() {
		List<ScoreVo> scoreList = getScoreList();
		// TODO 请编写代码实现题目要求
		Map<String, StudentVo> studentList = new HashMap<String, StudentVo>();
		// 初始化
		StudentVo studentVo;
		String studentName;
		for (ScoreVo scoreVo : scoreList) {
			studentName = scoreVo.studentName;
			// 存在该学生
			if (!studentList.containsKey(studentName)) {
				studentList.put(studentName, new StudentVo());
				studentList.get(studentName).setName(studentName);
			}
			studentVo = studentList.get(studentName);
			if (scoreVo.courseName == "语文") {
				studentVo.setChineseScore(scoreVo.score);
			} else if (scoreVo.courseName == "数学") {
				studentVo.setMathScore(scoreVo.score);
			} else if (scoreVo.courseName == "英语") {
				studentVo.setEnglishScore(scoreVo.score);
			} else {
				studentVo.setPhysicalScore(scoreVo.score);
			}
		}
		int[][] averageScore = new int[6][2];
		/* [][x] : 0 成绩 ，1 人数
		 * averageScore
		 * 1 :  语文成绩 
		 * 2 ： 数学成绩
		 * 3 ： 英语成绩
		 * 4 ： 物理成绩
		 * 5 :  平均成绩
		 * 最终输出 averageScore[x][0] / averageScore[x][1]
		 * 
		 */
		for(Map.Entry<String, StudentVo> entry: studentList.entrySet()) {
			
			entry.getValue().totalScore = entry.getValue().chineseScore + entry.getValue().englishScore + entry.getValue().mathScore + entry.getValue().physicalScore;
			
			//统计数据
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
		
		
		
		
		System.out.println("姓名\t数学\t语文\t英语\t物理\t总成绩");

		for(StudentVo stu:student) {
			System.out.println(stu.name + "\t" + stu.mathScore + "\t" + stu.chineseScore + "\t" + stu.englishScore +"\t" + stu.physicalScore + "\t" + stu.totalScore);
		}
		
		System.out.println("平均成绩" + averageScore[2][0]/averageScore[2][1] + "\t" + averageScore[1][0]/averageScore[1][1] + "\t" +averageScore[3][0]/averageScore[3][1] + "\t" +averageScore[4][0]/averageScore[4][1] + "\t"+ averageScore[5][0]/averageScore[5][1]);
		
		System.out.println(scoreList.size());
	}

	public List<ScoreVo> getScoreList() {
		List<ScoreVo> scoreList = new ArrayList<ScoreVo>();
		scoreList.add(new ScoreVo("张三", "语文", 80));
		scoreList.add(new ScoreVo("张三", "物理", 76));
		scoreList.add(new ScoreVo("李四", "语文", 78));
		scoreList.add(new ScoreVo("茅十八", "英语", 65));
		scoreList.add(new ScoreVo("李四", "数学", 88));
		scoreList.add(new ScoreVo("李四", "物理", 87));
		scoreList.add(new ScoreVo("王五", "语文", 67));
		scoreList.add(new ScoreVo("张三", "数学", 76));
		scoreList.add(new ScoreVo("李四", "英语", 89));
		scoreList.add(new ScoreVo("王五", "数学", 65));
		scoreList.add(new ScoreVo("赵六", "物理", 95));
		scoreList.add(new ScoreVo("王五", "英语", 78));
		scoreList.add(new ScoreVo("王五", "物理", 65));
		scoreList.add(new ScoreVo("赵六", "语文", 89));
		scoreList.add(new ScoreVo("赵六", "英语", 87));
		scoreList.add(new ScoreVo("黄七", "语文", 78));
		scoreList.add(new ScoreVo("黄七", "数学", 65));
		scoreList.add(new ScoreVo("刘八", "英语", 87));
		scoreList.add(new ScoreVo("张三", "英语", 56));
		scoreList.add(new ScoreVo("黄七", "物理", 76));
		scoreList.add(new ScoreVo("刘八", "数学", 89));
		scoreList.add(new ScoreVo("黄七", "英语", 98));
		scoreList.add(new ScoreVo("刘八", "语文", 56));
		scoreList.add(new ScoreVo("刘八", "物理", 76));
		scoreList.add(new ScoreVo("钱九", "语文", 88));
		scoreList.add(new ScoreVo("钱九", "数学", 67));
		scoreList.add(new ScoreVo("茅十八", "数学", 43));
		scoreList.add(new ScoreVo("钱九", "英语", 75));
		scoreList.add(new ScoreVo("茅十八", "语文", 45));
		scoreList.add(new ScoreVo("茅十八", "物理", 56));

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
