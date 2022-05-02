package URFU.EducationProject.TransportService.Infrastructure.EventHandling.Handlers;

import URFU.EducationProject.TransportService.Infrastructure.Annotation.CustomExceptionHandler;
import URFU.EducationProject.TransportService.Infrastructure.Exception.CustomException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice(annotations = CustomExceptionHandler.class)
public class CustomErrorHandler {

    @ExceptionHandler(CustomException.class)
    public ResponseEntity handleException(CustomException e){
        return ResponseEntity.status(502).body(e.getMessage());
    }
}
