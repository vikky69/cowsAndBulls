package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableView;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class Controller {
    public Spinner <Integer> n1Spinner;
    public Spinner <Integer> n2Spinner;
    public Spinner <Integer> n3Spinner;
    public Spinner <Integer> n4Spinner;
    public TableView<Turn> resultTable;
    private int nr=1;
    private Set<Integer> rand = new LinkedHashSet<>();


    public void initialize (){
        Random r = new Random();
        while (rand.size() < 4) {
            int n = r.nextInt(10);
            rand.add(n);
        }


    }

    public void doGo(ActionEvent actionEvent) {
        Turn t = new Turn();
        t.setNr(nr);
        nr++;
        t.setN1(n1Spinner.getValue());
        t.setN2(n2Spinner.getValue());
        t.setN3(n3Spinner.getValue());
        t.setN4(n4Spinner.getValue());

        resultTable.getItems().add(t);
    }




}
