package mao.t1;

/**
 * Project name(项目名称)：java设计模式_中介者模式
 * Package(包名): mao.t1
 * Class(类名): HouseOwner
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:59
 * Version(版本): 1.0
 * Description(描述)： 具体同事类 房屋拥有者
 */

public class HouseOwner extends Person
{
    public HouseOwner(String name, Mediator mediator)
    {
        super(name, mediator);
    }

    @Override
    public void constact(String message)
    {
        mediator.constact(message, this);
    }

    @Override
    public void getMessage(String message)
    {
        System.out.println("房主" + name + "获取到中介的消息：" + message);
    }
}
