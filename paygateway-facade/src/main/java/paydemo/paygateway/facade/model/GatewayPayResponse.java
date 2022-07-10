package paydemo.paygateway.facade.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @auther YDXiaa
 * <p>
 * 网关支付响应对象.
 */
@Data
public class GatewayPayResponse implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 支付状态.
     */
    private String payStatus;

    /**
     * 返回响应码.
     */
    private String resultCode;

    /**
     * 返回响应描述.
     */
    private String resultDesc;

    /**
     * 渠道响应交易流水.
     */
    private String channelRespSeqNo;

    /**
     * 支付URL.
     */
    private String payUrl;


    /**
     * 拓展响应参数.
     */
    private Map<String, String> extResp;


}
