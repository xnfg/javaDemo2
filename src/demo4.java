/**
 * 单例模式
 * 双重检查模式 （DCL）
 * （由于JVM底层模型原因，偶尔会出问题，不建议使用）
 */
public class demo4 {

    private  volatile static demo4 instance;
    private demo4(){}
    public static demo4 getDemo4(){
        if(instance == null){
            synchronized (demo4.class){
                if(instance == null){
                    instance = new demo4();
                }
            }
        }
        return instance;
    }
}
