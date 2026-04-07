import java.util.Scanner;

public class LaptopPrice {
    public static void main(String[] args) {
        // 创建Scanner对象用于输入
        Scanner scanner = new Scanner(System.in);

        // 读取笔记本电脑的价格
        System.out.print("请输入笔记本电脑的价格（美元）: ");
        double price = scanner.nextDouble();

        // 读取税率
        System.out.print("请输入税率（百分比）: ");
        double taxRate = scanner.nextDouble();

        // 计算总金额（价格 + 价格 × 税率/100）
        double totalPrice = price + (price * taxRate / 100);

        // 打印总金额，按示例格式输出
        System.out.println("笔记本电脑的总价为" + (int)totalPrice + "美元");

        // 关闭Scanner
        scanner.close();
    }
}
