public class ShortestRouteStrategy implements RouteStrategy{

    public Rota calcula(String ruaInicial, String ruaFinal){
        float somaCaracteres = ruaInicial.length() + ruaFinal.length();
        Rota rota = new Rota();
        rota.setTempo(somaCaracteres/3);
        rota.setDistancia(somaCaracteres/5);
        rota.setCombustivelNecessario(somaCaracteres/2);
        rota.setCusto(somaCaracteres/2);
        return rota;
    }
}
