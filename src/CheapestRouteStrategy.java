public class CheapestRouteStrategy  implements RouteStrategy{

    public Rota calcula(String ruaInicial, String ruaFinal){
        float somaCaracteres = ruaInicial.length() + ruaFinal.length();

        Rota rota = new Rota();
        rota.setTempo(somaCaracteres/2);
        rota.setDistancia(somaCaracteres/2);
        rota.setCombustivelNecessario(somaCaracteres/3);
        rota.setCusto(somaCaracteres/5);
        return rota;
    }
}


