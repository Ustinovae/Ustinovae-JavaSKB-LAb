package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEvent;

@Slf4j
public class ErrorIndicatorEvent extends ApplicationEvent {
    private String description;
    private String errorType;

    public ErrorIndicatorEvent(Object source, String description, String errorType) {
        super(source);
        this.description = description;
        this.errorType = errorType;
        log.info("Загорелся индикатор ошибки на панели.");
    }
    public String getDescription(){
        return description;
    }

    public String getErrorType() {
        return errorType;
    }
}
