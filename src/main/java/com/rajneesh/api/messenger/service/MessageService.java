package com.rajneesh.api.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rajneesh.api.messenger.database.DatabaseClass;
import com.rajneesh.api.messenger.model.Message;

public class MessageService {
	private Map<Long, Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1l, new Message(1l, "dfdsfdsfds","Rajneesh"));
		messages.put(2l, new Message(2l, "dfdsfdsfds","Rajneesh"));
		messages.put(3l, new Message(3l, "dfdsfdsfds","Rajneesh"));
		messages.put(4l, new Message(4l, "dfdsfdsfds","Rajneesh"));
		messages.put(5l, new Message(5l, "dfdsfdsfds","Rajneesh"));
		messages.put(6l, new Message(6l, "dfdsfdsfds","Rajneesh"));
		messages.put(7l, new Message(7l, "dfdsfdsfds","Rajneesh"));
	}
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(DatabaseClass.getMessages().values());	
	}
	
	public Message getMessage(long id) {
		return DatabaseClass.getMessages().get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(DatabaseClass.getMessages().size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(messages.size() <= 0) {
			return null;
		}
		
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
