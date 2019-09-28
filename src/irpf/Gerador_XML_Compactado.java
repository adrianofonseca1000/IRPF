/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package irpf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author 11311089
 */
public class Gerador_XML_Compactado extends GeradorArquivo{

    
    @Override
    public String gerarConteudo(Map<String, Object> propriedades) {
        StringBuilder str = new StringBuilder ();
        str.append("<properties>");
        for (String key : propriedades.keySet()){
            str.append("\r\n\t<" + key + ">" + 
                    propriedades.get (key) + "</" + key + ">");
            
        }
        
        str.append("</properties>");
        return str.toString();

    }

    @Override
    public byte[] posProcessamento(byte[] bytes) throws IOException {
        try (ByteArrayOutputStream byteOut = 
                new ByteArrayOutputStream ();
            ZipOutputStream out =
                    new ZipOutputStream(byteOut); ) {
            
            out.putNextEntry(new ZipEntry ("internal"));
            out.write(bytes);
            
            return byteOut.toByteArray();
        }
            
        }
    
        }
