package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events;

import org.springframework.context.ApplicationEvent;

public class FirstTransactionalEvent extends ApplicationEvent {
    public FirstTransactionalEvent(Object source) {
        super(source);
    }
}
