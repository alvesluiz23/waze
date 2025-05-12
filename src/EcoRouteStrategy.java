public class EcoRouteStrategy implements RouteStrategy {

    public Rota calcula(String ruaInicial, String ruaFinal) {
        float somaCaracteres = ruaInicial.length() + ruaFinal.length();
        Rota rota = new Rota();
        rota.setTempo(somaCaracteres);
        rota.setDistancia(somaCaracteres / 3);
        rota.setCombustivelNecessario(somaCaracteres / 5);
        rota.setCusto(somaCaracteres / 2);
        return rota;
    }
}

