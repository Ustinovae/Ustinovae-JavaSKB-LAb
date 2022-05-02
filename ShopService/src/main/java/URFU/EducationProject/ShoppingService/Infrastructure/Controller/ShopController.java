package URFU.EducationProject.ShoppingService.Infrastructure.Controller;

import URFU.EducationProject.ShoppingService.Contracts.PurchaseDto;
import URFU.EducationProject.ShoppingService.Infrastructure.EventHandling.Exception.CustomException;
import URFU.EducationProject.ShoppingService.Infrastructure.annotation.CustomExceptionHandler;
import URFU.EducationProject.ShoppingService.Infrastructure.Services.ShopManager;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/shop")
@AllArgsConstructor
@CustomExceptionHandler
public class ShopController {
    private ShopManager shopManager;

//    private final BuyService buyService;
//
//    @GetMapping("/deposit-money")
//    public ResponseEntity depositMoney(@RequestParam int money){
//        try {
//            buyService.depositMoney(money);
//            return ResponseEntity.ok("Деньги внесены на депозит");
//        }catch (Exception e){
//            return ResponseEntity.badRequest().body("Error");
//        }
//    }

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
}
