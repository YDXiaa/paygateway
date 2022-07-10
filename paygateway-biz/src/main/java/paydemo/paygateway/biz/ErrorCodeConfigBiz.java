package paydemo.paygateway.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import paydemo.paygateway.dao.dbmodel.ErrorCodeConfigDO;
import paydemo.paygateway.facade.model.config.ErrorCodeConfigAddRequestDTO;
import paydemo.paygateway.manager.ErrorCodeConfigManager;
import paydemo.paygateway.manager.helper.BeanCopier;

/**
 * @auther YDXiaa
 * <p>
 * 错误码配置.
 */
@Service
public class ErrorCodeConfigBiz {

    @Autowired
    private ErrorCodeConfigManager errorCodeConfigManager;

    /**
     * 添加错误码.
     */
    public boolean addErrorCodeConfig(ErrorCodeConfigAddRequestDTO requestDTO) {
        ErrorCodeConfigDO configDO = BeanCopier.objCopy(requestDTO, ErrorCodeConfigDO.class);
        return errorCodeConfigManager.addErrorCodeConfig(configDO);
    }
}
