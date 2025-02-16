package com.launcher.com.MongoDBLauncher1.utils;

import java.util.UUID;

public class IdGenerator {
	
		static String id;

		public static final String generateId() {
			id =  UUID.randomUUID().toString();
			return id;
		}
		
		public static final String optimalIdGenerator() {
			return id.replace("-", "").substring(0,16);
		}
}
