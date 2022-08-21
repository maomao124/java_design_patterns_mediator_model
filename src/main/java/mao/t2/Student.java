package mao.t2;

/**
 * Project name(项目名称)：java设计模式_中介者模式
 * Package(包名): mao.t2
 * Class(类名): Student
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 15:44
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Student
{
    //名字
    private final String name;
    //性别。性别应该要定义一个枚举
    private final String sex;

    public Student(String name, String sex)
    {
        this.name = name;
        this.sex = sex;
        Mediator.add(this);
    }

    public String getSex()
    {
        return sex;
    }

    public String getName()
    {
        return name;
    }

    public void sendMessageToAll(String message)
    {
        Mediator.sendMessageToAll(this, message);
    }

    public void sendMessageToSameSex(String message)
    {
        Mediator.sendMessageToSameSex(this, message);
    }

    public void receiveMessage(String message)
    {
        System.out.println(name + "收到了消息。" + message);
    }
}
