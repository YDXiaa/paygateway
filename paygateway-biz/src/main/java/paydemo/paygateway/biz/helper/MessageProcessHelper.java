package paydemo.paygateway.biz.helper;

import org.springframework.stereotype.Service;

/**
 * @auther YDXiaa
 * <p>
 * 报文转换/签名处理.
 */
@Service
public final class MessageProcessHelper {

    /**
     * 对象转xml报文.
     *
     * @param messsageObj 报文对象.
     * @param <T>         Class.
     * @return 字符串.
     */
    public static <T> String obj2XmlMessage(T messsageObj) {
        return null;
    }

    /**
     * xml报文转对象.
     *
     * @param xmlStr xmlStr.
     * @param <T>    class.
     * @return 对象.
     */
    public static <T> String xmlMessage2Obj(String xmlStr) {
        return null;
    }

}
