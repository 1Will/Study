package logInReverse;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MainRegister {
	public static void main(String[] args) {
		Processing p = new Processing();
		/* p.addUser(); */
		/* 得到类名 */
		System.out.println("***得到类名：");
		Class c0 = p.getClass();
		System.out.println(c0);
		/* 得到接口 */
		System.out.println("***得到接口：");
		Class<?> c1 = null;
		try {
			c1 = Class.forName("logInBeta1.copy.Processing"); // 实例化对象
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Class<?> c[] = c1.getInterfaces(); // 以数组形式返回实现的全部接口
		for (int i = 0; i < c.length; i++) {
			System.out.println("实现的接口名称：" + c[i].getName()); // 输出接口名称
		}

		/* 得到父类 */
		System.out.println("***得到父类：");
		Class<?> c2 = c1.getSuperclass(); // 取得父类
		System.out.println("父类名称：" + c2.getName());

		/* 得到构造方法 */
		System.out.println("***得到构造方法：");
		Constructor<?> con[] = c1.getConstructors(); // 取得一个类中的全部构造
		for (int i = 0; i < con.length; i++) {
			Class<?> p1[] = con[i].getParameterTypes(); // 得到构造方法中的全部参数
			System.out.print("构造方法："); // 输出构造，直接打印
			System.out.print(con[i].getModifiers() + " "); // 得到修饰符
			System.out.print(con[i].getName()); // 取得构造方法的名字
			System.out.print("(");
			for (int j = 0; j < p1.length; j++) {
				System.out.print(p1[j].getName() + " arg" + i);
				if (j < p1.length - 1) {
					// 判断此是否是最后一个参数
					System.out.print(","); // 输出“,”
				}
			}
			System.out.println("){}");
		}

		/* 得到方法 */
		System.out.println("***得到方法： ");
		Method method[] = c1.getMethods();
		for (int i = 0; i < method.length; ++i) {
			Class<?> returnType = method[i].getReturnType();
			Class<?> para[] = method[i].getParameterTypes();
			int temp = method[i].getModifiers();
			System.out.print(Modifier.toString(temp) + " ");
			System.out.print(returnType.getName() + "  ");
			System.out.print(method[i].getName() + " ");
			System.out.print("(");
			for (int j = 0; j < para.length; ++j) {
				System.out.print(para[j].getName() + " " + "arg" + j);
				if (j < para.length - 1) {
					System.out.print(",");
				}
			}
			Class<?> exce[] = method[i].getExceptionTypes();
			if (exce.length > 0) {
				System.out.print(") throws ");
				for (int k = 0; k < exce.length; ++k) {
					System.out.print(exce[k].getName() + " ");
					if (k < exce.length - 1) {
						System.out.print(",");
					}
				}
			} else {
				System.out.print(")");
			}
			System.out.println();
		}
		/* 得到对象 */
		System.out.println("***得到对象： ");
		System.out.println("===============本类属性========================");
		// 取得本类的全部属性
		Field[] field = c1.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			// 权限修饰符
			int mo = field[i].getModifiers();
			String priv = Modifier.toString(mo);
			// 属性类型
			Class<?> type = field[i].getType();
			System.out.println(priv + " " + type.getName() + " " + field[i].getName() + ";");
		}
		System.out.println("===============实现的接口或者父类的属性========================");
		// 取得实现的接口或者父类的属性
		Field[] filed1 = c1.getFields();
		for (int j = 0; j < filed1.length; j++) {
			// 权限修饰符
			int mo = filed1[j].getModifiers();
			String priv = Modifier.toString(mo);
			// 属性类型
			Class<?> type = filed1[j].getType();
			System.out.println(priv + " " + type.getName() + " " + filed1[j].getName() + ";");
		}
		/* 得到方法中对象 */
		System.out.println("***得到方法中对象： ");
		try {
			// 调用Processing类中的readerFile方法
			Method method1 = c1.getMethod("readerFile");
			/*method1 = c1.getMethod("writeFile");*/
			method1.invoke(c1.newInstance());
			// 调用Processing类中的writeFile方法
			method1 = c1.getMethod("writeFile", String.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("***开始破坏： ");
		try {
			String string = p.readerFile();
			System.out.println(string);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
