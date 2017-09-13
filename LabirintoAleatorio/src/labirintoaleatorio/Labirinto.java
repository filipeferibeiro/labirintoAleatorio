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
        int tamanho = rand.nextInt(3);
        int tamanho2;
        
        switch(tamanho){
            case 0:
                tamanho = 16;
                tamanho2 = 160; // 10 x 16
                break;
            case 1:
                tamanho = 18;
                tamanho2 = 216; // 12 x 18
                break;
            case 2:
                tamanho = 20;
                tamanho2 = 280; // 14 x 20
                break;
            default:
                tamanho = 20;
                tamanho2 = 280;
                break;
        }
        
        
        this.matriz = new Sala [tamanho2][tamanho2];
        
        int cont = 1;
        int coluna = 1;
        boolean flag = false;
        for (int i = 0; i < tamanho2; i++) {
            System.out.println("\n");
            flag = true;
            for (int j = 0; j < tamanho2; j++){
                if (flag){
                    if (cont < (tamanho - 1) && (coluna < tamanho2)){
                        this.matriz[i][coluna] = new Sala(1, false, false, false);
                        cont++;
                    }
                    else{
                        cont = 1;
                    }
                    if (coluna + (tamanho - 1) < tamanho2){
                        this.matriz[i][coluna + (tamanho - 1)] = new Sala(1, false, false, false);
                    }
                    flag = false;
                    coluna++;
                }
                /*else if(j != cont && this.matriz[i][j] == null){
                    //this.matriz[i][j] = new Sala(0, false, false, false);
                }*/
                if (this.matriz[i][j] != null){
                    System.out.print(this.matriz[i][j].qntSala);
                }
                else{
                    System.out.print("0");
                }
                
                
                /*if (cont == tamanho){
                    matriz[i][j]
                    
                }*/
                
            }
        }
        
        System.out.println("\n\n\n" + tamanho + " tamanho²: " + tamanho2);
    }
    
    
    
    public static void main(String[] args) {
        Labirinto lab = new Labirinto();
    }
    
}
