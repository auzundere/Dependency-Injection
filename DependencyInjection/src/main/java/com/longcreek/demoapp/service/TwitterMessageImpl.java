package com.longcreek.demoapp.service;

public class TwitterMessageImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Twitter message sent to " + rec + " with Message = "  + msg);
    }
}
