public class Ponto {

    private Integer x;
    private Integer y;
    private Boolean res;
    private Double distancia;

    public Ponto(Integer x, Integer y, Boolean res, Double distancia) {
        this.x = x;
        this.y = y;
        this.res = res;
        this.distancia = distancia;
    }

    public Ponto() {
        this.x = 0;
        this.y = 0;
        this.res = false;
        this.distancia = 0.0;
    }

    public Integer getx() {
        return x;
    }

    public void setx(Integer x) {
        this.x = x;
    }

    public Integer gety() {
        return y;
    }

    public void sety(Integer y) {
        this.y = y;
    }

    public Boolean getres() {
        return res;
    }

    public void setres(Boolean res) {
        this.res = res;
    }

    public Double getDistancia() {
        return distancia;
    }

    public void setDistancia(Double distancia) {
        this.distancia = distancia;
    }

    public Double calcula() {
        res = (this.x == this.y) ? false : true;

        if (res) {
            distancia = Math.sqrt(x * x + y * y);
            System.out.println("A distância entre os dois pontos é: " + distancia + ".");
            return distancia;
        } else {
            System.out.println("Os pontos estão na mesma posição.");
            return null;
        }

    }
}