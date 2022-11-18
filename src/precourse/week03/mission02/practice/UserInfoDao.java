package precourse.week03.mission02.practice;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public interface UserInfoDao {      // 인터페이스 선언



    void insertUserInfo(UserInfo userInfo);

    void updateUserInfo(UserInfo userInfo);

    void deleteUserInfo(UserInfo userInfo);
}
