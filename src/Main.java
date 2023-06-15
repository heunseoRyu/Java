import java.sql.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    //입력할때 공백이 있으면 삭제하는거 구현
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        ArrayList<String> pNums = new ArrayList<>();
        while (true){

            System.out.print("고르세요. 0.종료 1.저장 2.저장목록 보기 3.검색 4.삭제 >> ");
            Scanner sc = new Scanner(System.in);//숫자 입력받기
            int choice = sc.nextInt();
            if (choice == 0){
                break;
            }
            else if (choice == 1) { // 만약 저장하라하고 하면
                System.out.print("이름을 입력하세요>> ");
                Scanner sc1 = new Scanner(System.in);
                String Name = sc1.nextLine();
                System.out.print("전화번호를 입력하세요>> ");
                Scanner sc2 = new Scanner(System.in);
                String pNum = sc2.nextLine();
                names.add(Name);
                pNums.add(pNum);
            }
            else if(choice == 2) {
                for(int j=0;j<names.size();j++){
                    System.out.print(names.get(j) + ":" + pNums.get(j));
                }
            }
            else if(choice==3) {
//                int flag = 0;
                System.out.print("이름을 검색하시오 >> ");
                Scanner sc3 = new Scanner(System.in);
                String pn = sc3.nextLine();
//                for(String i: names) {
//                    if (i == pn) {
//                        System.out.println(pNums.get(names.indexOf(i)));
//                        flag = 1;
//                    }
//                }
                try {
                    System.out.println(pNums.get(names.indexOf(pn)));
                } catch(IndexOutOfBoundsException e) {
                    System.out.println("없어 야발");
                }
//                if (flag==0){
//                    System.out.println("없는데?");
//                }
            }
            else if(choice==4) {
                System.out.print("삭제할 이름을 입력하시오 >> ");
                Scanner sc4 = new Scanner(System.in);
                String pn = sc4.nextLine();
                try {
                    names.remove(pn);
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("없어 야발");
                }
            }
            else {
                System.out.println("어!다시하거라");
            }
        }
    }

}