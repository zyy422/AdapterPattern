/**
 * MD5具体实现类
 * @author joey
 * @version 1.0
 */
public class MD5Algorithm implements EncryptAlgorithm{
    @Override
    public void encrypt(String content) {
        System.out.println("内容【" +content+"】已被MD5算法加密了");
    }
}
