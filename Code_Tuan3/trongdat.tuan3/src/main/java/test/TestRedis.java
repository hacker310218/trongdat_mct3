package test;

import redis.clients.jedis.Connection;
import redis.clients.jedis.Jedis;

public class TestRedis {
	public static void main(String[] args) {
		Jedis jedis = new Jedis(
				"redis://default:ul8uOszyLfU7S3z5dCBAyNQYWqb7Cwsq@redis-14645.c9.us-east-1-2.ec2.cloud.redislabs.com:14645");
		Connection connection = jedis.getConnection();

		String username = jedis.get("User");
		System.out.println("Username: " + username);
		
		String password = jedis.get("Password");
		System.out.println("Password: " + password);
	}
}