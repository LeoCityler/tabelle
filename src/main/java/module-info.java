module dhbw.tabelle {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javafx.graphics;


    opens dhbw.tabelle to javafx.fxml;
    exports dhbw.tabelle;
}