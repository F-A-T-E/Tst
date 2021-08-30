package com.java.test;

import com.alibaba.fastjson.JSONObject;

public class test7 {

	public static void main(String[] args) {
		Student stu = new Student("公众号编程大道", "m", 2);

		// Java对象转化为JSON对象
		JSONObject jsonObject = (JSONObject) JSONObject.toJSON(stu);
		System.out.println("Java对象转化为JSON对象\n" + jsonObject);// {"name":"公众号编程大道","age":2,"sex":"m"}

		// Java对象转换成JSON字符串
		String stuString = JSONObject.toJSONString(stu);
		System.out.println("Java对象转换成JSON字符串\n" + stuString);// {"age":2,"name":"公众号编程大道","sex":"m"}
		
		
		  
		 //JSON对象转换为JSON字符串
		 String jsonString = jsonObject.toJSONString();
		 System.out.println("JSON对象转换为JSON字符串\n" + jsonString);//{"name":"公众号编程大道","age":2,"sex":"m"}
		 
		//JSON对象转换成Java对象
	        Student student = JSONObject.toJavaObject(jsonObject, Student.class);
	        System.out.println("JSON对象转换成Java对象\n" + student);//Student{name='公众号编程大道', sex='m', age=2}
	      
	        
	        String stuString1 = "{\"age\":2,\"name\":\"公众号编程大道\",\"sex\":\"m\"}";

	        //JSON字符串转换成JSON对象
	        JSONObject jsonObject1 = JSONObject.parseObject(stuString1);
	        System.out.println("JSON字符串转换成JSON对象\n" + jsonObject1);//{"sex":"m","name":"公众号编程大道","age":2}
	        
	        
	        

	        //JSON字符串转换成Java对象
	        Student student1 = JSONObject.parseObject(stuString1, Student.class);
	        System.out.println("JSON字符串转换成Java对象\n" + student1);//Student{name='公众号编程大道', sex='m', age=2}

	   

	

	}

}
