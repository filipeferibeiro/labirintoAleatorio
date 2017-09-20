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

        public void setQntSala(int qntSala) {
            this.qntSala = qntSala;
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
    
    private int [][] matriz;
    private Sala[] salas;
    
    public Labirinto (int tam) {
        int tamanho, tamanho2;
        Random rand = new Random();
               
        switch(tam){
            case 160:
                tamanho = 16;
                tamanho2 = 160; // 10 x 16
                break;
            case 216:
                tamanho = 18;
                tamanho2 = 216; // 12 x 18
                break;
            case 280:
                tamanho = 20;
                tamanho2 = 280; // 14 x 20
                break;
            default:
                tamanho = 20;
                tamanho2 = 280;
                break;
        }
        this.salas = new Sala[tamanho2];
        this.matriz = new int [tamanho2][tamanho2];
        
        //Random salaRnd = new Random();
        int verifRand;
        int cont = 1;
        int contSalas = 0;
        //int coluna = 1;
        boolean flag = false;
        for (int i = 0; i < tamanho2; i++) {
            salas[i] = new Sala(contSalas, false, false, false);
            //System.out.println("\n");
            flag = true;
            for (int j = 1; j < tamanho2; j++){
                if (flag){
                    if (cont < (tamanho - 1) && (j < tamanho2)){
                        verifRand = rand.nextInt(5);
                        if (verifRand != 0){
                            this.matriz[i][j] = 1;
                            contSalas += 1;
                        }
                        else{
                            this.matriz[i][j] = 0;
                        }
                        cont++;
                    }
                    else{
                        cont = 1;
                    }
                    if (j + (tamanho - 1) < tamanho2){
                        verifRand = rand.nextInt(5);
                        if (verifRand != 0){
                            this.matriz[i][j + (tamanho - 1)] = 1;
                            contSalas += 1;
                        }
                        else{
                            this.matriz[i][j + (tamanho - 1)] = 0;
                        }
                        
                    }
                    flag = false;
                }
                else{
                    break;
                }
            }
            for (int k = 0; k < i; k++){
                if(this.matriz[k][i] == 1){
                    contSalas += 1;
                }
            }
            salas[i].setQntSala(contSalas);
            contSalas = 0;
        }

    }
    
    public int[][] getLabirinto() {
        return this.matriz;
    }
    
    public Sala getSala(int i) {
        return this.salas[i];
    }
    
    public Sala[] getSalas() {
        return this.salas;
    }
}
