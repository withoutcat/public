public class Demo {
    private String name;
    private int age;
    public Demo(){
        super();
    }

    public Demo(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public void say(int a){
        System.out.println(a);
    }
    public void say(int a, int b){
        System.out.println(a + b);
    }
}
