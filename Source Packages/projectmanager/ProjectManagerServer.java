/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectmanager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author johnn
 */
public class ProjectManagerServer {
    
    public static void main(String[] args) throws IOException{
        try(ServerSocket listener = new ServerSocket(9090)) {
            while(true){
                Socket socket = listener.accept();
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                
            }
            
        }   
        
    }
    
}
