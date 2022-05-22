package URFU.EducationProject.ShoppingService.Infrastructure.Configuration;

import io.micrometer.core.aop.TimedAspect;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrometheusMetricConfig {
    @Bean
    public TimedAspect timedAspect(MeterRegistry registry){
        return new TimedAspect(registry);
    }
}
