package entity;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import sun.misc.JavaObjectInputStreamAccess;

public class Test {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		
		for (String x : list) {
			System.out.println(x);			
		}
		
		//stream流的方式
		String stream = list.stream().collect(Collectors.joining(","));
		System.out.println(stream);
		//String的join方法亦可
		String StringJoin = String.join(",", list);
		System.out.println(StringJoin);

		
		
		String aString = "abc";
		String bString = "cbd";
		if(aString.equalsIgnoreCase(bString)) {
			System.out.println("相等！");
		}else {
			System.out.println("不相等！");
		}
		
		
		
		
		if(Objects.equals(aString, bString)) {
			System.out.println("---------相等-----------");
		}else {
			System.out.println("---------不相等------------");
		}
		
		System.out.println("-----------------------------------------------");
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("b");
		list1.add("c");
		list1.add("d");
		List<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("d");
		list2.add("e");
		list2.add("c");
		list2.add("m");
		list1.retainAll(list2);
		System.out.println(list1);
		
		
		System.out.println("---------------------------");
		Integer aInteger =null;
		
		System.out.println(aInteger.intValue());
		

	}

}
