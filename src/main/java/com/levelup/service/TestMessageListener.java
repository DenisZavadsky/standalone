package com.levelup.service;

import org.springframework.stereotype.Component;

import javax.jms.Message;
import javax.jms.MessageListener;

/**
 * Created by denis_zavadsky on 6/27/15.
 */
@Component("testMessageListener")
public class TestMessageListener implements MessageListener {

    public void onMessage(Message message) {

    }
}
