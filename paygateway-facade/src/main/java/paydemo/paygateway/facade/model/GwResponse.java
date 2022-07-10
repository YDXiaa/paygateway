package paydemo.paygateway.facade.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @auther YDXiaa
 * <p>
 * 支付网关公共响应对象.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GwResponse<T> implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 响应成功标识.
     */
    private boolean respSuccessFlag;

    /**
     * 响应结果码.
     */
    private String respCode;

    /**
     * 响应信息.
     */
    private String respMsg;

    /**
     * 响应结果.
     */
    private T respData;

    /**
     * 构建错误返回结果.
     *
     * @param respCode 响应码.
     * @param respMsg  响应信息.
     * @return 错误返回结果.
     */
    public static GwResponse<Void> createFailResponse(String respCode, String respMsg) {
        return new GwResponse<>(false, respCode, respMsg, null);
    }

    /**
     * 创建成功返回结果.
     *
     * @param respData 响应数据.
     * @return 响应结果.
     */
    public static <T> GwResponse<T> createSuccessResponse(T respData) {
        return new GwResponse<>(true, null, null, respData);
    }
}
