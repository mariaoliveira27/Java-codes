public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Esta tampada? " + this.tampada);
    }

    void rabiscar(){
        if(this.tampada == true || carga == 0){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    void tampar(){
        this.tampada = true;
        //c1
    }
    void destampar(){
        this.tampada = false;
    }
}
