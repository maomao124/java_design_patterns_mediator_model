package mao.t2;

/**
 * Project name(项目名称)：java设计模式_中介者模式
 * Package(包名): mao.t2
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 15:52
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        Student femaleStudentA = new Student("小红", "female");
        Student femaleStudentB = new Student("小美", "female");
        Student femaleStudentC = new Student("小花", "female");

        Student maleStudentA = new Student("小明", "male");
        Student maleStudentB = new Student("小亮", "male");
        Student maleStudentC = new Student("小绿", "male");

        maleStudentB.sendMessageToAll("干饭");
        System.out.println("-------");
        maleStudentA.sendMessageToAll("睡觉");
        System.out.println("-------");
        maleStudentC.sendMessageToAll("明天放假！！！");

        System.out.println("-------");
        System.out.println("-------");

        femaleStudentA.sendMessageToSameSex("一起去厕所吗？");
        System.out.println("-------");
        femaleStudentB.sendMessageToSameSex("大家好！");
        System.out.println("-------");
        femaleStudentC.sendMessageToSameSex("明天一起去玩吧");

    }
}
