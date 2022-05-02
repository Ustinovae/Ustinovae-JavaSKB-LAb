package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Handlers;

import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.UpgradeEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UpgradeHandler {

    @EventListener
    public void onApplicationEvent(UpgradeEvent event) {
        log.info(String.format("Новая прошивка: %s", event.getMessage()));
    }
}
