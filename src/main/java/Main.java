import java.util.Scanner;

/**
 * 客户端掉用，主方法
 *
 * @author joey
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入算法名称：");
            String algorithmName = scanner.nextLine();
            System.out.println("请输入加密内容：");
            String content = scanner.nextLine();

            Object algorithmImpl = new AlgorithmSimpleFactory().createSpecificAlgorithm(algorithmName);
            Adapter adapter = new Adapter();

            if (adapter.isSupport(algorithmImpl)) {
                adapter.process(algorithmImpl, content);
            } else {
                System.out.println("目前不支持算法【" + algorithmName + "】");
            }
        }
    }
}
