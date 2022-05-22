package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Publisher;

import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.FirstTransactionalEvent;
import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.SecondTransactionalEvent;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
@RequiredArgsConstructor
@Slf4j
public class TransactionEventsPublisher {
    private final ApplicationEventPublisher publisher;

    @Transactional
    public void publisherFirstTransactionEvent(){
        var event = new FirstTransactionalEvent("This first");
        publisher.publishEvent(event);
        log.info("Транзакция First опубликована");
    }

    @Transactional
    public void publisherSecondTransactionEvent(){
        var event = new SecondTransactionalEvent("This second");
        publisher.publishEvent(event);
        log.info("Транзакция Second опубликована");
    }
}
