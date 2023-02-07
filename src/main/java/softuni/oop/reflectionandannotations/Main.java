package softuni.oop.reflectionandannotations;

import com.sun.source.tree.ModifiersTree;

import java.lang.reflect.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args)
            throws NoSuchMethodException,
            InvocationTargetException,
            InstantiationException,
            IllegalAccessException,
            NoSuchFieldException
    {
//        Class<Reflection> clazz = Reflection.class;
//
//        Reflection reflection = new Reflection();
//
//        +++Constructors
//
//        System.out.println(clazz);
//
//        System.out.println(clazz.getSuperclass());
//
//        Arrays.stream(clazz.getInterfaces()).forEach(System.out::println);
//
//        Constructor<Reflection> ctor = clazz.getDeclaredConstructor();
//
//        System.out.println(ctor.newInstance());
//
//        +++Fields
//
//        __static__
//        Field nickName = clazz.getDeclaredField("nickName");
//
//        nickName.setAccessible(true);
//
//        nickName.set(null, "nas");
//
//        System.out.println(nickName.get(null));
//
//        __instance__
//        Field email = clazz.getDeclaredField("email");
//
//        System.out.println(email.get(reflection));
//
//        email.set(reflection, "test@test.com");
//
//        System.out.println(email.get(reflection));
//
//        +++Methods
//
//        Method method = clazz.getMethod("getEmail");
//
//        System.out.println(method.invoke(reflection));
//
//        Method[] methods = clazz.getDeclaredMethods();
//
//        Method[] getters = Arrays.stream(methods)
//                .filter(m -> m.getName().startsWith("get") &&
//                        m.getParameterCount() == 0)
//                .sorted(Comparator.comparing(Method::getName))
//                .toArray(Method[]::new);
//
//        Arrays.stream(getters)
//                .forEach(m -> System.out.printf("%s will return class %s%n",
//                        m.getName(), m.getReturnType().getName()));
//
//        Method[] setters = Arrays.stream(methods)
//                .filter(m -> m.getName().startsWith("set") &&
//                        m.getParameterCount() == 1)
//                .sorted(Comparator.comparing(Method::getName))
//                .toArray(Method[]::new);
//
//        Arrays.stream(setters)
//                .forEach(m -> System.out.printf("%s and will set field of class %s%n",
//                        m.getName(), m.getParameterTypes()[0].getName()));
//
//        +++Modifiers
//
//        Field[] fields = Arrays.stream(clazz.getDeclaredFields())
//                .filter(f -> !Modifier.isPrivate(f.getModifiers()))
//                .sorted(Comparator.comparing(Field::getName))
//                .toArray(Field[]::new);
//
//        Arrays.stream(fields).forEach(f -> System.out.printf("%s must be private!%n", f.getName()));
//
//        Method[] methods = clazz.getDeclaredMethods();
//
//        Method[] getters = Arrays.stream(methods)
//                .filter(m -> m.getName().startsWith("get") &&
//                        m.getParameterCount() == 0 &&
//                        !Modifier.isPublic(m.getModifiers()))
//                .sorted(Comparator.comparing(Method::getName))
//                .toArray(Method[]::new);
//
//        Arrays.stream(getters).forEach(m -> System.out.printf("%s have to be public!%n", m.getName()));
//
//        Method[] setters = Arrays.stream(methods)
//                .filter(m -> m.getName().startsWith("set") &&
//                        m.getParameterCount() == 1 &&
//                        !Modifier.isPrivate(m.getModifiers()))
//                .sorted(Comparator.comparing(Method::getName))
//                .toArray(Method[]::new);
//
//        Arrays.stream(setters).forEach(m -> System.out.printf("%s have to be private!%n", m.getName()));
    }
}
