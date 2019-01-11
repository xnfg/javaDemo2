/**
 * 单例模式（饿汉模式）
 * (线程安全，调用效率高，但是不能延时加载)
 */
public class demo1 {

    private static demo1 instance = new demo1();

    private demo1(){}

    public static demo1 getDemo1(){
        return instance;
    }
}
