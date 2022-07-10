package paydemo.paygateway.facade.model.pay;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import paydemo.paygateway.facade.model.BasePayGatewayRequestDTO;

/**
 * @auther YDXiaa
 * <p>
 * 直连微信支付请求对象.
 */
@Getter
@Setter
@ToString(callSuper = true)
public class DirectWeChatPayRequestDTO extends BasePayGatewayRequestDTO{

    /**
     * 支付金额.
     */
    private Long payAmt;

    /**
     * 渠道请求流水号.
     */
    private String channelRequestSeqNo;

    /**
     * 微信用户标识.
     */
    private String opendId;

    /**
     * 支付过期时间.
     */
    private long expireTimeOut;

}
