package com.rajneesh.api.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.rajneesh.api.messenger.model.Message;
import com.rajneesh.api.messenger.model.Profile;

public class DatabaseClass {
	private static Map<Long, Message> messages = new HashMap<Long, Message>();
	private static Map<Long, Profile> profiles = new HashMap<Long, Profile>();
	
	public static Map<Long, Message> getMessages(){
		return messages;
	}
	
	public static Map<Long, Profile> getProfiles(){
		return profiles;
	}
}
