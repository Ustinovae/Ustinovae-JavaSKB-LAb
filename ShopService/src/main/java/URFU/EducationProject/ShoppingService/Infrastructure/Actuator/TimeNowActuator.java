package URFU.EducationProject.ShoppingService.Infrastructure.Actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Endpoint(id = "time-now")
public class TimeNowActuator {
    @ReadOperation
    public String call(){
        return LocalDateTime.now().toString();
    }
}
