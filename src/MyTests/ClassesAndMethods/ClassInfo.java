package src.MyTests.ClassesAndMethods;

public class ClassInfo {
    public static void main(String[] args) {
        String string = "Hello";
        Class a = String.class;
        Class b = Integer.class;
        Class c = "Привет".getClass();
        Class d = string.getClass();
        Class e = Boolean.TRUE.getClass();
        Class f = Object.class;
        Class g = Integer.class;
        Class h = ClassInfo.class;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
