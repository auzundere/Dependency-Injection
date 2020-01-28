package com.longcreek.demoapp.test;

import com.longcreek.demoapp.consumer.Consumer;
import com.longcreek.demoapp.injector.*;

public class MyMessageDITest {
    public static void main(String[] args) {

        String msg = "Hi Abdullah";

        String email = "auzundere@gmail.com";
        String phone = "210 421 2419";

        String fbAccountId = "auzundere";
        String twitterAccountId = "merabdu";
        String instagramAccountId = "auzundere42";

        MessageServiceInjector injector = null;
        Consumer app = null;

        //Send Email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);

        //Send SMS
        injector = new SMSServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);

        //Send Faceboom Message
        injector = new FacebookMessageServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, fbAccountId);

        //Send Twitter Message
        injector = new TwitterMessageServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, twitterAccountId);

        //Send Instagram Message
        injector = new InstagramMessageServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, instagramAccountId);

    }


}
