public class Test {
    public static void main(String[] args) {
        Demo demo = new Demo(){
            {
                System.out.println("无参构造");
            }
        };
        Demo demo1 = new Demo("张三",32){
            {
                System.out.println(this.getName() + this.getAge());
            }
        };
        demo.say(5);
        demo.say(5,6);
    }
}
