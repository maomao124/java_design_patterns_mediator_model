package mao.t1;

/**
 * Project name(项目名称)：java设计模式_中介者模式
 * Package(包名): mao.t1
 * Class(类名): Person
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:58
 * Version(版本): 1.0
 * Description(描述)： 抽象同事类
 */

public abstract class Person
{
    //名字
    protected String name;
    //中介者
    protected Mediator mediator;

    public Person(String name, Mediator mediator)
    {
        this.name = name;
        this.mediator = mediator;
    }

    public String getName()
    {
        return name;
    }

    /**
     * 联系中介
     *
     * @param message 消息
     */
    public abstract void constact(String message);

    /**
     * 接收中介的消息
     *
     * @param message 消息
     */
    public abstract void getMessage(String message);
}
