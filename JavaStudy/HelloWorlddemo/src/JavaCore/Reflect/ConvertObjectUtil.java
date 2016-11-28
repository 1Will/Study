package Reflect;

/*import java.lang.reflect.Field;
import java.lang.reflect.Method;

import javax.persistence.Id;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

*//**
 * <转换对象工具>
 * <功能详细描述>
 * @author  zengyouyuan
 * @version  [版本号, 2013-5-27]
 * @see  [相关类/方法]
 * @since  [产品/模块版本]
 *//*
public class ConvertObjectUtil
{
    // log
    private static Log log = LogFactory.getLog(ConvertObjectUtil.class);
    
    *//**
     * <两个属性相同的对象，把源对象的属性值动态赋给目标对象>
     * <功能详细描述>
     * @param srcClass 源类型
     * @param srcObject　源对象
     * @param destObject　目标对象
     * @return　转换后的目标对象
     * @see [类、类#方法、类#成员]
     *//*
    public static Object convert(Class<?> srcClass, Object srcObject, Object destObject)
    {
        Field[] srcFields = srcClass.getDeclaredFields();
        
        int fieldCount = srcFields.length;
     
        log.info("src class has :" + fieldCount + " fields");
        for (int i = 0; i < fieldCount; i++)
        {
            // serialVersionUID和自增长的ID除外
            if (srcFields[i].getName().equals("serialVersionUID"))
            {
                continue;
            }
            
            if (srcFields[i].getAnnotation(Id.class) != null)
            {
                continue;
            }
            
            try
            {
                // 利用源对象的get方法和目标对象的set方法，来给目标对象赋值
                Method srcMethod = srcObject.getClass().getMethod("get" + uppercaseFirst(srcFields[i].getName()));
                Object srcValue = srcMethod.invoke(srcObject);
                
                Method destMethod =
                    destObject.getClass().getMethod("set" + uppercaseFirst(srcFields[i].getName()),
                        srcFields[i].getType());
                destMethod.invoke(destObject, srcValue);
                
            }
            catch (Exception e)
            {
                // TODO Auto-generated catch block
                log.error(e);
            }
        }
        
        return destObject;
    }
    
    *//**
     * <首字母大写>
     * <功能详细描述>
     * @param name
     * @return
     * @see [类、类#方法、类#成员]
     *//*
    private static String uppercaseFirst(String name)
    {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
    
}*/

