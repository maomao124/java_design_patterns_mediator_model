package mao.t1;

/**
 * Project name(项目名称)：java设计模式_中介者模式
 * Package(包名): mao.t1
 * Class(类名): Mediator
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 14:56
 * Version(版本): 1.0
 * Description(描述)： 抽象中介者
 */

public abstract class Mediator
{
    /**
     * 中介者联络的方法
     *
     * @param message 消息
     * @param person  要联络的人(抽象同事类)
     */
    public abstract void constact(String message, Person person);
}
