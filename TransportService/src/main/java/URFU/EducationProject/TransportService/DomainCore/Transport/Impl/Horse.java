package URFU.EducationProject.TransportService.DomainCore.Transport.Impl;

import URFU.EducationProject.TransportService.Configuration.HorseConfiguration;
import URFU.EducationProject.TransportService.DomainCore.Transport.Transport;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class Horse implements Transport {

    private HorseConfiguration configuration;

    public void viewName(){
        log.info(configuration.getName());
    }

    @Override
    public void start() {
        log.info("Шевелись, плотва");
    }

    @Override
    public void stop() {
        log.info("Стой. Брр");
    }
}
