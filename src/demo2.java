/**
 * 单例模式（懒汉模式[线程不安全]）
 * 懒汉模式申明了一个静态对象，在用户第一次调用时初始化，
 * 虽然节约了资源，但第一次加载时需要实例化，反映稍慢一些，而且在多线程不能正常工作。
 */
public class demo2 {

    private static demo2 instance;

    private demo2(){}

    public static  demo2 getDemo2(){
        if(instance == null){
            instance = new demo2();
        }
        return instance;
    }
}
