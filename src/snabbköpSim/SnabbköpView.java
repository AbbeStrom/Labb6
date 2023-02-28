package snabbköpSim;

import generalSimulator.View;

import java.util.Observable;

public class SnabbköpView extends View {

    private void parameterPrint(SnabbkopState state){
        System.out.println("PARAMETRAR");
        System.out.println("==========\n" +
        "Antal kassor, N..........: " + AntalKassor + "\n" +
                "Max som ryms, M...........: " + maxCustomer + "\n" +
                "Ankomsthastighet, lambda..: " + lambda + "\n" +
                "Plocktider, [P_min...Pmax]: [" + plockTimeMin + ".." + plockTimeMax + "]" + "\n" +
                "Betaltider, [K_min...Kmax]: [" + payTimeMin + ".." + payTimeMax + "]" + "\n" +
                "Frö, f...................: " + seed + "\n\n" +
                "FÖRLOPP \n" +
                "=======\n" +
                "   Tid Händelse  Kund  ?   led    ledT    I    $    :-(   köat     köT    köar    [Kasskö..]");


    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
