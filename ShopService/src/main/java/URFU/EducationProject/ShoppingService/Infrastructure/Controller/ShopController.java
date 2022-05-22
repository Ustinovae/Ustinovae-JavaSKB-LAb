package URFU.EducationProject.ShoppingService.Infrastructure.Controller;

import URFU.EducationProject.ShoppingService.Contracts.AdminRoleDto;
import URFU.EducationProject.ShoppingService.Contracts.PersonRoleDto;
import URFU.EducationProject.ShoppingService.Contracts.PurchaseDto;
import URFU.EducationProject.ShoppingService.Contracts.SupportRoleDto;
import URFU.EducationProject.ShoppingService.Infrastructure.Actuator.TimeNowActuator;
import URFU.EducationProject.ShoppingService.Infrastructure.EventHandling.Exception.CustomException;
import URFU.EducationProject.ShoppingService.Infrastructure.annotation.CustomExceptionHandler;
import URFU.EducationProject.ShoppingService.Infrastructure.Services.ShopManager;
import URFU.EducationProject.ShoppingService.Infrastructure.annotation.OnlineUserCount;
import io.micrometer.core.annotation.Counted;
import io.micrometer.core.annotation.Timed;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;

@RestController()
@RequestMapping("/shop")
@AllArgsConstructor
@CustomExceptionHandler
public class ShopController {
    private ShopManager shopManager;
    private TimeNowActuator actuator;

    @GetMapping("/headers")
    public ResponseEntity getHeaders(@RequestHeader HttpHeaders headers){
        try {
            return ResponseEntity.ok(headers.values());
        }catch (Exception e){
            return  ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping(value = "/custom-error")
    public ResponseEntity getCustomError(@RequestParam boolean exception) throws CustomException {
        if (exception){
            throw new CustomException("It's custom Exception. It's ok");
        }
        return ResponseEntity.ok("Sorry, I don't have error");
    }


    @PutMapping("/index-purchase")
    public ResponseEntity indexPurchase(@RequestBody PurchaseDto purchaseDto){
        try {
            var result = shopManager.indexPurchase(purchaseDto);
            return ResponseEntity.ok(result);
        }catch (Exception e){
            return  ResponseEntity.badRequest().body("Error");
        }
    }

    @GetMapping("/")
    public String getLimit(){
        return "Ok, it's not limit";
    }

    @GetMapping("/public/api/v1")
    public PersonRoleDto getPublicRootName(Authentication authentication){
        return new PersonRoleDto("Person", null);
    }

    @GetMapping("/admin/api/v1")
    public AdminRoleDto getAdminRootName(Authentication authentication){
        var name = authentication.getName();
        var role = authentication.getAuthorities().toArray();
        return new AdminRoleDto(name, role);
    }

    @GetMapping("/support/api/v1")
    public SupportRoleDto getSupportRootName(Authentication authentication){
        var name = authentication.getName();
        var role = authentication.getAuthorities().toArray();
        return new SupportRoleDto(name, role);
    }

    @Counted(value = "get-metrics.count")
    @Timed(value = "get-metrics.time")
    @OnlineUserCount(value = "get-online-user.count")
    @GetMapping("/support/metrics")
    public ResponseEntity getMetrics(){
        return ResponseEntity.ok(actuator.call());
    }
}
