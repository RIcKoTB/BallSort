package com.example.ballsort.bl;

import com.example.ballsort.da.UserDao;
import com.example.ballsort.da.entity.User;
import javafx.scene.control.Alert;

import java.sql.SQLException;
import java.util.List;

public class SignIn {
    private static UserDao userDao;

    public SignIn(UserDao userDao) {
        this.userDao = userDao;
    }
    public static boolean signIn(User user) throws SQLException {
        if(user.getName().length() < 1 || user.getPassword().length() < 1){
            System.out.println("Логін або пароль но може бути пустий");
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Помилка");
            alert.setHeaderText("Логін та/або пароль не вірні!");
            alert.showAndWait();
            return false;
        }
        System.out.println(userDao.getAllUsers());

        if (isExistUser(user) == 1) {
            System.out.println("Авторизація успішна");
        }else if(isExistUser(user) == 2){
            System.out.println("Не вірний логін або пароль");
        }
        return true;
    }
    public static int isExistUser(User user) throws SQLException {
        List<User> users = userDao.getAllUsers();
        for(User  userList: users){
            if(userList.getName().equals(user.getName()) && userList.getPassword().equals(user.getPassword())){
                return 1;
            }
        }
        return 2;
    }
}
