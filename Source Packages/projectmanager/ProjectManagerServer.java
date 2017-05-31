/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author johnn
 */
public class ProjectManagerServer {
    
    public static void main(String[] args) throws IOException{
        ServerSocket listener = new ServerSocket(9090);
        try{
            while(true){
                Socket socket = listener.accept();
                
                
            }
            
        }
        finally{
            listener.close();
        }   
        
    }
    
}
