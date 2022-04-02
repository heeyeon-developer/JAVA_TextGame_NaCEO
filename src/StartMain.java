import java.util.Scanner;

public class StartMain {
    public static void main(String args[]){
        Menu naMenu = new Menu();
        Ceo naCeo = new Ceo();
        Scanner answer = new Scanner(System.in);
        System.out.println("=================================");
        System.out.println("WELCOME TO NA'S RESTAURANT :-)");
        System.out.println("=================================");

        System.out.print("당신은 그동안 자신의 레스토랑을 열기위해 노력한 나사장님입니다. 나사장님 가게에는 원하는 메뉴를 손님들이 생각해오고\n" +
                "사장님이 그 요리를 만들어주고 있어요. 만약 재료가 없으면 요리를 만들어 주지 못하고 손님은 실망해서 가버려요ㅠㅜㅠ\n" +
                "손님들의 수요를 잘 파악해서 재료를 구비하고 만족도를 높여주세요!\n" +
                "그럼 게임을 시작해볼까요! GoGo (아무키나 눌르고 엔터를 눌러주세요)\n");
        answer.next();
        //메뉴보거나 마트가서 장보기

        //메뉴를 다 보고 마트가서 장을 다 봤다면 가게로 이동

        //가게에서 손님들 들어오는 기능 만들기 -> 우선 스레드 없이 구현
        System.out.print("나사장의 게임을 처음 시작하신다면 메뉴를 숙지하는걸 추천드려요!\n" +
                "처음이 아니라면 마트로 이동해볼까요??\n1. 메뉴 보기\n2. 마트가서 장보기\n");

        if(answer.nextInt() == 1){
            naMenu.PrintMenu();
        }else{
            System.out.println("마트로 가나요??");
        }

    }
}
