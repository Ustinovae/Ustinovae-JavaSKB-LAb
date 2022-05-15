package URFU.EducationProject.TransportService.DomainCore.Transport.Impl;

import URFU.EducationProject.TransportService.Configuration.BicycleConfiguration;
import URFU.EducationProject.TransportService.DomainCore.Transport.Transport;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@AllArgsConstructor
public class Bicycle implements Transport, InitializingBean, DisposableBean {

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

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("init " + getName());
    }

    @Override
    public void destroy() throws Exception {
        log.info("dispose " + getName());
    }
}
