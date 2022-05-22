package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events;

import org.springframework.context.ApplicationEvent;

public class SecondTransactionalEvent extends ApplicationEvent {
    public SecondTransactionalEvent(Object source) {
        super(source);
    }
}
