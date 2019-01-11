/**
 * 单例模式
 * 静态内部类式（线程安全，调用效率高，可以延时加载）
 * 第一次加载Singleton类时并不会初始化sInstance，
 * 只有第一次调用getInstance方法时虚拟机加载SingletonHolder 并初始化sInstance ，
 * 这样不仅能确保线程安全也能保证Singleton类的唯一性，所以推荐使用静态内部类单例模式。
 */
public class demo5 {

    private demo5(){}
    public static demo5 getDemo5(){
        return SingletonHolder.sInstance;
    }
    private  static  class  SingletonHolder{
        private  static  final  demo5 sInstance = new demo5();
    }
}
