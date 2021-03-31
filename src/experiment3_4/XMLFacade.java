package experiment3_4;

public class XMLFacade extends AbstractFacade {
    private FileRead fileread;
    private DataShow datashow;

    @Override
    public void dataprocess() {
        System.out.println("开始处理xml格式的数据");
        fileread = new FileRead();
        datashow = new DataShow();
        fileread.read();
        datashow.show();

    }
}
