package experiment3_5;

import java.text.SimpleDateFormat;
import java.util.Date;
public class Proxy extends Subject {
    private RealSubject realSubject ;

    public void before(){
        Date now = new Date( );
        SimpleDateFormat whattime = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
        System.out.println("方法method() 被调用，调用时间为："+whattime.format(now));
    }

    @Override

    public void method() {
        realSubject = new RealSubject();
        before();
        try {
            realSubject.method();
            after();
        }catch (NullPointerException e){
            System.out.println("方法method()调用失败");
        }
    }

    public void after(){
        System.out.println("方法method()调用成功");
    }
}