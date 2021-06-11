package service;

public class EmailService {
    public boolean checkEmail(String email){
        String regexEmail =  "^[A-Za-z0-9._%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
        if (email.matches(regexEmail)){
                   return  true;
        }else return false;
    }
}
