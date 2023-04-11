package com.example.ballsort.bl;

import com.example.ballsort.da.UserDao;
import com.example.ballsort.da.entity.User;
import javafx.scene.control.Alert;

import java.sql.SQLException;

public class SignUp {

   private static UserDao userDao;

   public SignUp(UserDao userDao) {
      this.userDao = userDao;
   }
   public static boolean signUp(User user) throws SQLException {
      if(user.getName().length() < 1 || user.getPassword().length() < 1){
         System.out.println("Логін або пароль но може бути пустий");
         Alert alert = new Alert(Alert.AlertType.INFORMATION);
         alert.setTitle("Помилка");
         alert.setHeaderText("Логін та/або пароль не вірні!");
         alert.showAndWait();
         return false;
      }
      userDao.addUser(user);
      return true;
   }
}
