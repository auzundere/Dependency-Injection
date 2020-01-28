package com.longcreek.demoapp.injector;

import com.longcreek.demoapp.DemoAppApplication;
import com.longcreek.demoapp.consumer.Consumer;
import com.longcreek.demoapp.consumer.MyDIApplication;
import com.longcreek.demoapp.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector{
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new EmailServiceImpl());
    }
}
