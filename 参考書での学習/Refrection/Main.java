package 参考書での学習.Refrection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class<?> clazz = Refsample02.class;
		Constructor<?> cons = clazz.getConstructor(int.class);
		Refsample02 rs = (Refsample02)cons.newInstance(256);
		
		Field f = clazz.getField("times");
		f.set(rs,  2);
		System.out.println(f.get(rs));
		
		Method m = clazz.getMethod("hello", String.class, int.class);
		m.invoke(rs,  "reflectinon!", 128);
		boolean pubc = Modifier.isPublic(clazz.getModifiers());
		boolean finm = Modifier.isFinal(m.getModifiers());
	}
}
