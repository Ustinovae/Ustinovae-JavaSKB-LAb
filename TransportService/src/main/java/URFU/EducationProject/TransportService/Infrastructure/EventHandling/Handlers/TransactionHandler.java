package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Handlers;

import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events.DepositEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Component
public class TransactionHandler {

    @TransactionalEventListener(phase = TransactionPhase.AFTER_COMMIT)
    public void onDepositMoney(DepositEvent depositEvent){
        log.info("Транзакция обработана");
    }
}
