package paydemo.paygateway.facade.model.config;

import lombok.Data;

import java.io.Serializable;

/**
 * @auther YDXiaa
 * <p>
 * 错误码配置添加请求对象.
 */
@Data
public class ErrorCodeConfigAddRequestDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 渠道详情编码.
     */
    private String channelDetailNo;

    /**
     * 渠道响应码.
     */
    private String channelResultCode;

    /**
     * 渠道响应描述.
     */
    private String channelResultDesc;

    /**
     * 映射结果码.
     */
    private String mappingResultCode;

    /**
     * 映射描述.
     */
    private String mappingResultDesc;

    /**
     * 对应支付状态 SUCCESS/PAYING/FAIL 未指定配置默认 PAYING.
     */
    private String payStatus;

    /**
     * 备注说明.
     */
    private String remark;

}
