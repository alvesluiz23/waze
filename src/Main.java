//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        RoutePlanner routePlanner = RouterPlannerFabric.create(new UserInfo("eletric", "Casual"));

        System.out.println(routePlanner.calcula("Aqui", "ali"));

    }
}