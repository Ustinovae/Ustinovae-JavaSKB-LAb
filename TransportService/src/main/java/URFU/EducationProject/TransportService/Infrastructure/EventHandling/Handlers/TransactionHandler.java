package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Handlers;

import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.FirstTransactionalEvent;
import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.SecondTransactionalEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class TransactionHandler {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMPLETION)
    public void onBeforeCommitEvent(FirstTransactionalEvent event){
        log.info("Транзакция First обработана" + event);
    }

    @TransactionalEventListener(phase = TransactionPhase.AFTER_ROLLBACK)
    public void onAfterRollbackEvent(SecondTransactionalEvent event){
        log.info("Транзакция Second обработана" + event);
    }
}
