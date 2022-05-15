package URFU.EducationProject.TransportService.DomainCore.Transport.Impl;


import URFU.EducationProject.TransportService.Configuration.HybridCarConfiguration;
import URFU.EducationProject.TransportService.DomainCore.Engine.Engine;
import URFU.EducationProject.TransportService.DomainCore.Transport.Transport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class HybridСar implements Transport, InitializingBean, DisposableBean {

    private Engine electric;
    private Engine internalCombustion;

    private HybridCarConfiguration configuration;

    public HybridСar(@Qualifier("electric") Engine electricEngine,
                     @Qualifier("internalCombustion") Engine internalCombustionEngine,
                     HybridCarConfiguration configuration) {
        electric = electricEngine;
        internalCombustion = internalCombustionEngine;
        this.configuration = configuration;
    }

    @Override
    public void start() {
        log.info("Двигатель заведен, мотор рычит, машина греется.");
        log.info("Электродвигатель отключен до начала движения.");
    }

    @Override
    public void stop() {
        log.info("Двигатель заглушил, чтобы беньзин не расходовать.");
        log.info("Электродвигатель, вроде, не работает.");
    }

    public void ViewEngineModes() {
        for (var engineMode : configuration.getEngineModes()) {
            log.info(engineMode);
        }
    }

    public String getName(){
        return configuration.getName();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("init " + getName());
    }

    @Override
    public void destroy() throws Exception {
        log.info("dispose " + getName());
    }
}