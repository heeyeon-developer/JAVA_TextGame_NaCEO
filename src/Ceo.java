import java.util.HashMap;

public class Ceo {
    private static String name = "나사장";
    private static String Leve = "초보사장";
    private static int goddPoint = 0;
    private static int badPoint = 0;
    private static int money = 500000;
    private static HashMap<String, Integer> naMaterials = new HashMap();//가지고 있는 재료

    public void showMaterials(){
        naMaterials.put("밥", 2);
        naMaterials.put("고추장",3);
        System.out.println(naMaterials);
    }

}
