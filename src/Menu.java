import java.util.ArrayList;

public class Menu {
    private static ArrayList<String> MenuList = new ArrayList();

    //객체 생성시 메뉴 셋팅
    Menu(){
        MenuList.add("떡볶이 : 떡, 고추장, 고춧가루");
        MenuList.add("마라탕 : 마라, 숙주, 푸주");
        MenuList.add("비빔밥 : 밥, 나물, 참기름, 고추장");
        MenuList.add("김치볶음밥 : 밥, 김치, 햄");
    }

    //전체 메뉴 출력
    public static void PrintMenu(){
        for(int i = 0; i<MenuList.size(); i++)
            System.out.println(MenuList.get(i));
    }

    //입력한 메뉴 출력
    public static void PrintSelectMenu(String name){
        System.out.println("특정메뉴 불러오기");
    }
}
