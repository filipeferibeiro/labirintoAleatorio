package labirintoaleatorio;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Random;
import java.lang.Math;

public class Labirinto {
    public class Sala {
        int qntSala;
        boolean trap, key, exit;
        
        public Sala(int qntSala, boolean trap, boolean key, boolean exit){
            this.qntSala = qntSala;
            this.trap = trap;
            this.key = key;
            this.exit = exit;
        }

        public int getQntSala() {
            return qntSala;
        }

        public boolean isTrap() {
            return trap;
        }

        public boolean isKey() {
            return key;
        }

        public boolean isExit() {
            return exit;
        }

        public void setTrap(boolean trap) {
            this.trap = trap;
        }

        public void setKey(boolean key) {
            this.key = key;
        }
        
    }
    
    
    private Sala [][] matriz;
    
    public Labirinto () {
        Random rand = new Random();
        int tamanho = 32 + rand.nextInt(14);
        int tamanho2 = (int) Math.pow(tamanho, 2);
        this.matriz = new Sala [tamanho2][tamanho2];
        
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++){
                int cont = 0;
                
            }
        }
        
        System.out.println(tamanho);
    }
    
    
    
    public static void main(String[] args) {
        Labirinto lab = new Labirinto();
    }
    
}
