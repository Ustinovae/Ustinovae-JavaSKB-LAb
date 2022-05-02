package URFU.EducationProject.TransportService.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConstructorBinding
@Profile("test")
@ConfigurationProperties()
public class BicycleConfiguration {

    @Value("${bicycle.name}")
    private String name;

    public String getName(){
        return name;
    }
}
