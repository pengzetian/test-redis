package com.test.redis;


import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;
import redis.clients.jedis.ShardedJedis;
import redis.clients.jedis.ShardedJedisPool;

public class RedisClient {

	private JedisPool jedisPool ; //非切片连接池
	private ShardedJedisPool shardedJedisPool; // 切片连接池
	private static RedisClient redisClient;
	
	
	
	public void initialPool() {
		JedisPoolConfig config = new JedisPoolConfig();
		config.setMaxTotal(20);
		config.setMaxIdle(5);
		
	}

}
