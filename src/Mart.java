import java.util.ArrayList;

public class Mart {
    private static ArrayList materials = new ArrayList();

    Mart(){
        materials.add("밥");
        materials.add("떡볶이");
        materials.add("나물");
        materials.add("고추장");
        materials.add("간장");
        materials.add("마라");
        materials.add("숙주");
        materials.add("햄");
        materials.add("비엔나소세지");
        materials.add("푸주");
    }

    public void calcPurchase(ArrayList materials, int money){
        System.out.println("구매하신 재료들의 가격은 얼마 입니다! 다음에 또 오세요~~");
        //만약 가진 돈이 부족하다면
        System.out.println("돈이 부족해요...더 벌어와!!");
    }
}
