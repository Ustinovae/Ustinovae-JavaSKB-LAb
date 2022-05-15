package URFU.EducationProject.TransportService.DomainCore.Transport.Impl;

import URFU.EducationProject.TransportService.DomainCore.Engine.InternalCombustionEngine;
import URFU.EducationProject.TransportService.DomainCore.Transport.Transport;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Motorcycle implements Transport, InitializingBean, DisposableBean {

    @Autowired
    private InternalCombustionEngine engine;

    @Override
    public void start() {
        log.info("Мотик завел, ща прокачусь");
    }

    @Override
    public void stop() {
        log.info("Заглушил двигатель. Мотоцикл, это конечно прикольно, но не в ливень.");
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("init Ducati");
    }

    @Override
    public void destroy() throws Exception {
        log.info("dispose Ducati");
    }
}
