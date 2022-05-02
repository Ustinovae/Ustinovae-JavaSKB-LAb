package URFU.EducationProject.TransportService.DomainCore.Transport.Impl;

import URFU.EducationProject.TransportService.DomainCore.Transport.Transport;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import URFU.EducationProject.TransportService.Configuration.BicycleConfiguration;

@Slf4j
@Component
@AllArgsConstructor
public class Bicycle implements Transport {

    private BicycleConfiguration configuration;

    @Override
    public void start() {
        log.info("Вроде колеса не спущены, можно крутить педали");
    }

    @Override
    public void stop() {
        log.info("Круто покатался, но на машине комфортней");
    }

    public String getName(){
        return configuration.getName();
    }

    public void viewName(){
        log.info(getName());
    }
}
