package mao.t2;

import java.util.ArrayList;
import java.util.List;

/**
 * Project name(项目名称)：java设计模式_中介者模式
 * Package(包名): mao.t2
 * Class(类名): Mediator
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/8/21
 * Time(创建时间)： 15:46
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Mediator
{
    private static final List<Student> maleStudents = new ArrayList<>();
    private static final List<Student> femaleStudents = new ArrayList<>();

    /**
     * 添加学生
     *
     * @param student Student对象
     */
    public static void add(Student student)
    {
        if ("male".equals(student.getSex()))
        {
            maleStudents.add(student);
        }
        else
        {
            femaleStudents.add(student);
        }
    }

    /**
     * 发送消息给所有学生
     *
     * @param student Student对象
     * @param message 消息
     */
    public static void sendMessageToAll(Student student, String message)
    {
        for (Student stu : maleStudents)
        {
            if (student.getName().equals(stu.getName()))
            {
                continue;
            }
            stu.receiveMessage(student.getName() + ":" + message);
        }
        for (Student stu : femaleStudents)
        {
            if (student.getName().equals(stu.getName()))
            {
                continue;
            }
            stu.receiveMessage(student.getName() + ":" + message);
        }
    }

    /**
     * 发送消息给同性别的学生
     *
     * @param student Student对象
     * @param message 消息
     */
    public static void sendMessageToSameSex(Student student, String message)
    {
        List<Student> tempList = "male".equals(student.getSex()) ? maleStudents : femaleStudents;
        for (Student stu : tempList)
        {
            if (student.getName().equals(stu.getName()))
            {
                continue;
            }
            stu.receiveMessage(student.getName() + ":" + message);
        }
    }
}
