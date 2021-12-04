/**
 * @author joey
 * @version 1.0
 */
public class Adapter {
    /**
     * 先要条件，判断客户的参数或者掉用是否支持
     *
     * @param algorithmImpl 具体的实现算法
     * @return return true while the given algorithmImpl is supported.
     */
    public boolean isSupport(Object algorithmImpl) {
        return algorithmImpl instanceof EncryptAlgorithm;
    }

    public void process(Object algorithmImpl, String content) {
        ((EncryptAlgorithm) algorithmImpl).encrypt(content);
    }
}
