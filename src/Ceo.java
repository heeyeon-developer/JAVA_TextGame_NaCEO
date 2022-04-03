import java.util.HashMap;
import java.util.Map;

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

    void insertPurchaseMat(HashMap<String, Integer> purchaseItems){
        for(Map.Entry<String, Integer> items : purchaseItems.entrySet()) {
            haveMaterials.put(items.getKey(), items.getValue());
        }
    }

//    private void checkMat(String checkmenu, Menu checkMenu, int th){
//        if(checkmenu.equals(checkMenu.getMenu(th)){
//
//        }
//    }

    boolean makeMenu(String customerMenu, Menu menu1, int th){
        //원하는 메뉴의 재료가 존재하는지 체크
        if(customerMenu.equals(menu1.getMenu(0))){//떡볶이
            if(haveMaterials.containsKey("떡") && haveMaterials.containsKey("고춧가루") && haveMaterials.containsKey("고추장")&& haveMaterials.containsKey("카레가루")){
                if(haveMaterials.get("떡") >= 1 && haveMaterials.get("고추장") >= 1 && haveMaterials.get("고춧가루") >= 1 && haveMaterials.get("카레가루") >=  1){
                    haveMaterials.replace("떡",haveMaterials.get("떡")-1);
                    haveMaterials.replace("고추장",haveMaterials.get("고추장")-1);
                    haveMaterials.replace("고춧가루",haveMaterials.get("고춧가루")-1);
                    haveMaterials.replace("카레가루",haveMaterials.get("카레가루")-1);

                    return true;
                }else{
                    System.out.println("재료가 부족해서 요리를 할 수 없어요..ㅠㅜㅠ");
                    return false;
                }
            }else{
                System.out.println("필요한 재료가 모두 있지 않아서 요리를 할 수 없어요ㅠㅜㅠㅠ");
                return false;
            }
        }else if(customerMenu.equals(menu1.getMenu(1))){//마라탕
            if(haveMaterials.containsKey("마라") && haveMaterials.containsKey("숙주") && haveMaterials.containsKey("푸주")&& haveMaterials.containsKey("비엔나소세지")){
                if(haveMaterials.get("마라") >= 1 && haveMaterials.get("숙주") >= 1 && haveMaterials.get("푸주") >= 1 && haveMaterials.get("비엔나소세지") >=  1){
                    haveMaterials.replace("마라",haveMaterials.get("마라")-1);
                    haveMaterials.replace("숙주",haveMaterials.get("숙주")-1);
                    haveMaterials.replace("푸주",haveMaterials.get("푸주")-1);
                    haveMaterials.replace("비엔나소세지",haveMaterials.get("비엔나소세지")-1);
                    return true;
                }else{
                    System.out.println("재료가 부족해서 요리를 할 수 없어요..ㅠㅜㅠ");
                    return false;
                }
            }else{
                System.out.println("필요한 재료가 모두 있지 않아서 요리를 할 수 없어요ㅠㅜㅠㅠ");
                return false;
            }
        }else {//비빔밥
            if(haveMaterials.containsKey("밥") && haveMaterials.containsKey("나물") && haveMaterials.containsKey("참기름") && haveMaterials.containsKey("고추장") && haveMaterials.containsKey("계란")){
                if(haveMaterials.get("밥") >= 1 && haveMaterials.get("나물") >= 1 && haveMaterials.get("참기름") >= 1  && haveMaterials.get("계란") >=  1){
                    haveMaterials.replace("밥",haveMaterials.get("밥")-1);
                    haveMaterials.replace("나물",haveMaterials.get("나물")-1);
                    haveMaterials.replace("참기름",haveMaterials.get("참기름")-1);
                    haveMaterials.replace("고추장",haveMaterials.get("고추장")-1);
                    haveMaterials.replace("계란",haveMaterials.get("계란")-1);
                    return true;
                }else{
                    System.out.println("재료가 부족해서 요리를 할 수 없어요..ㅠㅜㅠ");
                    return false;
                }
            }else{
                System.out.println("필요한 재료가 모두 있지 않아서 요리를 할 수 없어요ㅠㅜㅠㅠ");
                return false;
            }
        }
    }

}
