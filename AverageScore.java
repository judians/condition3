import java.util.Scanner;

public class AverageScore {
    public static void main(String[] args) {
        // 创建Scanner对象用于输入
        Scanner scanner = new Scanner(System.in);

        // 读取几何成绩
        System.out.print("请输入几何成绩（0-10）: ");
        double geometry = scanner.nextDouble();

        // 读取代数成绩
        System.out.print("请输入代数成绩（0-10）: ");
        double algebra = scanner.nextDouble();

        // 读取物理成绩
        System.out.print("请输入物理成绩（0-10）: ");
        double physics = scanner.nextDouble();

        // 计算平均成绩
        double average = (geometry + algebra + physics) / 3;

        // 显示结果，保留一位小数
        System.out.printf("三门课程的平均成绩是: %.1f\n", average);

        // 关闭Scanner
        scanner.close();
    }
}
