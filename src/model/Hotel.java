package model;



public class Hotel {

    private Integer id;
    private String nomeFilial;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private boolean Hotel5strelas;
    private Integer numeroDeEstrelas;


    public Hotel(String nomeFilial, String rua, Integer numero, String cidade, String estado, boolean hotel5strelas, Integer numeroDeEstrelas) {
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        Hotel5strelas = hotel5strelas;
        this.numeroDeEstrelas = numeroDeEstrelas;
    }

    public Hotel(Integer id, String nomeFilial, String rua, Integer numero, String cidade, String estado, boolean hotel5strelas, Integer numeroDeEstrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        Hotel5strelas = hotel5strelas;
        this.numeroDeEstrelas = numeroDeEstrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isHotel5strelas() {
        return Hotel5strelas;
    }

    public void setHotel5strelas(boolean hotel5strelas) {
        Hotel5strelas = hotel5strelas;
    }

    public Integer getNumeroDeEstrelas() {
        return numeroDeEstrelas;
    }

    public void setNumeroDeEstrelas(Integer numeroDeEstrelas) {
        this.numeroDeEstrelas = numeroDeEstrelas;
    }

    public int hotel_5_estrelas_0_false_1_true() {
        if (isHotel5strelas() == true) {
            int hotel5 = 1;
            return hotel5;
        } else {
            int hotel5 = 0;
            return hotel5;
        }
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", Hotel5strelas=" + Hotel5strelas +
                ", numeroDeEstrelas=" + numeroDeEstrelas +
                '}';
    }
}
