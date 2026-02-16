public class Obj
{
    private String marca;
    private String tipo;
    private int cilin;
    private Double pgAnt;
    private Double pgAct;
    private int numCelda;

    public Obj() {}

    public Obj(String marca, String tipo, int cilin, Double pgAnt, Double pgAct, int numCelda) 
    {
        this.marca = marca;
        this.tipo = tipo;
        this.cilin = cilin;
        this.pgAnt = pgAnt;
        this.pgAct = pgAct;
        this.numCelda = numCelda;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCilin() {
        return cilin;
    }
    public void setCilin(int cilin) {
        this.cilin = cilin;
    }
    public Double getPgAnt() {
        return pgAnt;
    }
    public void setPgAnt(Double pgAnt) {
        this.pgAnt = pgAnt;
    }
    public Double getPgAct() {
        return pgAct;
    }
    public void setPgAct(Double pgAct) {
        this.pgAct = pgAct;
    }
    public int getNumCelda() {
        return numCelda;
    }
    public void setNumCelda(int numCelda) {
        this.numCelda = numCelda;
    }
}
