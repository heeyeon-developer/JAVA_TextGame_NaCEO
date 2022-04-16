public class Woman extends Customer{
    private String womanrName = "";
    private Menu customerMenu = new Menu();

    //알아보기 자식으로 상속받기 위해서는 생성자도 같이 생성..??super 필수..??
    Woman(String name){
        super("Woman");
        this.womanrName = name;
    }
}
