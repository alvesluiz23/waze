
public class FastestRouteStrategy implements RouteStrategy{

    public Rota calcula(String ruaInicial, String ruaFinal){
        float somaCaracteres = ruaInicial.length() + ruaFinal.length();
        Rota rota = new Rota();
        rota.setTempo(somaCaracteres/5);
        rota.setDistancia(somaCaracteres/3);
        rota.setCombustivelNecessario(somaCaracteres);
        rota.setCusto(somaCaracteres);
        return rota;
    }
}
