package wallet.domain;

import wallet.domain.*;
import wallet.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class CouponCancelled extends AbstractEvent {

    private Long id;
    private String price;
    private String type;
    private String name;
    private String buyer;

    public CouponCancelled(Coupon aggregate){
        super(aggregate);
    }
    public CouponCancelled(){
        super();
    }
}