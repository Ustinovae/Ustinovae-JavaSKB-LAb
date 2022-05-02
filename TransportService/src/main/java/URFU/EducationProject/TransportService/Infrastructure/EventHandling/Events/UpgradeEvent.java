package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

@Slf4j
public class UpgradeEvent extends ApplicationEvent {
    private String message;

    public UpgradeEvent(Object source, String message) {
        super(source);
        this.message = message;
        log.info("Достпуно новое обновление.");
    }

    public String getMessage() {
        return message;
    }
}
