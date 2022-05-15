package URFU.EducationProject.TransportService.Configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "car")
public class CarConfiguration {
    private List<String> engineModes;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEngineModes() {
        return engineModes;
    }

    public void setEngineModes(List<String> engineModes) {
        this.engineModes = engineModes;
    }
}
