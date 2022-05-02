package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Events;


import org.springframework.context.ApplicationEvent;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class DepositEvent extends ApplicationEvent {
    private int money;
    public DepositEvent(Object source, int money) {
        super(source);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}
