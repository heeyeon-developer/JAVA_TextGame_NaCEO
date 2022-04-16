public class Cat extends abCustomer{
    Cat(){

    }

    @Override
    String sayMenu1(){
        //String wantMenu = customerMenu.getRandManu();
        //System.out.println(wantMenu + "주문할께요~");
        return "1";
    }

    @Override
    String sayMenu2(){
        //String wantMenu2 = customerMenu.getRandManu();
        //System.out.println(wantMenu2 + "주문할께요~");
        return "2";
    }
}
