package experiment3_8;

public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("显示可编辑文本区中出现的单词总数量和字符总数量");
    }
}
