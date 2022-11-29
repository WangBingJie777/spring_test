package bean;

/**
 * @author wbj
 * @create 2022-11-28 20:32
 */
public class Person {
    private String name;
    private String age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
    public void function(){
        System.out.println("hello git");
        System.out.println("kk");
    }
}
