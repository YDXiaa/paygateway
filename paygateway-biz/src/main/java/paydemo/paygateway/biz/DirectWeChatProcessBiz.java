package paydemo.paygateway.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import paydemo.paygateway.facade.model.GatewayPayResponse;
import paydemo.paygateway.facade.model.pay.DirectWeChatPayRequestDTO;
import paydemo.paygateway.manager.ErrorCodeConfigManager;

/**
 * @auther YDXiaa
 * <p>
 * 直连微信支付.
 */
@Service
public class DirectWeChatProcessBiz {

    @Autowired
    private ErrorCodeConfigManager errorCodeConfigManager;

    /**
     * 支付请求.
     *
     * @param requestDTO 请求对象.
     * @return 响应对象.
     */
    public GatewayPayResponse pay(DirectWeChatPayRequestDTO requestDTO) {





        return null;
    }


}
