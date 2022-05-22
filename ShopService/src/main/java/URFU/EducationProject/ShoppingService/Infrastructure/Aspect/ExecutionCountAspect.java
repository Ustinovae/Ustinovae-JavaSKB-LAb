package URFU.EducationProject.ShoppingService.Infrastructure.Aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
@ConfigurationProperties(prefix = "execution-count-aspect")
public class ExecutionCountAspect {
    private int maxCount;
    private int curCount;

    @Around("execution(* URFU.EducationProject.ShoppingService.Infrastructure.Controller.ShopController.getLimit())")
    public Object counter(ProceedingJoinPoint point) throws Throwable {
        if (maxCount > curCount) {
            curCount += 1;
            log.info(String.format("Остаток баланса: %d",curCount));
            return point.proceed();
        }
       return "Лимиту кирдык";
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }
}
