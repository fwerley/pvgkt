module com.fwerley.pvgkt {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;
    requires tornadofx;


    opens com.fwerley.pvgkt to javafx.fxml;
    exports com.fwerley.pvgkt;
}