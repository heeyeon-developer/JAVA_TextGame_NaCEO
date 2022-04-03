import java.util.*;
import java.util.Map.Entry;

public class Mart {
    //재료이름, 1개당 가격 묶음으로 셋팅
    private static HashMap<String,Integer> materials = new HashMap<>();

    Mart(){
        materials.put("밥", 500);
        materials.put("고추장",1000);
        materials.put("고춧가루",2000);
        materials.put("마라",3500);
        materials.put("숙주",4000);
        materials.put("푸주",300);
        materials.put("나물",1700);
        materials.put("참기름",1800);
        materials.put("계란",2400);
        materials.put("떡",2400);
        materials.put("비엔나소세지",2400);
        materials.put("카레가루", 1300);
    }
    //마트의 재료들 보여주기
    void showMartMaterials (){
        for(Entry<String, Integer> ent : materials.entrySet()){
            System.out.println(ent.getKey() + " : " + ent.getValue() + "원");
        }
    }

    boolean calcPurchase(String mat, Ceo gameCeo){
        int price = 0;
        int matprice = 0;
        int qty = 0;
        //공백으로 문자 나누기
        String[] temp = mat.split("\\s+");
        if(temp[0].equalsIgnoreCase("완료"))
            return false;

        //우선 고른 재료를 살 수 있는 자본을 가지고 있는지 확인
        for(int i=0; i<temp.length/2; i++){
            matprice = materials.get(temp[2*i]);
            qty = Integer.parseInt(temp[2*i+1]);
            System.out.println(i + " : " + matprice + "," +qty);
            price += matprice*qty;
        }
        if(gameCeo.getCeoMoney() - price >= 0){
            System.out.println("구매하신 재료들의 가격은 " + price +"원 입니다! 추가로 구매할 재료가 있다면 말해주세요~");
            gameCeo.remainCeoMoney(price);
            return true;
        }else{
            System.out.println("구매하신 재료들의 가격은 " + price +"원 입니다! 하지만 돈이 부족하세요ㅠㅜㅠ다음에 다시 와주세요!");
            return false;
        }
    }
}
