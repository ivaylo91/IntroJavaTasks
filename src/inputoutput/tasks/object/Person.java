package inputoutput.tasks.object;

import java.io.Serializable;

/**
 * @author Ivaylo Penev(ipenev91@gmail.com)
 */
public class Person implements Serializable{

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
