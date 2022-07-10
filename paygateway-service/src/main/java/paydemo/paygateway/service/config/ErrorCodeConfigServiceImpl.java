package paydemo.paygateway.service.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import paydemo.paygateway.biz.ErrorCodeConfigBiz;
import paydemo.paygateway.facade.model.GwResponse;
import paydemo.paygateway.facade.model.config.ErrorCodeConfigAddRequestDTO;
import paydemo.paygateway.facade.model.config.ErrorCodeConfigFacade;

/**
 * @auther YDXiaa
 * <p>
 * 错误码配置.
 */
@Service
public class ErrorCodeConfigServiceImpl implements ErrorCodeConfigFacade {

    @Autowired
    private ErrorCodeConfigBiz errorCodeConfigBiz;


    @Override
    public GwResponse<Boolean> addErrorCodeConfig(ErrorCodeConfigAddRequestDTO requestDTO) {
        boolean addResult = errorCodeConfigBiz.addErrorCodeConfig(requestDTO);
        return GwResponse.createSuccessResponse(addResult);
    }
}
