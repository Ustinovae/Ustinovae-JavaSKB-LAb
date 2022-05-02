package URFU.EducationProject.ShoppingService.Infrastructure.Services;

import URFU.EducationProject.ShoppingService.Contracts.PurchaseDto;
import URFU.EducationProject.ShoppingService.DomainCore.Info;
import URFU.EducationProject.ShoppingService.DomainCore.Purchase;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class ShopManager {

    public Purchase indexPurchase(PurchaseDto request){
        var rnd = new Random();
        var id = rnd.nextInt(1, 150);
        var info = new Info(request.getInfo().getDate());

        return new Purchase(request.getPrice(), info, id);
    }
}
