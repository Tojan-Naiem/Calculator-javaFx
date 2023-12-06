/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package javafxapplication1;


import javafx.scene.image.Image;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Tojan AboGhola
 */
public class Calculator extends Application {
     TextField txt;
     Label label1,label2;
     double oldAnswer=0,num=0;
     char ch;
     int counterOfNumbers=0;
     
     public void Calculate()
     {
         switch(ch)
         {
             case '+':
             {
                 oldAnswer+=num;
                 break;
             }
              case '-':
             {
                 if(!(label1.getText().isEmpty()))
                 oldAnswer-=num;
                 else oldAnswer=num-oldAnswer;
                 break;
             }
              case '*':
              {
                  if(label1.getText().isEmpty())oldAnswer=num;
                  else oldAnswer*=num;
                 break;
              }
             
              case '/':{
                
                  if(label1.getText().isEmpty())oldAnswer=num;
                  else oldAnswer/=num;
                 break;
              }
             
         }
     }
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root=new Pane();//making group
        root.setStyle("-fx-background-color: #222");
        Scene scene =new Scene(root,265,300);
        
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
          
        primaryStage.setTitle("Calculator");
        primaryStage.getIcons().add(new Image("/images/calculator.png"));
         
        
        //Font 
        Font font=Font.font("Verdana", 20);
        
        //Label
        
        label1=new Label("");
        label1.setLayoutX(180);
        label1.setLayoutY(5);
        label1.setStyle("-fx-text-fill: cyan;");
        label1.setFont(Font.font("Monospaced", FontWeight.BOLD, 13));
        root.getChildren().add(label1);
        
        label2=new Label("");
        label2.setLayoutX(20);
        label2.setLayoutY(5);
        label2.setStyle("-fx-text-fill: #222");
        label2.setFont(Font.font("Monospaced", FontWeight.BOLD, 13));
        root.getChildren().add(label2);
        
        
        //MAKING BUTTONS************ 

        // 1. for button from 0 to 9
        
       
        Button btn0=new Button("0");
        Button btn1=new Button("1");
        Button btn2=new Button("2");
        Button btn3=new Button("3");
        Button btn4=new Button("4");
        Button btn5=new Button("5");
        Button btn6=new Button("6");
        Button btn7=new Button("7");
        Button btn8=new Button("8");
        Button btn9=new Button("9");
        
        // button 7
        btn7.setLayoutX(10);
        btn7.setLayoutY(90);
        btn7.setPrefSize(45, 45);
        btn7.setStyle("-fx-background-color: #696969");
        btn7.setFont(font);
        btn7.setTextFill(Color.WHITE);
        root.getChildren().add(btn7);
        
        //button 4
        btn4.setLayoutX(10);
        btn4.setLayoutY(140);
        btn4.setPrefSize(45, 45);
        btn4.setStyle("-fx-background-color: #696969");
        btn4.setFont(font);
        btn4.setTextFill(Color.WHITE);
        root.getChildren().add(btn4);
        
        //button 1
        btn1.setLayoutX(10);
        btn1.setLayoutY(190);
        btn1.setPrefSize(45, 45);
        btn1.setStyle("-fx-background-color: #696969");
        btn1.setFont(font);
        btn1.setTextFill(Color.WHITE);
        root.getChildren().add(btn1);
        
        //button 8
        btn8.setLayoutX(60);
        btn8.setLayoutY(90);
        btn8.setPrefSize(45, 45);
        btn8.setStyle("-fx-background-color: #696969");
        btn8.setFont(font);
        btn8.setTextFill(Color.WHITE);
        root.getChildren().add(btn8);
        
         //button 9
        btn9.setLayoutX(110);
        btn9.setLayoutY(90);
        btn9.setPrefSize(45, 45);
        btn9.setStyle("-fx-background-color: #696969");
        btn9.setFont(font);
        btn9.setTextFill(Color.WHITE);
        root.getChildren().add(btn9);
        
        //button 5
        btn5.setLayoutX(60);
        btn5.setLayoutY(140);
        btn5.setPrefSize(45, 45);
        btn5.setStyle("-fx-background-color: #696969");
        btn5.setFont(font);
        btn5.setTextFill(Color.WHITE);
        root.getChildren().add(btn5);
        
        //button 6
        btn6.setLayoutX(110);
        btn6.setLayoutY(140);
        btn6.setPrefSize(45, 45);
        btn6.setStyle("-fx-background-color: #696969");
        btn6.setFont(font);
        btn6.setTextFill(Color.WHITE);
        root.getChildren().add(btn6);
        
        //button 2
        btn2.setLayoutX(60);
        btn2.setLayoutY(190);
        btn2.setPrefSize(45, 45);
        btn2.setStyle("-fx-background-color: #696969");
        btn2.setFont(font);
        btn2.setTextFill(Color.WHITE);
        root.getChildren().add(btn2);
        
