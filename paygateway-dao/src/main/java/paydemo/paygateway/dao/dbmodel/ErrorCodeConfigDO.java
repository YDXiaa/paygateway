package paydemo.paygateway.dao.dbmodel;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @auther YDXiaa
 * <p>
 * 错误码配置对象.
 */
@Getter
@Setter
@ToString
@TableName("T_ERROR_CODE_CONFIG")
public class ErrorCodeConfigDO extends BaseDO {

    /**
     * 渠道编码.
     */
    @TableField("channel_no")
    private String channelNo;

    /**
     * 渠道详情编码.
     */
    @TableField("channel_detail_no")
    private String channelDetailNo;

    /**
     * 渠道响应码.
     */
    @TableField("channel_result_code")
    private String channelResultCode;

    /**
     * 渠道响应描述.
     */
    @TableField("channel_result_desc")
    private String channelResultDesc;

    /**
     * 映射结果码.
     */
    @TableField("mapping_result_code")
    private String mappingResultCode;

    /**
     * 映射描述.
     */
    @TableField("mapping_result_desc")
    private String mappingResultDesc;

    /**
     * 对应支付状态 SUCCESS/PAYING/FAIL 未指定配置默认 PAYING.
     */
    @TableField("pay_status")
    private String payStatus;

    /**
     * 备注说明.
     */
    @TableField("remark")
    private String remark;

}
