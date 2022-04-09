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

    void sayMenu2(){

    }

    void givePay(){

    }
    void giveGoodPint(){

    }

    void giveBadPoint(){

    }

}

