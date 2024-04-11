class Carro {
    private String marca;
    private String modelo;
    private TipoMotor motor;

    public Carro(String marca, String modelo, String cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
    }

    public void ligarCarro() {
        System.out.println("Carro ligado: " + marca + " " + modelo);
    }

    public void desligarCarro() {
        System.out.println("Carro desligado: " + marca + " " + modelo);
    }
}
