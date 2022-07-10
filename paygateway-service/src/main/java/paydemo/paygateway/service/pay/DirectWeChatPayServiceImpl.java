package paydemo.paygateway.service.pay;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import paydemo.paygateway.biz.DirectWeChatProcessBiz;
import paydemo.paygateway.facade.model.GatewayPayResponse;
import paydemo.paygateway.facade.model.GwResponse;
import paydemo.paygateway.facade.model.pay.DirectWeChatPayRequestDTO;
import paydemo.paygateway.facade.pay.DirectWeChatPayFacade;

/**
 * @auther YDXiaa
 * <p>
 * 直连微信支付.
 */
@Service
public class DirectWeChatPayServiceImpl implements DirectWeChatPayFacade {

    @Autowired
    private DirectWeChatProcessBiz directWeChatPayBiz;

    @Override
    public GwResponse<GatewayPayResponse> pay(DirectWeChatPayRequestDTO requestDTO) {

        // 支付.
        GatewayPayResponse gatewayPayResponse = directWeChatPayBiz.pay(requestDTO);

        // 响应结果.
        return GwResponse.createSuccessResponse(gatewayPayResponse);
    }
}
