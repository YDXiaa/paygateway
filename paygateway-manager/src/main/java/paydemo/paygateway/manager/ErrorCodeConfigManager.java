package paydemo.paygateway.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import paydemo.paygateway.dao.dbmodel.ErrorCodeConfigDO;
import paydemo.paygateway.dao.mapper.ErrorCodeConfigMapper;

/**
 * @auther YDXiaa
 * <p>
 * 错误码配置manager.
 */
@Repository
public class ErrorCodeConfigManager {

    @Autowired
    private ErrorCodeConfigMapper errorCodeConfigMapper;


    /**
     * 添加错误码配置.
     *
     * @param errorCodeConfigDO 错误码配置对象.
     */
    public boolean addErrorCodeConfig(ErrorCodeConfigDO errorCodeConfigDO) {
        return 1 == errorCodeConfigMapper.insert(errorCodeConfigDO);
    }

}
