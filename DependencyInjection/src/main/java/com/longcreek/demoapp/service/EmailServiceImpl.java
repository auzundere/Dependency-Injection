package com.longcreek.demoapp.service;

public class EmailServiceImpl implements MessageService {
    @Override
    public void sendMessage(String msg, String rec) {
        System.out.println("Email sent to " + rec + " with Message = " + msg);
    }
}
