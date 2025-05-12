public class RouterPlannerFabric {
    public static RoutePlanner create(UserInfo userInfo){
        if(userInfo.getTipoCarro().toLowerCase().equals("Sedan")){
            return new RoutePlanner(new CheapestRouteStrategy());
        }

        if(userInfo.getTipoCarro().toLowerCase().equals("eletric")){
            return new RoutePlanner(new EcoRouteStrategy());

        }
        if(userInfo.getTipoCarro().toLowerCase().equals("utilitario")){
            return new RoutePlanner(new ShortestRouteStrategy());

        }
        if(userInfo.getTipoCarro().toLowerCase().equals("esportivo")){
            return new RoutePlanner(new FastestRouteStrategy());

        }else{
            return new RoutePlanner(new FastestRouteStrategy());
        }


    }
}
