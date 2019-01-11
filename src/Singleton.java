/**
 * 单例模式
 */
public class Singleton {
    /**
     * 构造方法私有化，防止被new出来
     */
    private Singleton(){}

    /**
     * 创建私有的静态方法
     */
    private static class SingletonBuild{
        private static Singleton value = new Singleton();
    }

    /**
     * 通过指定的方法获取对象，保证每次获得的对象(产品)都是唯一
     * @return
     */
    public Singleton getInstance(){ return SingletonBuild.value; }
}
