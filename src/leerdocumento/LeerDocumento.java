/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leerdocumento;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 *
 * @author VIVALDI
 */
public class LeerDocumento {

    /**
     * @param args the command line arguments
     */
    static ArrayList<String> nl;
    static ArrayList<String> elm;
    public static void main(String[] args) {
        cargartxt();
        imprimirtxt();
    }
    public static void cargartxt(){
        String txt = "C:\\Users\\VIVALDI\\Documents\\NetBeansProjects\\LeerDocumento\\src\\leerdocumento\\MiNombre.txt";
        File ruta = new File(txt);
        try{
            FileReader fi = new FileReader(ruta);
            BufferedReader bu = new BufferedReader(fi);
            String linea = null;
            while((linea = bu.readLine())!=null){
                StringTokenizer st = new StringTokenizer(linea, " ");
                nl = new ArrayList<String>();
                while(st.hasMoreTokens()){
                    nl.add(st.nextToken());
                }
            }
            bu.close();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public static void imprimirtxt(){
        for (int i = 0; i < nl.size();i++){
            System.out.println("L"+" "+i+" "+nl.get(i));
        }
    }
    
}
