public class Celular {
    private String proprietario;
    private String marca;
    private int modelo;
    
    public Celular(String proprietario, String marca, int modelo) {
        this.proprietario = proprietario;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public int getModelo() {
        return modelo;
    }
    
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
    public void verificarModelo() {
        if (modelo >= 24) {
            System.out.println("Modelo de linha");
        } else {
            System.out.println("Modelo fora de linha");
        }
    }
    
    @Override
    public String toString() {
        return "Celular{" + "marca=" + marca + ", proprietario=" + proprietario + ", modelo=" + modelo + '}';
    }

    public static void main(String[] args) {
        Celular celular1 = new Celular("Joao", "Samsung", 22);
        Celular celular2 = new Celular("Daniel", "Samsung", 24);
        
        System.out.println(celular1);
        
        celular1.verificarModelo();
        
        System.out.println(celular2);
        
        celular2.verificarModelo();
    }
}
