import java.util.Scanner;

public class CryptoCalculator {
    public static void main(String[] args) {
        // 初始资金：100000美元
        double budget = 100000.0;

        // 创建Scanner对象用于输入
        Scanner scanner = new Scanner(System.in);

        // 读取比特币价格
        System.out.print("请输入比特币的当前价格（美元）: ");
        double bitcoinPrice = scanner.nextDouble();

        // 读取以太坊价格
        System.out.print("请输入以太坊的当前价格（美元）: ");
        double ethereumPrice = scanner.nextDouble();

        // 读取莱特币价格
        System.out.print("请输入莱特币的当前价格（美元）: ");
        double litecoinPrice = scanner.nextDouble();

        // 计算可购买的数量
        double bitcoinAmount = budget / bitcoinPrice;
        double ethereumAmount = budget / ethereumPrice;
        double litecoinAmount = budget / litecoinPrice;

        // 显示结果，保留6位小数以显示小额加密货币
        System.out.println("\n用100000美元可以购买：");
        System.out.printf("比特币: %.6f 个\n", bitcoinAmount);
        System.out.printf("以太坊: %.6f 个\n", ethereumAmount);
        System.out.printf("莱特币: %.6f 个\n", litecoinAmount);

        // 关闭Scanner
        scanner.close();
    }
}

