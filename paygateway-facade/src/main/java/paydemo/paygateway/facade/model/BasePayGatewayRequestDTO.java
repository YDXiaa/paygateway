package paydemo.paygateway.facade.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @auther YDXiaa
 * <p>
 * 支付网关基础请求类.
 */
@Data
public class BasePayGatewayRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 渠道编码.
     */
    private String channelNo;

    /**
     * 渠道详情编码.
     */
    private String channelDetailNo;

    /**
     * 请求拓展参数.
     */
    private Map<String, String> extReq;


}
