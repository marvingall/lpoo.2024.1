class TipoMotor {
    private String cilindrada;

    public TipoMotor(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public void ligarCarro() {
        System.out.println("Motor " + cilindrada + " ligado");
    }

    public void desligarCarro() {
        System.out.println("Motor " + cilindrada + " desligado");
    }
}