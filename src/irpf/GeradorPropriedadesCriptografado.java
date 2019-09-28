/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irpf;

import java.io.IOException;
import java.util.Map;

/**
 *
 * @author 11311089
 */
public class GeradorPropriedadesCriptografado extends GeradorArquivo{

    @Override
    public String gerarConteudo(Map<String, Object> propriedades) {
          StringBuilder str = new StringBuilder();
            for(String key: propriedades.keySet ()){
                str.append(key).append("=").append(propriedades.get(key)).append("\r\n");
    }
    return str.toString();
    
    }
    
    @Override
    public byte[] posProcessamento(byte[] bytes) throws IOException {
        
        byte[] novoBytes = new byte[bytes.length];

        for (int i = 0; i < bytes.length; i++){
            novoBytes [i] = (byte) ((bytes [i]+ 5) % Byte.MAX_VALUE);
        }
        return novoBytes;
    }    

}
