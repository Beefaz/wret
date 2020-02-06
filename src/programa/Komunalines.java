package programa;

public class Komunalines {
    private int nr;
    private int gyventojuSk;
    private String objektoTipas;
    private double objektoPlotas;
    private double rinkliava;

    public Komunalines(int nr, int gyventojuSk, String objektoTipas, double objektoPlotas, double rinkliava) {
        this.nr = nr;
        this.gyventojuSk = gyventojuSk;
        this.objektoTipas = objektoTipas;
        this.objektoPlotas = objektoPlotas;
        this.rinkliava = rinkliava;
    }

    public Komunalines(int gyventojuSk, String objektoTipas, double objektoPlotas, double rinkliava) {
        this.gyventojuSk = gyventojuSk;
        this.objektoTipas = objektoTipas;
        this.objektoPlotas = objektoPlotas;
        this.rinkliava = rinkliava;
    }

    public Komunalines() {
    }

    public int getNr() {
        return nr;
    }

    public int getGyventojuSk() {
        return gyventojuSk;
    }

    public String getObjektoTipas() {
        return objektoTipas;
    }

    public double getObjektoPlotas() {
        return objektoPlotas;
    }

    public double getRinkliava() {
        return rinkliava;
    }

    public void setGyventojuSk(int gyventojuSk) {
        this.gyventojuSk = gyventojuSk;
    }

    public void setObjektoTipas(String objektoTipas) {
        this.objektoTipas = objektoTipas;
    }

    public void setObjektoPlotas(double objektoPlotas) {
        this.objektoPlotas = objektoPlotas;
    }

    public void setRinkliava(double rinkliava) {
        this.rinkliava = rinkliava;
    }

    @Override
    public String toString() {
        return "komunalines{" +
                "nr=" + nr +
                ", gyventojuSk=" + gyventojuSk +
                ", objektoTipas='" + objektoTipas + '\'' +
                ", objektoPlotas=" + objektoPlotas +
                ", rinkliava=" + rinkliava +
                '}';
    }
}
