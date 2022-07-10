package paydemo.paygateway.facade.model.config;

import paydemo.paygateway.facade.model.GwResponse;

/**
 * @auther YDXiaa
 * <p>
 * 错误码配置信息.
 */
public interface ErrorCodeConfigFacade {


    /**
     * 添加错误码配置.
     *
     * @param requestDTO 请求对象.
     * @return resp.
     */
    GwResponse<Boolean> addErrorCodeConfig(ErrorCodeConfigAddRequestDTO requestDTO);

}
