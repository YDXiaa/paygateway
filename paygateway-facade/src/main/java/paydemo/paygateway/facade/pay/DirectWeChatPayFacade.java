package paydemo.paygateway.facade.pay;

import paydemo.paygateway.facade.model.pay.DirectWeChatPayRequestDTO;
import paydemo.paygateway.facade.model.GatewayPayResponse;
import paydemo.paygateway.facade.model.GwResponse;

/**
 * @auther YDXiaa
 * <p>
 * 直连微信支付.
 */
public interface DirectWeChatPayFacade {


    /**
     * 支付.
     *
     * @param requestDTO 请求对象.
     * @return 支付响应对象.
     */
    GwResponse<GatewayPayResponse> pay(DirectWeChatPayRequestDTO requestDTO);

}
