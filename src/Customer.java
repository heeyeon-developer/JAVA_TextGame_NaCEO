public class Customer extends abCustomer{
    private String customerName = "";
    private String fristWantFood = "";
    private String secondWantFood = "";
    private int pay = 0;
    private int giveGoodPoint = 0;
    private int giveBadPoint = 0;
    private Menu customerMenu = new Menu();

    Customer(String name){
        this.customerName = name;
    }

    @Override
    String sayMenu1(){
        String wantMenu = customerMenu.getRandManu();
        System.out.println(wantMenu + "주문할께요~");
        return wantMenu;
    }

    @Override
    String sayMenu2(){
        String wantMenu2 = customerMenu.getRandManu();
        System.out.println(wantMenu2 + "주문할께요~");
        return wantMenu2;
    }

    int givePay(String menu){
        int pay = 0;
        if(menu == "1"){
            pay = 3000;
        }else if(menu == "2"){
            pay = 11000;
        }else{
            pay = 8500;
        }
        return pay;
    }
    void giveGoodPoint(){
        int point = 0;


    }

    void giveBadPoint(){

    }

}

