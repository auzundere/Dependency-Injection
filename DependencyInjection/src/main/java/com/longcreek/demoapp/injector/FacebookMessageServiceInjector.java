package com.longcreek.demoapp.injector;


import com.longcreek.demoapp.consumer.Consumer;
import com.longcreek.demoapp.consumer.MyDIApplication;
import com.longcreek.demoapp.service.FacebookMessageImpl;

public class FacebookMessageServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new FacebookMessageImpl());
    }
}
