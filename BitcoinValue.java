import java.util.Scanner;

public class BitcoinValue {
    public static void main(String[] args) {
        // 创建Scanner对象用于输入
        Scanner scanner = new Scanner(System.in);

        // 读取购买时的比特币价值
        System.out.print("请输入购买时比特币的价值: ");
        double initialValue = scanner.nextDouble();

        // 读取百分比变化（正数表示增加，负数表示减少）
        System.out.print("请输入价值变化的百分比（例如+5或-3）: ");
        double percentageChange = scanner.nextDouble();

        // 计算价值变化量
        double valueChange = initialValue * (percentageChange / 100);

        // 计算当前总价值
        double currentValue = initialValue + valueChange;

        // 显示结果
        System.out.println("\n比特币当前总价值: " + currentValue);
        if (valueChange >= 0) {
            System.out.println("价值增加了: " + valueChange);
        } else {
            System.out.println("价值减少了: " + Math.abs(valueChange));
        }

        // 关闭Scanner
        scanner.close();
    }
}
