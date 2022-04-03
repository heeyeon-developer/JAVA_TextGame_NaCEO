import java.util.HashMap;

public class Ceo {
    private static String name = "나사장";
    private static String Level = "초보사장";
    private static int goddPoint = 0;
    private static int badPoint = 0;
    private static int money = 500000;
    private static HashMap<String, Integer> haveMaterials = new HashMap();//가지고 있는 재료

    //만약 재료를 다써서 수량이 0이라면 재료삭제..??
    void showMaterials(){
        System.out.println(haveMaterials);
    }

    int getCeoMoney(){
        return this.money;
    }

    //재료를 구할 수 있다면 자본의 가격에서 구매하고자 하는 메뉴의 가격 빼주기
    void remainCeoMoney(int purchaseItem){
        this.money = this.money - purchaseItem;
        System.out.println("재료를 구매하고 남은 돈은 " + this.money + "입니다.");
    }

}
