package dhbw.tabelle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class tableController implements Initializable {

    @FXML
    private TableView<schueler> table;
    @FXML
    private TableColumn<schueler, String> col_geschlecht;
    @FXML
    private TableColumn<schueler, String> col_kurs;
    @FXML
    private TableColumn<schueler, String> col_nachname;
    @FXML
    private TableColumn<schueler, String> col_unternehmen;
    @FXML
    private TableColumn<schueler, Integer> col_vorkenntnisse;
    @FXML
    private TableColumn<schueler, String> col_vorname;

    ObservableList<schueler> obsList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        try {
            Connection con = DBConnector.getConnection();
            ResultSet rs = con.createStatement().executeQuery("SELECT vorname,nachname,geschlecht,vorkenntnisse,kurs.bezeichnung,unternehmen.name " +
                    "FROM (schueler LEFT JOIN unternehmen ON schueler.uId = unternehmen.uId) " +
                    "LEFT JOIN kurs ON schueler.kId = kurs.kId");

            while (rs.next()) {
                obsList.add(new schueler(
                        rs.getString("vorname"),
                        rs.getString("nachname"),
                        rs.getString("geschlecht"),
                        rs.getString("bezeichnung"),
                        rs.getString("name"),
                        rs.getInt("vorkenntnisse")
                ));
                }
            } catch(SQLException e){
                throw new RuntimeException(e);
            }

            col_vorname.setCellValueFactory(new PropertyValueFactory<>("vorname"));
            col_nachname.setCellValueFactory(new PropertyValueFactory<>("nachname"));
            col_geschlecht.setCellValueFactory(new PropertyValueFactory<>("geschlecht"));
            col_vorkenntnisse.setCellValueFactory(new PropertyValueFactory<>("vorkenntnisse"));
            col_kurs.setCellValueFactory(new PropertyValueFactory<>("kurs"));
            col_unternehmen.setCellValueFactory(new PropertyValueFactory<>("unternehmen"));

            table.setItems(obsList);
        }
}

