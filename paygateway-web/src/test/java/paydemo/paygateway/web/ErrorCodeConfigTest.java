package paydemo.paygateway.web;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import paydemo.paygateway.dao.dbmodel.ErrorCodeConfigDO;
import paydemo.paygateway.manager.ErrorCodeConfigManager;

/**
 * @auther YDXiaa
 * <p>
 * errorCodeConfig.
 */
public class ErrorCodeConfigTest extends BaseSpringBootSupport {

    @Autowired
    private ErrorCodeConfigManager errorCodeConfigManager;

    @Test
    public void addErroCodeConfig() {
        ErrorCodeConfigDO configDO = new ErrorCodeConfigDO();

        configDO.setChannelNo("DIRECT_WECHAT");
        configDO.setChannelDetailNo("DIRECT_WECHAT_PAY");
        configDO.setChannelResultCode("OUT_TRADE_NO_USED");
        configDO.setChannelResultDesc("商户订单号重复");
        configDO.setMappingResultCode("ORDER_EXISTS");
        configDO.setMappingResultDesc("重复下单");
        configDO.setPayStatus("FAIL");
        configDO.setRemark("请核实商户订单号是否重复提交");

        errorCodeConfigManager.addErrorCodeConfig(configDO);
    }

}
