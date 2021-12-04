/**
 * SCA具体实现类
 * @author joey
 * @version 1.0
 */
public class SCAAlgorithm implements EncryptAlgorithm{

    @Override
    public void encrypt(String content) {
        System.out.println("内容【" +content+"】已被SCA算法加密了");
    }
}
