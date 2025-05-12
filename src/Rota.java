import java.util.List;

public class Rota {
    private float combustivelNecessario;
    private float distancia;
    private float tempo;
    private float custo;

    public float getCusto() {
        return custo;
    }

    public void setCusto(float custo) {
        this.custo = custo;
    }

    public float getCombustivelNecessario() {
        return combustivelNecessario;
    }

    public void setCombustivelNecessario(float combustivelNecessario) {
        this.combustivelNecessario = combustivelNecessario;
    }

    public float getTempo() {
        return tempo;
    }

    public void setTempo(float tempo) {
        this.tempo = tempo;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    @Override
    public String toString() {
        return "Combustível Necessário: " + combustivelNecessario + " L\n" +
                "Distância: " + distancia + " km\n" +
                "Tempo: " + tempo + " h\n" +
                "Custo: R$ " + custo;
    }
}
