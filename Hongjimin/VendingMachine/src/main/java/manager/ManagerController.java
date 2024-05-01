package manager;

import java.util.Scanner;

public class ManagerController {
    ManagerController managerController = new ManagerController();
    ManagerRepository managerRepository = new ManagerRepository();
    Manager manager = new Manager();

    Scanner scanner = new Scanner(System.in);

    public boolean logIn() {
        boolean success = false;
        if(managerRepository.managers.length == 0) {
            managerController.registerManager();
        }
        else{
        //등록이 되있을 경우,
        System.out.print("이메일을 입력해주세요 : ");
        String email = scanner.next();

        System.out.print("비밀번호를 입력해주세요 : ");
        String password = scanner.next();

        success = managerRepository.logIn(email, password);
        }
        return success;
    }

    public boolean changePassword(String email, String password, String newPassword) {
        return true;
    }

    public void logOut() {

    }

    public void registerManager() {
        //이메일, 비밀번호 최초 등록
        System.out.print("이메일을 등록해주세요 : ");
        String email = scanner.next();

        System.out.print("비밀번호를 등록해주세요 : ");
        String password = scanner.next();

        // 매니저 레포지토리에 이메일/비밀번호 정보 저장
        manager = new Manager(email, password);
        managerRepository.save(manager);
    }
}
