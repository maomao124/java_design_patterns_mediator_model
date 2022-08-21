package mao.t1;

/**
 * Project name(项目名称)：java设计模式_中介者模式
 * Package(包名): mao.t1
 * Class(类名): Test
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 15:11
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Test
{
    public static void main(String[] args)
    {
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner1 = new HouseOwner("张三", mediator);
        HouseOwner houseOwner2 = new HouseOwner("李四", mediator);
        HouseOwner houseOwner3 = new HouseOwner("王五", mediator);

        Tenant tenant1 = new Tenant("赵六", mediator);
        Tenant tenant2 = new Tenant("张九", mediator);
        Tenant tenant3 = new Tenant("王四", mediator);
        Tenant tenant4 = new Tenant("钱七", mediator);

        //添加
        mediator.addHouseOwners(houseOwner1);
        mediator.addHouseOwners(houseOwner2);
        mediator.addHouseOwners(houseOwner3);

        mediator.addTenants(tenant1);
        mediator.addTenants(tenant2);
        mediator.addTenants(tenant3);
        mediator.addTenants(tenant4);

        tenant2.constact("我需要一套30平的房子,联系人：" + tenant2.getName());
        System.out.println("----");
        tenant4.constact("我需要一套70平的房子,联系人：" + tenant4.getName());
        System.out.println("----");
        tenant1.constact("我需要一套100平的房子,价格3000一个月以上的,联系人：" + tenant1.getName());

        System.out.println("----");
        System.out.println("----");

        houseOwner1.constact("现有一套120平的房子出租，价格为4000元一个月,出租人：" + houseOwner1.getName());
        System.out.println("----");
        houseOwner3.constact("现有一套40平的房子出租，价格为1300元一个月,出租人：" + houseOwner3.getName());


    }
}
