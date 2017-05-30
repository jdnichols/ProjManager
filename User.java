/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;

// Users are identified by a username;
public class User {
    private String nickname;
    public User(String nick)
    {
        nickname = nick;
    }
    public void setUserName(String s){
        nickname = s;
    }
    public String getUserName(){
        return nickname;
    }
}
