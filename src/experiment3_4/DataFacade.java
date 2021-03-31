package experiment3_4;

public class DataFacade extends AbstractFacade{
    private FileRead fileread;
    private  FileExchange fileexchange;
    private DataShow datashow;

    @Override
    public void dataprocess() {
        System.out.println("开始处理非xml格式的数据");
        fileexchange = new FileExchange();
        fileread = new FileRead();
        datashow = new DataShow();
        fileread.read();
       fileexchange.exchange();
        datashow.show();
    }
}

