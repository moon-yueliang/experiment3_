package experiment3_3;
public class Facade {
    private MessageManage MessageManage = new MessageManage();

    private AddressbookManage addressbookmanage = new AddressbookManage();



    public void Manage(){
        System.out.println("启用一键备份");

        MessageManage.manage2();

        addressbookmanage.manage1();

    }



}