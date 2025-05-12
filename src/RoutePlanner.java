public class RoutePlanner {
    private RouteStrategy routeStrategy;

    public RoutePlanner(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;

    }

    public Rota calcula(String origem, String destino){
        return routeStrategy.calcula(origem, destino);

    }
}
