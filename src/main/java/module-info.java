module com.example.network_analysis_tool {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.network_analysis_tool to javafx.fxml;
    exports com.example.network_analysis_tool;
}