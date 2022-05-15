package URFU.EducationProject.TransportService.DomainCore.Transport.Impl;

import URFU.EducationProject.TransportService.Configuration.HorseConfiguration;
import URFU.EducationProject.TransportService.DomainCore.Transport.Transport;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class Horse implements Transport, InitializingBean, DisposableBean {

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
