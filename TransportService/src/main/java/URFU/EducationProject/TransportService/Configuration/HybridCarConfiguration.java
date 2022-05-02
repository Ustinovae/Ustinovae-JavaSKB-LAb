package URFU.EducationProject.TransportService.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConstructorBinding
@ConditionalOnBean(BicycleConfiguration.class)
public class HybridCarConfiguration {

    @Value("${hybridCar.engineModes}")
    private List<String> engineModes;

    public List<String> getEngineModes() {
        return engineModes;
    }
}
