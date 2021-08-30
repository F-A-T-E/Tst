package Md5;

import java.nio.file.Files;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import org.omg.CORBA.PRIVATE_MEMBER;
import com.sun.org.apache.bcel.internal.generic.NEW;
import com.yx.lnmp.util.DateUtil;

public class MessageDigist {

	public static void main(String[] args) throws Exception {
		/*
		 * byte[] result = null;
		 * 
		 * String source = "1234567890"; MessageDigest md =
		 * MessageDigest.getInstance("MD5"); md.reset();
		 * md.update(source.getBytes("UTF-8")); result = md.digest();
		 */		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(DateUtil.add(new SimpleDateFormat("yyyy-MM-dd").parse("2021-01-14"), -1)));
	}
}