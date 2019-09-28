/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irpf;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author 11311089
 */
public abstract class GeradorArquivo {
    
    public final void gerarArquivo (String nome, Map<String, Object> propriedades)throws IOException {
       String conteudo =  gerarConteudo (propriedades);
       
       byte[] b = posProcessamento (conteudo.getBytes());
       
       try(FileOutputStream out = new FileOutputStream(nome)){
           out.write(b);
       }
    }

    public abstract String gerarConteudo(Map<String, Object> propriedades);

    public byte[] posProcessamento(byte[] bytes) throws IOException {
        return bytes;
    }
    
}
