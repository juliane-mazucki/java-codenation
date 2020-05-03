package br.codenation.cursojava.aula3.reflection;

import br.codenation.cursojava.aula2.heranca.Funcionario;
import br.codenation.cursojava.aula2.interfaces.MinhaInterface;
import br.codenation.cursojava.aula3.exceptions.Cat;
import br.codenation.cursojava.aula3.exceptions.Dog;
import br.codenation.cursojava.aula3.exceptions.Run;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Reflection {

    public static void main(String[] args) {

        List<Class> classes = Arrays.asList(Dog.class, Cat.class, Run.class);
        for (Class c : classes) {

            System.out.println("Classe: " + c.getName());

            System.out.print("- Métodos: ");
            Method[] methods = c.getDeclaredMethods();
            for (Method m : methods) {
                System.out.print(m.getName() + " ");
            }

            System.out.print("\n- Atributos: ");
            Field[] fields = c.getDeclaredFields();
            for (Field f : fields) {
                System.out.print(f.getName() + " ");
            }

            System.out.println("\n");
        }

        List<Object> objects = Arrays.asList(new Dog(), new Cat(), new Run());
        for (Object obj : objects) {
            Class<?> objClass = obj.getClass();
            System.out.println(obj);

            for (Constructor constructor : objClass.getConstructors()) {
                System.out.println(constructor);
            }

            System.out.println();
        }

        try {

            Class<?> dogClass = Class.forName("br.codenation.cursojava.aula3.exceptions.Dog");
            Constructor<?> dogConstructor = dogClass.getConstructor(String.class);
            Dog dog = (Dog) dogConstructor.newInstance("Lana");

            System.out.println(dog);

            Method setName = dogClass.getMethod("setBreed", String.class);
            Object value = setName.invoke(dog, "Labrador");
            System.out.println(value);

            Method getName = dogClass.getMethod("getName");
            Object name = getName.invoke(dog);
            System.out.println(name);

            Method getBreed = dogClass.getMethod("getBreed");
            Object breed = getBreed.invoke(dog);
            System.out.println(breed);

            System.out.println();
            Class<MinhaInterface> funcionarioClass = MinhaInterface.class;

            for (Annotation annotation: funcionarioClass.getDeclaredAnnotations()) {
                System.out.println(annotation);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
