package mao.t1;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_中介者模式
 * Package(包名): mao.t1
 * Class(类名): MediatorStructure
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 15:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */


public class MediatorStructure extends Mediator
{
    private final List<Tenant> tenants;
    private final List<HouseOwner> houseOwners;

    /**
     * Instantiates a new Mediator structure.
     */
    public MediatorStructure()
    {
        tenants = new ArrayList<>();
        houseOwners = new ArrayList<>();
    }

    /**
     * Add tenants mediator structure.
     *
     * @param tenant the tenant
     * @return the mediator structure
     */
    public MediatorStructure addTenants(Tenant tenant)
    {
        this.tenants.add(tenant);
        return this;
    }

    /**
     * Add house owners mediator structure.
     *
     * @param houseOwner the house owner
     * @return the mediator structure
     */
    public MediatorStructure addHouseOwners(HouseOwner houseOwner)
    {
        this.houseOwners.add(houseOwner);
        return this;
    }

    /**
     * Gets tenants.
     *
     * @return the tenants
     */
    public List<Tenant> getTenants()
    {
        return tenants;
    }

    /**
     * Gets house owners.
     *
     * @return the house owners
     */
    public List<HouseOwner> getHouseOwners()
    {
        return houseOwners;
    }

    @Override
    public void constact(String message, Person person)
    {
        if (person instanceof Tenant)
        {
            //租房者发出的消息，应该发给所有的房屋拥有者
            for (HouseOwner houseOwner : houseOwners)
            {
                houseOwner.getMessage(message);
            }
        }
        else if (person instanceof HouseOwner)
        {
            //房屋拥有者发出的消息，应该发给所有的租房者
            for (Tenant tenant : tenants)
            {
                tenant.getMessage(message);
            }
        }
    }
}
