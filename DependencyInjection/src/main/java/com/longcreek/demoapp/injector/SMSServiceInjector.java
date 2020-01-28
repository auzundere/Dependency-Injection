package com.longcreek.demoapp.injector;

import com.longcreek.demoapp.DemoAppApplication;
import com.longcreek.demoapp.consumer.Consumer;
import com.longcreek.demoapp.consumer.MyDIApplication;
import com.longcreek.demoapp.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApplication(new SMSServiceImpl());
    }
}
