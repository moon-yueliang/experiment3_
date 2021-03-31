package experiment3_11;

public abstract class DataHandle {
    public void templateMethod(){
        read();
        convert();
        transfer();
        display();
    }

    public void read(){
        System.out.println("读取数据");
    }

    public void convert(){
        System.out.println("转换数据格式");
    }

public abstract void transfer();

    public void display(){
        System.out.println("显示数据");
    }

}
