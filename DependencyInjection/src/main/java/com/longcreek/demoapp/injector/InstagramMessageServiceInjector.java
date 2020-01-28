package com.longcreek.demoapp.injector;

import com.longcreek.demoapp.consumer.Consumer;
import com.longcreek.demoapp.consumer.MyDIApplication;
import com.longcreek.demoapp.service.InstagramMessageImpl;

public class InstagramMessageServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new InstagramMessageImpl());
    }
}
