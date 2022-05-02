package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Publisher;

import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.ErrorIndicatorEvent;
import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.UpgradeEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransportInfoEventsPublisher {
    private final ApplicationEventPublisher publisher;

    public void publishErrorIndicatorEvent(String errorType, String description){
        var errorIndicatorEvent = new ErrorIndicatorEvent(this, description, errorType);
        publisher.publishEvent(errorIndicatorEvent);
    }

    public void publishUpgradeEvent(String message){
        var upgradeEvent = new UpgradeEvent(this, message);
        publisher.publishEvent(upgradeEvent);
    }
}
