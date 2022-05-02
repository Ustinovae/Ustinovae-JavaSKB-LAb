package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Handlers;

import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.ErrorIndicatorEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ErrorHandler{

    @EventListener
    @Async
    public void onApplicationEvent(ErrorIndicatorEvent event) {
        log.info("Тип ошибки: %s\nОписание: %s".format(event.getErrorType(), event.getDescription()));
    }
}
