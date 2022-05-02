package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Publisher;

import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.DepositEvent;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransactionEventsPublisher {
    private final ApplicationEventPublisher publisher;

    public void publisherTransactionEvent(DepositEvent event){
        publisher.publishEvent(event);
    }
}
