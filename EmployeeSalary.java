import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        // 定义最低工资
        int baseSalary = 400;

        // 创建Scanner对象用于输入
        Scanner scanner = new Scanner(System.in);

        // 读取工作年限
        System.out.print("请输入员工的工作年限: ");
        int yearsOfService = scanner.nextInt();

        // 读取子女数量
        System.out.print("请输入员工的子女数量: ");
        int numberOfChildren = scanner.nextInt();

        // 计算各项工资组成
        int experienceBonus = 20 * yearsOfService;
        int childrenBonus = 30 * numberOfChildren;
        int totalSalary = baseSalary + experienceBonus + childrenBonus;

        // 按指定格式输出结果
        System.out.printf("总金额为%d美元。%d美元最低工资+%d美元%d年工作经验+%d美元%d个孩子\n",
                totalSalary, baseSalary, experienceBonus, yearsOfService,
                childrenBonus, numberOfChildren);

        // 关闭Scanner
        scanner.close();
    }
}