        //button 3
        btn3.setLayoutX(110);
        btn3.setLayoutY(190);
        btn3.setPrefSize(45, 45);
        btn3.setStyle("-fx-background-color: #696969");
        btn3.setFont(font);
        btn3.setTextFill(Color.WHITE);
        root.getChildren().add(btn3);
        
        //button 0
        btn0.setLayoutX(10);
        btn0.setLayoutY(240);
        btn0.setPrefSize(95, 45);
        btn0.setStyle("-fx-background-color: #696969");
        btn0.setFont(font);
        btn0.setTextFill(Color.WHITE);
        root.getChildren().add(btn0);
        
        
        // 2. for button operation
        
        Button btnPlus=new Button ("+");
        Button btnMinus=new Button("-");
        Button btnMulti=new Button("×");
        Button btnDivision=new Button("÷");
        Button btnEqual=new Button("=");
        
        
        //button plus
        btnPlus.setLayoutX(160);
        btnPlus.setLayoutY(90);
        btnPlus.setPrefSize(45, 45);
        btnPlus.setStyle("-fx-background-color: #00416A");
        btnPlus.setFont(font);
        btnPlus.setTextFill(Color.WHITE);
        root.getChildren().add(btnPlus);
        
        
        //button minus
        btnMinus.setLayoutX(160);
        btnMinus.setLayoutY(140);
        btnMinus.setPrefSize(45, 45);
        btnMinus.setStyle("-fx-background-color: #00416A");
        btnMinus.setFont(font);
        btnMinus.setTextFill(Color.WHITE);
        root.getChildren().add(btnMinus);
        
        
        // button multi
        btnMulti.setLayoutX(160);
        btnMulti.setLayoutY(190);
        btnMulti.setPrefSize(45, 45);
        btnMulti.setStyle("-fx-background-color: #00416A");
        btnMulti.setFont(font);
        btnMulti.setTextFill(Color.WHITE);
        root.getChildren().add(btnMulti);
        
        
        // button division
        btnDivision.setLayoutX(160);
        btnDivision.setLayoutY(240);
        btnDivision.setPrefSize(45, 45);
        btnDivision.setStyle("-fx-background-color: #00416A");
        btnDivision.setFont(font);
        btnDivision.setTextFill(Color.WHITE);
        root.getChildren().add(btnDivision);
        
        
        //button equal
        btnEqual.setLayoutX(210);
        btnEqual.setLayoutY(190);
        btnEqual.setPrefSize(45, 95);
        btnEqual.setStyle("-fx-background-color: #00416A");
        btnEqual.setFont(font);
        btnEqual.setTextFill(Color.WHITE);
        root.getChildren().add(btnEqual);
        
                
        // 3.Final
        
        Button btnC=new Button("C");
        Button btnArrow=new Button("←");
        Button btnPoint=new Button(".");
        
        //button point
        btnPoint.setLayoutX(110);
        btnPoint.setLayoutY(240);
        btnPoint.setPrefSize(45, 45);
        btnPoint.setStyle("-fx-background-color: #696969");
        btnPoint.setFont(font);
        btnPoint.setTextFill(Color.WHITE);
        root.getChildren().add(btnPoint);
        
        //button c
        btnC.setLayoutX(210);
        btnC.setLayoutY(90);
        btnC.setPrefSize(45, 45);
        btnC.setStyle("-fx-background-color: #AA0000");
        btnC.setFont(font);
        btnC.setTextFill(Color.WHITE);
        root.getChildren().add(btnC);
        
        
        //button arrow
        btnArrow.setLayoutX(210);
        btnArrow.setLayoutY(140);
        btnArrow.setPrefSize(45, 45);
        btnArrow.setStyle("-fx-background-color: #E25822");
        btnArrow.setFont(font);
        btnArrow.setTextFill(Color.WHITE);
        root.getChildren().add(btnArrow);
        
        
        
        
        //TextField******************
        
        txt=new TextField();
        txt.setLayoutX(10);
        txt.setLayoutY(20);
        txt.setPrefSize(250, 45);
        txt.setFont(font);
        root.getChildren().add(txt);
        
        
        
        
        
        
        //EVENT************************************
        
      
        
        
        
