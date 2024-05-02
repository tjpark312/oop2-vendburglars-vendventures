package repository;

import entity.Manager;

public class ManagerRepository {
    private Manager manager = null;

    public boolean logIn(String email, String password) {
        // 만약 관리자가 입력한 비밀번호가 등록된 비밀번호와 같다면
        if(manager.getEmail().equals(email) && manager.getPassword().equals(password)) {
            // 관리자 인증 성공
            return true;
        }
        else { // 비밀번호가 다르면
            // 관리자 인증 실패로 비밀번호 입력으로 다시 돌아감(순서도 참고)
            return false;
        }
    }

    public void changePassword(String email, String password, String newPassword) {
        // 만약 관리자가 입력한 비밀번호가 등록된 비밀번호와 같다면
        if(manager.getEmail().equals(email) && manager.getPassword().equals(password)) {
            // 비밀번호 변경
            manager.setPassword(newPassword);
        }
        else {
            // 비밀번호 변경하지 않고 종료
            return;
        }
    }

    public boolean logOut() {
        // 관리자 로그아웃하기
        return false;
    }

    public void save(Manager manager) {
        this.manager = manager;
    }
}
