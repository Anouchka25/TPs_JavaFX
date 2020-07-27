package application;
	
import com.sun.prism.Image;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Orientation;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.Color;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,950,500);
			
			//1-Label
			Label la = new Label("Ceci est une étiquette");
			
			//2-Button
			Button bu = new Button("boutton");
			bu.setLayoutX(140);  //Placer sur le repère à 140 pixels sur l'axe X
			
			//3-RadioButton
			RadioButton ra1 = new RadioButton("radio 1"); //"radio 1" le texte qui s'affichera à coté du bouton radio
			ra1.setLayoutX(140);
			RadioButton ra2 = new RadioButton("radio 2");
			ra2.setLayoutX(240);
			/**
			 * Pour faire fonctionner les buton radio, rajoutez l'objet ToggleGroup et l'associer tous les bouton radio du group.
			 * 
			 */
			ToggleGroup tg = new ToggleGroup();
			ra1.setToggleGroup(tg);
			ra2.setToggleGroup(tg);
			ra1.setSelected(true); //Pour indiquer le buton qui sera sélectionné par défaut
			System.out.println(tg.getSelectedToggle()); //permet d'afficher le bouton qui est sélectionné
			
			//4- CheckBox
			CheckBox ch = new CheckBox("checkbox");
			
			//5-ChoiceBox
			/**
			 * <Object> parametre générique
			 * Mettez en paramètre une FXCollections.observableArrayList 
			 * qui elle-même prend en paramètre tout ce qui sera sélectionnable dans ChoiceBox
			 * Exemple j'ai 3 elements : First, A, B 
			 * Et Separator qui permet de créer une ligne horizontale
			 */
			ChoiceBox<Object> cb = 
					new ChoiceBox<Object>(FXCollections.observableArrayList("First", new Separator(), "A", "B"));
			cb.setLayoutX(240);
			cb.setTooltip(new Tooltip("c'est un CB")); //Utilisable par tous les composants, permet d'afficher un message informatif au passage de la souris sur un composant
	        
			//6- TextField
			TextField te = new TextField();
			te.setLayoutX(470);
			te.setText("blablabla"); //permet de définir un texte initial
			//existe : clear(), getText(), copy(), cut(), paste(), selectAll()
	        
			//7- PasswordField
			PasswordField pa = new PasswordField();
			pa.setLayoutX(470);
			pa.setLayoutX(50);
			pa.setPromptText("saisir"); //permet de mettre un texte peu visible en arrière plan
			
			//8- ScrollBar
			ScrollBar sc = new ScrollBar();
			sc.setLayoutX(150);
			sc.setOrientation(Orientation.VERTICAL);
			sc.setMin(0); //ScrollBar fonctionne avec des valeurs numériques, vous pouvez donc définir le minimux et le maximum
			sc.setMax(2000);
			
			//9- ComboBox
			ComboBox<String> cmb = 
					new ComboBox(FXCollections.observableArrayList("First", new Separator(), "A", "B"));
			cmb.getItems().addAll("ajout");
			cmb.setLayoutX(300);
			cmb.setLayoutY(400);
			cmb.setVisibleRowCount(2);
			cmb.setValue("ajout");
			
			
			root.getChildren().addAll(cmb);
			//root.getChildren().addAll(r,c,e,p,arc,line,qc,cc,path);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Les composants");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
