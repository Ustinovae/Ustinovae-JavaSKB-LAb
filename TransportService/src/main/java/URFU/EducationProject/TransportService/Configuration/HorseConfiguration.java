package URFU.EducationProject.TransportService.Configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConstructorBinding
@ConditionalOnExpression("not '${horse.name}'.equals('default')")
public class HorseConfiguration {
    @Value("${horse.name}")
    private String name;

    public String getName() {
        return name;
    }
}
