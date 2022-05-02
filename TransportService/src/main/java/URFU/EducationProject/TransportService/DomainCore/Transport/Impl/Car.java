package URFU.EducationProject.TransportService.DomainCore.Transport.Impl;

import URFU.EducationProject.TransportService.DomainCore.Engine.InternalCombustionEngine;
import URFU.EducationProject.TransportService.DomainCore.Transport.Transport;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import URFU.EducationProject.TransportService.Configuration.*;

@Slf4j
@Component
@AllArgsConstructor
public class Car implements Transport {

    private InternalCombustionEngine engine;

    private CarConfiguration configuration;

    @Autowired
    public void setEngine(InternalCombustionEngine engine) {
        this.engine = engine;
    }

    @Override
    public void start() {
        log.info("Двигатель заведен, мотор рычит, машина греется");
    }

    public void viewName(){
        log.info(configuration.getName());
    }

    @Override
    public void stop() {
        log.info("Двигатель заглушил, чтобы беньзин не расходовать");
    }

    public void ViewEngineModes() {
        for (var engineMode : configuration.getEngineModes()) {
            log.info(engineMode);
        }
    }
}
