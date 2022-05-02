package URFU.EducationProject.ShoppingService.Infrastructure.EventHandling.Handler;

import URFU.EducationProject.ShoppingService.Infrastructure.EventHandling.Exception.CustomException;
import URFU.EducationProject.ShoppingService.Infrastructure.annotation.CustomExceptionHandler;
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
