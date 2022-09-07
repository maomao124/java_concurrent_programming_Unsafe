package mao.t1;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Project name(项目名称)：java并发编程_Unsafe
 * Package(包名): mao.t1
 * Class(类名): UnsafeAccessor
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/9/7
 * Time(创建时间)： 17:05
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class UnsafeAccessor
{
    private static final Unsafe unsafe;

    static
    {
        try
        {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            unsafe = (Unsafe) theUnsafe.get(null);
        }
        catch (NoSuchFieldException | IllegalAccessException e)
        {
            throw new Error(e);
        }
    }

    static Unsafe getUnsafe()
    {
        return unsafe;
    }
}
