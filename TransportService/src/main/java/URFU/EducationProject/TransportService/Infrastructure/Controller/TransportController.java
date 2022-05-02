package URFU.EducationProject.TransportService.Infrastructure.Controller;

import URFU.EducationProject.TransportService.Contracts.*;
import URFU.EducationProject.TransportService.Infrastructure.Services.TransportService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("/transport")
@AllArgsConstructor
public class TransportController {
     private final TransportService transportService;

    @GetMapping("/start")
    public ResponseEntity start(){
        try {
            transportService.startTransport();
            return ResponseEntity.ok("Transport Run");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("/stop")
    public ResponseEntity stop(){
        try {
            transportService.stopTransport();
            return ResponseEntity.ok("Transport stop");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("/view-modes")
    public ResponseEntity viewEngineModes(){
        try {
            transportService.viewEngineModes();
            return ResponseEntity.ok("Write");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("/view-name")
    public ResponseEntity viewName(){
        try {
            transportService.viewName();
            return ResponseEntity.ok("Write");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PutMapping(value = "/error-message", consumes = "application/json", produces = "application/json")
    public ResponseEntity errorLoad(@RequestBody ErrorEventDto request){
        try {
            transportService.createError(request.getErrorType(), request.getDescription());
            return ResponseEntity.ok("Error received");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }

    @PutMapping(value = "/upgrade-message", consumes = "application/json", produces = "application/json")
    public ResponseEntity upgradeLoad(@RequestBody UpgradeEventDto request){
        try {
            transportService.upgradeLoad(request.getMessage());
            return ResponseEntity.ok("Error received");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error");
        }
    }
}
