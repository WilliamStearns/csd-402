/**William Stearns
 * CSD 402 
 * 7-20-2025
 * This JavaFX application demonstrates the use of an Accordion with TitledPanes within a restaurant ordering system.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {

    private VBox orderListVBox = new VBox(); // VBox to hold submitted orders

    /**
     * Main method to launch the JavaFX application.
     */
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {


        // Created TitledPanes initialized.
        TitledPane pane1 = new TitledPane("Sandwiches", new Label("BLT\nClub\nMeatball Marinara"));
        TitledPane pane2 = new TitledPane("Sides", new Label("Fries\nChips\nSalad"));
        // Create empty TitledPane and set its content with methods.
        TitledPane pane3 = new TitledPane();
        pane3.setText("Drinks");
        pane3.setContent(new Label("Soda\nCoffee\nTea\nWater"));

        // Create Accordion with panes, add the new pane to it, and set the first pane as expanded.
        Accordion accordion = new Accordion(pane1, pane2);
        accordion.getPanes().add(pane3); // Add the new pane to the accordion
        accordion.setExpandedPane(pane1); 
        
   
        // Create Form Fields 
        Label sandwichLabel = new Label("Sandwich:");
        TextField sandwichField = new TextField();

        Label sideLabel = new Label("Side:");
        TextField sideField = new TextField();

        Label drinkLabel = new Label("Drink:");
        TextField drinkField = new TextField();

        // GridPane for form layout
        GridPane form = new GridPane();
        form.setVgap(10);
        form.setHgap(10);
        form.setPadding(new Insets(15));

        form.add(sandwichLabel, 0, 0);
        form.add(sandwichField, 1, 0);

        form.add(sideLabel, 0, 1);
        form.add(sideField, 1, 1);

        form.add(drinkLabel, 0, 2);
        form.add(drinkField, 1, 2);

        // Create Submit Button 
        Button submitButton = new Button("Submit Order");

        // VBox to display submitted orders
        orderListVBox.setSpacing(5);

        // ScrollPane wraps the VBox of orders to handle overflow
        ScrollPane orderScrollPane = new ScrollPane(orderListVBox);
        orderScrollPane.setFitToWidth(true);

        // TitledPane for displaying submitted orders
        TitledPane submittedOrdersPane = new TitledPane("Submitted Orders", orderScrollPane);
        submittedOrdersPane.setCollapsible(false); // Make it non-collapsible
        submittedOrdersPane.setExpanded(true); // Ensure it's expanded by default
        submittedOrdersPane.setAnimated(false); // Disable animation for immediate visibility

        // Handle submit button click
        submitButton.setOnAction(e -> {
            String sandwich = sandwichField.getText();
            String side = sideField.getText();
            String drink = drinkField.getText();

            // Format order text
            String order = "\nSandwich: " + sandwich + "\nSide: " + side + "\nDrink: " + drink;

            // Add new order label to VBox
            Label orderLabel = new Label(order);
            orderListVBox.getChildren().add(orderLabel);

            // Clear fields after submission
            sandwichField.clear();
            sideField.clear();
            drinkField.clear();
        });

        // VBox to hold the form and submit button
        VBox formSection = new VBox(10, form, submitButton);
        formSection.setPadding(new Insets(10));

        // Allow Accordion to grow vertically and fill available space
        VBox.setVgrow(accordion, Priority.ALWAYS);
        // Limit max height for order scroll pane inside titled pane
        orderScrollPane.setMaxHeight(200);
        VBox.setVgrow(orderScrollPane, Priority.ALWAYS);
        // Prevent submitted orders pane from forcing layout height
        VBox.setVgrow(submittedOrdersPane, Priority.NEVER);
        // Form section keeps natural height
        VBox.setVgrow(formSection, Priority.NEVER);
        
        // Main vertical layout: accordion, form section, and submitted orders pane
        VBox mainLayout = new VBox(20, accordion, formSection, submittedOrdersPane);
        mainLayout.setPadding(new Insets(20));
        // Create and set scene
        Scene scene = new Scene(mainLayout, 400, 600);
        primaryStage.setTitle("Accordion with Form and Submitted Orders");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
