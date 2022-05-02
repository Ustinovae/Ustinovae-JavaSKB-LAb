package URFU.EducationProject.TransportService.Infrastructure.Services;

import URFU.EducationProject.TransportService.DomainCore.Transport.Impl.*;
import URFU.EducationProject.TransportService.Infrastructure.EventHandling.Publisher.TransportInfoEventsPublisher;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.stereotype.Service;


@Slf4j
@Service
@AllArgsConstructor
@ConstructorBinding
public class TransportService {

    private Car car;
    private Motorcycle motorcycle;
    private HybridСar hybridСar;
    private Horse horse;
    private Bicycle bicycle;

    private final TransportInfoEventsPublisher publisher;

    public void startTransport() {
        if (car != null) car.start();
        if (motorcycle != null) motorcycle.start();
        if (hybridСar != null) hybridСar.start();
        if (horse != null) horse.start();
        if (bicycle != null) bicycle.start();
    }

    public void stopTransport() {
        if (car != null) car.stop();
        if (motorcycle != null) motorcycle.stop();
        if (hybridСar != null) hybridСar.stop();
        if (horse != null) horse.stop();
        if (bicycle != null) bicycle.stop();
    }

    public void viewEngineModes() {
        if (hybridСar != null) hybridСar.ViewEngineModes();
        if (car != null) car.ViewEngineModes();
    }

    public void viewName() {
        if (horse != null) horse.viewName();
        if (car != null) car.viewName();
        if (bicycle != null) bicycle.viewName();
    }

    public void createError(String errorType, String description){
        publisher.publishErrorIndicatorEvent(errorType, description);
    }

    public void upgradeLoad(String message){
        publisher.publishUpgradeEvent(message);
    }
}
