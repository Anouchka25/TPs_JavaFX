package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Group root = new Group();
			Scene scene = new Scene(root,950,500,Color.GRAY);
			
			Rectangle r = new Rectangle();
			r.setX(400);
			r.setY(100);
			r.setWidth(200);
			r.setHeight(100);
			r.setArcWidth(30);
			r.setArcHeight(20);
			
			//la forme Cercle
			Circle c = new Circle();
			c.setCenterX(700); //Coordonnée X du centre du cercle
			c.setCenterY(300);  //Coordonnée Y du centre du cercle
		    c.setRadius(60); 
		   // Circle c = new Circle(800,600,60); 
		    
		  //la forme Cercle
			Ellipse e = new Ellipse();
			e.setCenterX(200);
			e.setCenterY(300);  
		    e.setRadiusX(60);  //Le rayon de l'éllipse sur l'axe X
		    e.setRadiusY(30);  //Le rayon de l'éllipse sur l'axe Y
		   // Ellipse e = new Ellipse(800,300,60,30); 
		    
		    //Polygone
		    Polygon p = new Polygon();  
		    p.getPoints().addAll(new Double[]{  
		        0.0, 0.0,  
		        100.0, 200.0,  
		        200.0, 100.0 }); 
		    
		    //Arc
		    Arc arc = new Arc();  
		    arc.setCenterX(400);  //Coordonnée X du point central
		    arc.setCenterY(300);  //Coordonnée Y du point central
		    arc.setRadiusX(50);  //Pleine largeur de l'ellipse dont Arc fait partie.
		    arc.setRadiusY(80);  //Pleine hauteur de l'ellipse dont Arc fait partie
		    arc.setStartAngle(45);  //Angle de départ de l'arc en degrés
		    arc.setLength(230);  
		    arc.setType(ArcType.ROUND); //Type d'arc: OPEN, CHORD, ROUND
		    //Arc arc = new Arc(600,300,50;80,45,230);
		    
		    //Lines 
		    Line line =  new  Line (); // instanciation de la classe Line   
	        line.setStartX (200); // définition du point X de départ de la ligne  
	        line.setStartY (42); // définition du point Y de départ de la ligne   
	        line.setEndX (400); // définition du point X de fin de la ligne   
	        line.setEndY (66); // définition du point Y de fin de la ligne 
	        
	        // Line line =  new  Line (200,42,400,66);
	        
	        //Quad Curve
	        QuadCurve qc = new QuadCurve();  
	        qc.setStartX(100);  //Coordonnée X du point de départ de la courbe quadruple
	        qc.setStartY(400); //Coordonnée Y du point de départ de la courbe quadruple
	        qc.setEndX(250);  //Coordonnée X du point final de la courbe quadruple
	        qc.setEndY(400);  //Coordonnée Y du point final de la courbe quadruple
	        qc.setControlX(70);  //Coordonnée X du point de contrôle de la courbe quadruple
	        qc.setControlY(50);  //Coordonnée Y du point de contrôle de la courbe quadruple
	        
	        //QuadCurve qc = new QuadCurve(100,400,250,400,70,50);  
	        
	        //Cubic Curve
	        CubicCurve cc = new CubicCurve();  
	        cc.setStartX(20);  //Coordonnée X du point de départ de la courbe cubique
	        cc.setStartY(100);  //Coordonnée Y du point de départ de la courbe cubique
	        cc.setEndX(100);  //Coordonnée X du point final de la courbe cubique
	        cc.setEndY(300); //Coordonnée Y du point final de la courbe cubique.
	        cc.setControlX1(300);  //Coordonnée X du premier point de contrôle de la courbe cubique.
	        cc.setControlX2(200);  //Coordonnée X du deuxième point de contrôle de la courbe cubique
	        cc.setControlY1(100);  //Coordonnée Y1 du premier point de contrôle de la courbe cubique
	        cc.setControlY2(90);  //Coordonnée Y2 du deuxième point de contrôle de la courbe cubique
		    
	        //CubicCurve cc = new CubicCurve(20,100,100,300,300,200,100,90); 
	        
	        //Path
	        Path path = new Path();
	        path.getElements().setAll(
	        		
	        		new MoveTo(800,800),
	        		new LineTo(500,500),
	        		new LineTo(500,300),
	        		new MoveTo(520,320),
	        		new LineTo(520,350));
	        		
	        root.getChildren().addAll(path);
			//root.getChildren().addAll(r,c,e,p,arc,line,qc,cc,path);
			
			primaryStage.setScene(scene);
			primaryStage.setTitle("Hello World");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