        EventHandler eventHandler;
        eventHandler = (new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                
                if(event.getSource()==btn0)
                {
                    if(txt.getText().equals("0"))
                        txt.setText("0");
                    else txt.setText(txt.getText()+"0");
              
                }
                else if(event.getSource()==btn1)
                {
                    if(txt.getText().equals(""))
                        txt.setText("1");
                    else txt.setText(txt.getText()+"1");
              
                }
                else if(event.getSource()==btn2)
                {
                    if(txt.getText().equals(""))
                        txt.setText("2");
                    else txt.setText(txt.getText()+"2");
              
                }
                else if(event.getSource()==btn3)
                {
                    if(txt.getText().equals(""))
                        txt.setText("3");
                    else txt.setText(txt.getText()+"3");
              
                }
                else if(event.getSource()==btn4)
                {
                    if(txt.getText().equals(""))
                        txt.setText("4");
                    else txt.setText(txt.getText()+"4");
              
                }
                else if(event.getSource()==btn5)
                {
                    if(txt.getText().equals(""))
                        txt.setText("5");
                    else txt.setText(txt.getText()+"5");
              
                }
                else if(event.getSource()==btn6)
                {
                    if(txt.getText().equals(""))
                        txt.setText("6");
                    else txt.setText(txt.getText()+"6");
              
                }
                else if(event.getSource()==btn7)
                {
                    if(txt.getText().equals(""))
                        txt.setText("7");
                    else txt.setText(txt.getText()+"7");
              
                }
                else if(event.getSource()==btn8)
                {
                    if(txt.getText().equals(""))
                        txt.setText("8");
                    else txt.setText(txt.getText()+"8");
              
                }
                else if(event.getSource()==btn9)
                {
                    if(txt.getText().equals(""))
                        txt.setText("9");
                    else txt.setText(txt.getText()+"9");
              
                }
                 if(event.getSource()==btnMinus)
                {
                    if(txt.getText().isEmpty())
                    {
                        num=0;
                    }
                    else  num=Double.parseDouble(txt.getText());
                    ch='-';
                    Calculate();
                    label2.setText(Double.toHexString(oldAnswer));
                    label1.setText(label1.getText()+Double.toString(num)+btnMinus.getText());
                    txt.setText(" ");
                    counterOfNumbers++;
                    
                }
                else if(event.getSource()==btnPlus)
                        
                {if(txt.getText().isEmpty())
                    {
                        num=0;
                    }
                    else  num=Double.parseDouble(txt.getText());
                     ch='+';
                     Calculate();
                     label2.setText(Double.toHexString(oldAnswer));
                     label1.setText(label1.getText()+Double.toString(num)+btnPlus.getText());
                     txt.setText(" ");
                     counterOfNumbers++;
                }
                else if(event.getSource() == btnDivision)
                {
                    if(txt.getText().isEmpty())
                    {
                        num=0;
                    }
                    else  num=Double.parseDouble(txt.getText());
                    ch='/';
                    Calculate();
                    label2.setText(Double.toHexString(oldAnswer));
                    label1.setText(label1.getText()+Double.toString(num)+btnDivision.getText());
                    txt.setText(" ");
                    counterOfNumbers++;
                }
                else if(event.getSource() == btnMulti)
                {
                   if(txt.getText().isEmpty())
                    {
                        num=0;
                    }
                    else  num=Double.parseDouble(txt.getText());
                    ch='*';
                    Calculate();
                    label2.setText(Double.toHexString(oldAnswer));
                    label1.setText(label1.getText()+Double.toString(num)+btnMulti.getText());
                    txt.setText(" ");
                    counterOfNumbers++;
                }
                else if(event.getSource() == btnPoint)
                {
                    
                    if(txt.getText().isEmpty())txt.setText("0.");
                    else if(!txt.getText().contains("."))txt.setText(txt.getText()+".");
                    else txt.setText("Syntax ERROR");
                    
                }
                else if(event.getSource() == btnArrow)
                {
                    if(txt.getText().equals("Syntax ERROR"))txt.setText(" ");
                    else if(!txt.getText().isEmpty())txt.setText(txt.getText().substring(0, txt.getText().length()-1));
                    
                    
                }
                else if(event.getSource() == btnC)
                {
                    txt.setText("");
                    label1.setText("");
                    oldAnswer=0;
                    num=0;
                    ch=' ';
                    
                    
                }
                
                else if(event.getSource() == btnEqual)
                {
                    if(!txt.getText().isEmpty())
                    {
                        if(counterOfNumbers==1)
                        {
                            txt.setText("Syntax ERROR");
                        }
                        else {
                        num=Double.parseDouble(txt.getText());
                    
                    label1.setText(label1.getText()+Double.toString(num));
                    double result=Double.parseDouble(label2.getText());
                   switch(ch)
                   {
                       case '+':
                       {
                           Calculate();
                           result=oldAnswer;break;
                       }
                       case '-':
                       {
                           Calculate();
                           result=oldAnswer;break;
                       }
                       case '*':
                       {
                          
                          result=result*num;
                           break;
                       }
                       case '/':
                       {
                          
                           
                          result=result/num;break;
                       }
                   }
                    txt.setText(Double.toString(result));
                }
                
                }
                }
            }
            
            
            
            
            
            
        });
        
        btn0.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn2.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn3.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn4.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn5.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn6.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn7.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn8.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btn9.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btnPlus.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btnMinus.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btnMulti.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btnDivision.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btnEqual.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btnArrow.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btnPoint.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        btnC.addEventHandler(MouseEvent.MOUSE_CLICKED, eventHandler);
        
   
        primaryStage.show();
        
      
    
   
     
       
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch();
    }
    
}
