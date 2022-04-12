import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class StartMain {
    public static void main(String args[]) {
        Menu naMenu = new Menu();
        Ceo naCeo = new Ceo();
        Mart realMart = new Mart();
        Scanner answer = new Scanner(System.in);
        ArrayList<Integer> wantMat = new ArrayList();
        Customer randCustomer = new Customer("테스트손님");
        System.out.println("=================================");
        System.out.println("WELCOME TO NA'S RESTAURANT  :-)");
        System.out.println("=================================");

        System.out.print("당신은 그동안 자신의 레스토랑을 열기위해 노력한 나사장님입니다. 나사장님 가게에는 원하는 메뉴를 손님들이 생각해오고\n" +
                "사장님이 그 요리를 만들어주고 있어요. 만약 재료가 없으면 요리를 만들어 주지 못하고 손님은 실망해서 가버려요ㅠㅜㅠ\n" +
                "손님들의 수요를 잘 파악해서 재료를 구비하고 만족도를 높여주세요!\n" +
                "그럼 게임을 시작해볼까요! GoGo (아무키나 눌르고 엔터를 눌러주세요)\n");
        answer.next();
        //먼저 나사장의 게임이 처음인지 물어보기
        System.out.println("\n나사장 게임이 처음인가요~~??\n1. 처음이예요\n2. 처음이 아니예요");
        if (answer.nextInt() == 1) {
            System.out.println("\n게임이 처음이라면 먼저 레시피를 봐보도록 해요!\n" +
                    "아래의 레시피를 보고 앞으로 어떤 재료를 사면 될지 생각해볼까요??\n" +
                    "레시피를 다 보고 나면 아무키나 눌러주세요! 마트로 이동해서 만들고 싶은 레시피의 재료를 사도록 해요!!");
            System.out.println("\n************* Na's Menu *************");
            naMenu.PrintMenu();
            System.out.println("*************************************\n");
            answer.nextLine();
        } else {
            System.out.println("레시피를 어느 정도 알고계시겠네요!!그럼 마트로 장을 보러 가봐요~!!");
        }
        answer.nextLine();
        //메뉴보거나 마트가서 장보기
        System.out.println("\n========== 마트로 이동 ==========\n");
        System.out.println("마트 주인 : 나사장님 오늘도 장보러 오셨군요! 오늘은 어떤 재료를 드릴까?\n" +
                "(원하는 재료랑 갯수를 입력하고 엔터를 쳐주세요! 모든 재료를 다 샀다면 '완료' 라고 입력해주세요!!)");
        realMart.showMartMaterials();

        while (true) {
            String input = answer.nextLine();
            boolean result = true;
            //재료를 다 입력하면 계산되서 물건을 사기
            result = realMart.calcPurchase(input, naCeo);

            //그만사기 위해서 '완료'를 입력하면 끝내기
            if (result == false)
                break;

            realMart.showMartMaterials();
        }

        //메뉴를 다 보고 마트가서 장을 다 봤다면 가게로 이동
        System.out.println("장을 다 봤으면 가게로 가서 장사를 해볼까요~!!");
        System.out.println("========== 가게로 이동 ==========");
        while (true) {
            boolean makeResult = true;
            System.out.println("손님을 받아볼까요?? 1.고고 2. 아직 마음의 준비가... 3.다시 마트로 가요! 4.구입한 재료들을 보고싶어요!");
            int useranswer = answer.nextInt();
            //가게로 이동하면 손님을 받을 수 있다.
            //손님을 받다가 중간에 어떻게 하면 멈출지 생각해보기
            if (useranswer == 1) {
                String makeMenu = "";
                makeMenu = randCustomer.sayMenu1();
                int nthMenu = naMenu.getMenuNum(makeMenu);
                makeResult = naCeo.makeMenu(makeMenu, naMenu, nthMenu);
                //만든 메뉴를 손님에게 주기
                //손님이 원하는 메뉴면 pay, goodpoint 주기
                randCustomer.givePay(makeMenu);
                randCustomer.giveGoodPoint();

                if(makeResult == false){
                    useranswer = answer.nextInt();
                    System.out.println("다음 손님을 받을까요? 아니면 모자른 재료를 사러 다시 마트로 재료를 사러 가볼까요?? 1. 손님을 받아요! 2.마트로 고고!! 3.아니요 오늘은 장사 끝!!");
                    if(useranswer == 1){
                        continue;
                    }else if(useranswer == 2){
                        System.out.println("마트 고고~~");
                    }else {
                        System.out.println("오늘도 고생 많으셨어요 나사장님!! 저희 다음에 더 열심히 장사해보자구요~~다음에 봐요~~!! :-)");
                        break;
                    }
                }else
                    continue;
            }else if (useranswer == 2){
                System.out.println("이제 마음의 준비가 끝났나요~~?? 1. 네 고고!! 2. 아직도....");
            }else if (useranswer == 3){
                System.out.println("마트로 이동!!");
            }else if (useranswer == 4){
                naCeo.showMaterials();
            }else {
                System.out.println("이제 마음의 준비가 끝났나요~~?? 1. 네 고고!! 2. 아직도....");
            }
        }
    }
}
