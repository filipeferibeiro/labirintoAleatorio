package labirintoaleatorio;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Random;
import java.lang.Math;

public class Labirinto {
    private int [][] matriz;
    
    public Labirinto () {
        Random rand = new Random();
        int tamanho = 9 + rand.nextInt(3);
        tamanho = (int) Math.pow(tamanho, 2);
        this.matriz = new int [tamanho][tamanho];
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++){
                int cont = 0;
            }
        }
        
    }
        
    
}
