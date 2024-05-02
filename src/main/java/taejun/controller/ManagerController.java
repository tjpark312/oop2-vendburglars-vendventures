package taejun.controller;

import taejun.repository.managerRepo.ManagerRepository;

import java.util.Scanner;

public class ManagerController {

    // 여기서 ManagerRepository를 선언해주어야 전체적으로 이 레파지토리에 대한 값을 사용가능함
    private ManagerRepository managerRepository;

    public ManagerController(ManagerRepository managerRepository) {
        this.managerRepository = managerRepository;
    }

    // 관리자 로그인
    public boolean login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("============= 로그인 ==============");
        System.out.println("사용자의 이메일을 입력하세요. ");
        String email = scanner.next();

        System.out.println("사용자의 비밀번호를 입력하세요. ");
        String password = scanner.next();


        Boolean success = managerRepository.login(email, password); // managerRepository의 login 메소드의 매개변수 안에 scanner로 받은 email과 password 넣어준다
        if (success) {
            System.out.println("로그인 완료 되었습니다.");

            return true;

        } else {
            System.out.println(" 아이디 또는 비밀번호가 잘못입력 되었습니다.");

            return false;
        }
    }

    // 관리자 비밀번호 변경
    public void changePassword() {
        Scanner scanner = new Scanner(System.in);

        if (login()) {
            System.out.println(" 새로운 비밀번호를 입력하십시오 ");
            String newPassword = scanner.next();

            managerRepository.changePassword(newPassword);
        }
    }


    // 관리자 등록
    public void resisterManger() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("관리자 등록을 하겠습니다.");

        System.out.println(" 이메일을 입력해주세요. ");
        String email = scanner.next();

        System.out.println(" 이름을 입력해주세요. ");
        String name = scanner.next();

        System.out.println(" 비밀번호를 입력해주세요. ");
        String password = scanner.next();

        managerRepository.save(email, name, password);

    }

    public boolean logout() {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 로그아웃 하시겠습니까? " + "\n 1. 예 " + "\n 아니요 ");
        int choice = scanner.nextInt();

        if(choice == 1 ){
            System.out.println("로그아웃 하셨습니다 ");
            return false;

        }else
            return  true;


    }
}



