
package clases;

public class Operacion {
    private int primerNumero;
    private int segundoNumero;
    
    public void setPrimerNumero(int primerNumero){
        
        this.primerNumero = primerNumero;
    }
            public void setSegundoNumero(int segundoNumero){
        
        this.segundoNumero = segundoNumero;
    }
            public int devolverSuma(){
                return primerNumero + segundoNumero;
            }
                public int devolverResta(){
                return primerNumero - segundoNumero;
}
}