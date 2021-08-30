package com.java.Yredis;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.HostAndPort;
public class YuRedisCon {
	public static void main(String[] args) throws IOException {
		

		Set<HostAndPort> nodes = new LinkedHashSet<HostAndPort>();
		nodes.add(new HostAndPort("172.16.40.141", 7001));
		nodes.add(new HostAndPort("172.16.40.141", 7000));
		nodes.add(new HostAndPort("172.16.40.141", 7002));
		nodes.add(new HostAndPort("172.16.40.141", 7004));
		nodes.add(new HostAndPort("172.16.40.141", 7003));
		nodes.add(new HostAndPort("172.16.40.141", 7005));
		JedisCluster cluster = new JedisCluster(nodes);
		
		//JedisCluster cluster = new JedisCluster(nodes, poolConfig);
		String name = cluster.get("CCBC_C060000004_openDay");
		System.out.println(name);
		
		//cluster.set("CCBC_C060000004_openDay", "18");
		
		//System.out.println(cluster.get("age"));
		cluster.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
