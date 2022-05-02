package URFU.EducationProject.TransportService.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConstructorBinding
public class CarConfiguration {

    @Value("${car.engineModes}")
    private List<String> engineModes;

    @Value("${car.name}")
    private String name;

    public String getName() {
        return name;
    }

    public List<String> getEngineModes() {
        return engineModes;
    }
}
