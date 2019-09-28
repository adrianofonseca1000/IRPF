/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irpf;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author 11311089
 */
public class IRPF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        
        Map<String, Object> prop = new HashMap<>();
        prop.put("Teste", "rere");
        
        GeradorArquivo a = new Gerador_XML_Compactado();
                a.gerarArquivo("c:/temp/teste.xml" , prop);
                
                a= new GeradorPropriedadesCriptografado();
                a.gerarArquivo("c:/temp/teste2.propertiesa", prop);
    }
    
}
