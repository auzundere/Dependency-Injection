package com.longcreek.demoapp.service;

public class InstagramMessageImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Instagram message sent to " + rec + " with Message = " + msg);
    }
}
