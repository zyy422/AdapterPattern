/**
 * 加密算法简单工厂
 * @author joey
 * @version 1.0
 */
public class AlgorithmSimpleFactory {

    /**
     * 根据算法名称创建具体算法实现
     * @param algorithmName 算法名称
     * @return 具体算法实现
     */
    public Object createSpecificAlgorithm(String algorithmName) {
        switch (algorithmName) {
            case "SCA":
                return new SCAAlgorithm();
            case "MD5":
                return new MD5Algorithm();
            default:
                return null;
        }
    }
}
