import java.util.ArrayList;
import java.util.Random;

public class Menu {
    private ArrayList<String> menuList = new ArrayList();
    private static ArrayList<String> menuName = new ArrayList();

    //객체 생성시 메뉴 셋팅
    Menu(){//떡볶이 3000 마라탕 11000 비빔밥 8000
        menuList.add("떡볶이 : 떡, 고추장, 고춧가루, 카레가루");
        menuName.add("떡볶이");
        menuList.add("마라탕 : 마라, 숙주, 푸주, 비엔나소세지");
        menuName.add("마라탕");
        menuList.add("비빔밥 : 밥, 나물, 참기름, 고추장, 계란");
        menuName.add("비빔밥");
        //MenuList.add("김치볶음밥 : 밥, 김치, 햄");
        //MenuList.add("베이컨까르보나라 : 파스타면, 우유, 크림, 계란, 베이컨");
        //MenuList.add("짬뽕 : 면, 양파, 홍합, 오징어");
        //MenuList.add("부대찌개 : 햄, 고추장, 다진고기, ");
        //MenuList.add("햄버거 : 빵, 패티, 토마토, 상추, 마요네즈");
    }

    //전체 메뉴 출력
    void printMenu(){
        for(int i = 0; i<menuList.size(); i++)
            System.out.println(menuList.get(i));
    }

    //입력한 메뉴 출력
    void printSelectMenu(ArrayList<String> name){
        System.out.println("특정메뉴 불러오기");
    }

    //랜덤한 메뉴 출력
    String getRandManu(){
        Random rand = new Random();
        int randNum = rand.nextInt(3);
        return menuName.get(randNum);
    }

    String getMenu(int num){
        return menuName.get(num);
    }

    int getMenuNum(String menuname){
        if(menuName.get(0).equals(menuname)){
            return 0;
        }else if(menuName.get(1).equals(menuname)){
            return 1;
        }else if(menuName.get(2).equals(menuname)){
            return 2;
        }else
            return 99;
    }
}
