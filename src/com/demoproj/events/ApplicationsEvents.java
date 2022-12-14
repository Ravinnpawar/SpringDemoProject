package com.demoproj.events;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
Event handling in the ApplicationContext is provided through the ApplicationEvent class and ApplicationListener interface.
Hence, if a bean implements the ApplicationListener, then every time an ApplicationEvent gets published to the ApplicationContext,
that bean is notified.
 The ApplicationContext publishes certain types of events when loading the beans. For example, a ContextStartedEvent
 is published when the context is started and ContextStoppedEvent is published when the context is stopped.
Events
1	 ContextRefreshedEvent
This event is published when the ApplicationContext is either initialized or refreshed. This can also be raised using the refresh() method on the ConfigurableApplicationContext interface.

2	 ContextStartedEvent
This event is published when the ApplicationContext is started using the start() method on the ConfigurableApplicationContext interface. You can poll your database or you can restart any stopped application after receiving this event.

3	 ContextStoppedEvent
This event is published when the ApplicationContext is stopped using the stop() method on the ConfigurableApplicationContext interface. You can do required housekeep work after receiving this event.

4	 ContextClosedEvent
This event is published when the ApplicationContext is closed using the close() method on the ConfigurableApplicationContext interface. A closed context reaches its end of life; it cannot be refreshed or restarted.

5	RequestHandledEvent
This is a web-specific event telling all beans that an HTTP request has been serviced.

HANDLING EVENTS
To listen to a context event, a bean should implement the ApplicationListener interface which has just one method
onApplicationEvent(). So let us write an example to see how the events propagates and how you can put your code to do
required task based on certain events.


* */
public class ApplicationsEvents {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("eventlistenerbean.xml");

        // Let us raise a start event.9
        context.start();

        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        obj.getMessage();

        // Let us raise a stop event.
        context.stop();
    }
}
