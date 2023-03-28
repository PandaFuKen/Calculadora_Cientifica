/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora_cientifica;




import java.awt.event.ActionListener;
import java.awt.Color;
import static java.awt.SystemColor.window;
import javax.swing.*;
import java.awt.event.*;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;



public class Calculadora_Cientifica extends JFrame implements ActionListener{
     String tem = "";

    float b,c;
     double con;
     int opcion;
     
     
    private JTextField txt1, txt2, txt3; // Cuadro de ingreso de datos
    private JButton b1,b2,b3,b4,b5 ,b6 , b7 , b8 , b9 , b10 , b11 ,b12 , b13, b14 , b15 ,b16 , b17 , b18 , b19, b20 , b21 , b22 , b23 , b24 , b25 , b26 , b27 , b28 , b29 , b30 , b31 , b32 , b33 , b34 , b35 , b36 , b37 , b38 , b39;
    

    
    public  Calculadora_Cientifica(){
        setLayout(null);//Para poder visualizar varios botones
        setTitle("Calculadora");
        
        //Introduccion de numeros 
        
        txt1 = new JTextField("");
        txt1.setBounds(30, 10, 299, 40);
        add(txt1);
        setResizable(false);
        
        
        //Igual
        
        b1 = new JButton("=");
        b1.setBounds(280,250,50,80);
        add(b1);
        b1.addActionListener(this);
        b1.setBackground(Color.cyan);
        
        
        
        //sumatoria
        b2 = new JButton("+");
        b2.setBounds(280,210,50,40);
        add(b2);
        b2.addActionListener(this);
        b2.setBackground(Color.ORANGE);
        
        
        //Resta 
        b3 = new JButton("-");
        b3.setBounds(280,170,50,40);
        add(b3);
        b3.addActionListener(this);
        b3.setBackground(Color.ORANGE);
        
        b4 = new JButton("*");
        b4.setBounds(280,130,50,40);
        add(b4);
        b4.addActionListener(this);
        b4.setBackground(Color.ORANGE);
        
        b5 = new JButton("/");
        b5.setBounds(280,90,50,40);
        add(b5);
        b5.addActionListener(this);
        b5.setBackground(Color.ORANGE);
        
        
        b6 = new JButton("C");
        b6.setBounds(280, 50, 50 , 40);
        add(b6);
        b6.addActionListener(this);
        b6.setBackground(Color.ORANGE);
        
        b7 = new JButton("+/-"); 
        b7.setBounds(220, 290 , 60 , 40 );
        add(b7);
        b7.addActionListener(this);
        b7.setBackground(Color.MAGENTA);
        
        b8 = new JButton("3");
        b8.setBounds(220,250,60,40);
        add(b8);
        b8.addActionListener(this);
        b8.setBackground(Color.LIGHT_GRAY);
        
        
        b9 = new JButton("5");
        b9.setBounds(220, 210, 60, 40);
        add(b9);
        b9.addActionListener(this);
        b9.setBackground(Color.LIGHT_GRAY);
        
        b10 = new JButton("7");
        b10.setBounds(220,170,60,40);
        add(b10);
        b10.addActionListener(this);
        b10.setBackground(Color.LIGHT_GRAY);
        
        b11 = new JButton("n!");
        b11.setBounds(220, 130, 60 , 40);
        add(b11);
        b11.addActionListener(this);
        b11.setBackground(Color.MAGENTA);
        
        b12 = new JButton("ln");
        b12.setBounds(220, 90, 60 , 40);
        add(b12);
        b12.addActionListener(this);
        b12.setBackground(Color.MAGENTA);
        
        b13 = new JButton("log");
        b13.setBounds(220, 50, 60 , 40);
        add(b13);
        b13.addActionListener(this);
        b13.setBackground(Color.MAGENTA);
        
        b14 = new JButton("0");
        b14.setBounds(160, 290, 60, 40);
        add(b14);
        b14.addActionListener(this);
        b14.setBackground(Color.LIGHT_GRAY);
        
        
        b15 = new JButton("2");
        b15.setBounds(160, 250, 60 , 40);
        add(b15);
        b15.addActionListener(this);
        b15.setBackground(Color.LIGHT_GRAY);
        
        b16 = new JButton("4");
        b16.setBounds(160, 210, 60 , 40);
        add(b16);
        b16.addActionListener(this);
        b16.setBackground(Color.lightGray);
        
        b17 = new JButton("6");
        b17.setBounds(160, 170, 60 , 40);
        add(b17);
        b17.addActionListener(this);
        b17.setBackground(Color.LIGHT_GRAY);
        
        b18 = new JButton("x^2");
        b18.setBounds(160,  90 , 60 , 40 );
        add(b18);
        b18.addActionListener(this);
        b18.setBackground(Color.YELLOW);
        
        b19 = new JButton("1/x"); 
        b19.setBounds(160,130 , 60, 40);
        add(b19);
        b19.addActionListener(this);
        b19.setBackground(Color.YELLOW);
        
        b20 = new JButton("√");
        b20.setBounds(160, 50 , 60 ,40);
        add(b20);
        b20.addActionListener(this);
        b20.setBackground(Color.yellow);
        //
        b21 = new JButton(".");
        b21.setBounds(100, 290, 60, 40 );
        add(b21);
        b21.addActionListener(this);
        b21.setBackground(Color.MAGENTA);
        
        b22 = new JButton("1");
        b22.setBounds(100, 250, 60 , 40);
        add(b22);
        b22.addActionListener(this);
        b22.setBackground(Color.LIGHT_GRAY);
        
        b23 = new JButton("8");
        b23.setBounds(100, 210, 60 , 40);
        add(b23);
         b23.addActionListener(this);
        b23.setBackground(Color.LIGHT_GRAY);
                 
        b24 = new JButton("9");
        b24.setBounds(100, 170, 60 , 40);
        add(b24);
        b24.addActionListener(this);
        b24.setBackground(Color.LIGHT_GRAY);
        
        b25 = new JButton("tan");
        b25.setBounds(100,  90 , 60 , 40 );
        add(b25);
        b25.addActionListener(this);
        b25.setBackground(Color.YELLOW);
        
        b26 = new JButton("cos");
        b26.setBounds(100,130 , 60, 40);
        add(b26);
        b26.addActionListener(this);
        b26.setBackground(Color.YELLOW);
        
        b27 = new JButton("e");
        b27.setBounds(100, 50 , 60 ,40);
        add(b27);
        b27.addActionListener(this);
        b27.setBackground(Color.yellow);
     //
        b28 = new JButton("close");
        b28.setBounds(30, 290, 70, 40 );
        add(b28);
         b28.addActionListener(this);
        b28.setBackground(Color.YELLOW);
        
        b29 = new JButton("	π");
        b29.setBounds(30, 250, 70 , 40);
        add(b29);
         b29.addActionListener(this);
        b29.setBackground(Color.YELLOW);
        
        b30 = new JButton("x^y");
        b30.setBounds(30, 210, 70 , 40);
        add(b30);
         b30.addActionListener(this);
        b30.setBackground(Color.YELLOW);
                 
        b31 = new JButton("10^x");
        b31.setBounds(30, 170, 70 , 40);
        add(b31);
        b31.addActionListener(this);
        b31.setBackground(Color.YELLOW);
        
        b32 = new JButton("2√x");
        b32.setBounds(30,  90 , 70 , 40 );
        add(b32);
        b32.addActionListener(this);
        b32.setBackground(Color.YELLOW);
        
        b33 = new JButton("sin");
        b33.setBounds(30,130 , 70, 40);
        add(b33);
        b33.addActionListener(this);
        b33.setBackground(Color.YELLOW);
        
        b34 = new JButton("CE");
        b34.setBounds(30, 50 , 70 ,40);
        add(b34);
        b34.addActionListener(this);
        b34.setBackground(Color.yellow);
        
        
     
}
    
    
    public void actionPerformed(ActionEvent ae){
        txt1.setFocusable(isFocusable());
        
     
      if(ae.getSource()== Calculadora_Cientifica.this.b22){ //Numero 1
          
                          if(txt1.getText()=="")
			  {     
				b22.setText(b22.getText());
				tem=b22.getText();
			  }
			  else
			  {
				  txt1.setText(tem+b22.getText());
				  tem+=b22.getText();
			  }
      }
      
      if(ae.getSource()== Calculadora_Cientifica.this.b15){ //Numero 2
          
                          if(txt1.getText()=="")
			  {
                                
				b15.setText(b15.getText());
				tem=b15.getText();
			  }
			  else
			  {
				  txt1.setText(tem+b15.getText());
				  tem+=b15.getText();
			  }
     
      }
       if(ae.getSource()== Calculadora_Cientifica.this.b8){ //Numero 3
          
                          if(txt1.getText()=="")
			  {
				b8.setText(b8.getText());
				tem=b8.getText();
			  }
			  else
			  {
				  txt1.setText(tem+b8.getText());
				  tem+=b8.getText();
			  }
     
      }
       if(ae.getSource()== Calculadora_Cientifica.this.b16){//Numero4
           if(txt1.getText()=="")
           {
             b16.setText(b16.getText());
             tem=b16.getText();
           }
       else{
           txt1.setText(tem+b16.getText());
           tem+=b16.getText();
       }
       
       }
       
       if(ae.getSource()== Calculadora_Cientifica.this.b9){ //Numero 5
           if(txt1.getText()=="")
           {
           b9.setText(b9.getText());
           tem=b9.getText();
           }
           else
           {
             txt1.setText(tem+b9.getText());
             tem+=b9.getText();
           }
       }
       if (ae.getSource()== Calculadora_Cientifica.this.b17){ //Numero 6
           
           if(txt1.getText()=="")
			  {
				b17.setText(b17.getText());
				tem=b17.getText();
			  }
			  else
			  {
				  txt1.setText(tem+b17.getText());
				  tem+=b17.getText();
			  }
       }
       
       if(ae.getSource()== Calculadora_Cientifica.this.b10){ // Numero 7
           
           if(txt1.getText()=="")
			  {
				b10.setText(b10.getText());
				tem=b10.getText();
			  }
			  else
			  {
				  txt1.setText(tem+b10.getText());
				  tem+=b10.getText();
			  }
           
       }
       
       if(ae.getSource()== Calculadora_Cientifica.this.b23){//Numero 8 
           if(txt1.getText()=="")
           {
           b23.setText(b23.getText());
           tem=b23.getText();
           }
           else
           {
           txt1.setText(tem+b23.getText());
           tem+=b23.getText();
           }
           
       }
       if(ae.getSource()== Calculadora_Cientifica.this.b24){ //Numero 9
          if(txt1.getText()=="")
          {
              b24.setText(b24.getText());
              tem=b23.getText();
          } 
          else
          {
          txt1.setText(tem+b24.getText());
          tem+=b24.getText();
          }
       }

           if(ae.getSource()==Calculadora_Cientifica.this.b14)//Numero 0
           {
             if(txt1.getText()=="")
             {
             b14.setText(b14.getText());
             tem=b14.getText();
             }  
             else
             {
             txt1.setText(tem+b14.getText());
             tem+=b14.getText();
             }
           }
      //Operadores basicos //
       if(ae.getSource()==Calculadora_Cientifica.this.b2)//operador sumar
		  {
		   	  tem = "";
			  b=Float.parseFloat(txt1.getText());
	                   
			  txt1.setText("");
			  opcion=1;
		  }
      if(ae.getSource()==Calculadora_Cientifica.this.b3){ //Operador de resta
          tem = "";
          b=Float.parseFloat(txt1.getText());
          
          txt1.setText("");
          opcion = 2;
      }
      
      if(ae.getSource()==Calculadora_Cientifica.this.b4){//Multiplicacion
          tem = "";
          b=Float.parseFloat(txt1.getText());
          
          txt1.setText("");
          opcion = 3;
      }
      if(ae.getSource()==Calculadora_Cientifica.this.b5){//Divicion
          tem = "";
          b=Float.parseFloat(txt1.getText());
          
          txt1.setText("");
          opcion = 4;
      }
		  
      if(ae.getSource()==Calculadora_Cientifica.this.b1)//realizando las operaciones
		  {
			  c= Float.parseFloat(txt1.getText());
			  switch (opcion) {
	  case 1:       //Suma
              
			txt1.setText("");
		        txt1.setText(String.valueOf(b+c));
			break;
           case 2: //Resta
        	   txt1.setText("");
		          txt1.setText(String.valueOf(b-c));
				break;
           case 3: //Multiplicacion
        	   txt1.setText("");
		          txt1.setText(String.valueOf(b*c));
	       break;
           case 4://Divicion
        	   if( c!=0)
        	   {
        	   txt1.setText("");
		          txt1.setText(String.valueOf(b/c));
        	   }
        	   else
        		   txt1.setText("error");
           break;
           case 5:
        	   txt1.setText("");
        	   txt1.setText(String.valueOf(Math.pow(b, c)));//x¨y
        	   break;
			default:
				txt1.setText("Syntaxix Error ");
			}
		  }
        
            if(ae.getSource()==b6)//button C
		  {
       		  String tem2="";
       		  for (int i = 0; i < txt1.getText().length()-1; i++)
       		   {
       			 
				tem2=tem2+txt1.getText().charAt(i);
			   }
                    
			  txt1.setText(tem2);
			  tem=tem2;
		    }
        
            //Operadores Avanzados
            if(ae.getSource()==Calculadora_Cientifica.this.b21){ //Boton .
             if(txt1.getText()=="")
             {
             b21.setText(b21.getText());
             tem=b21.getText();
             }  
             else
             {
             txt1.setText(tem+b21.getText());
             tem+=b21.getText();
             }
                
            }
            
            if(ae.getSource()==Calculadora_Cientifica.this.b7){ //Boton +/-
                float tem6;
			  tem6=-Float.valueOf(txt1.getText());
			  txt1.setText(String.valueOf(tem6));
            }
            
            if(ae.getSource()==Calculadora_Cientifica.this.b11)//Factorial n!
            {
              double k=1;
			b=Float.parseFloat(txt1.getText()); 
			txt1.setText("");
	         for (int i = 1; i <=b; i++) 
	         {
				k=k*i;
			}
			txt1.setText(String.valueOf(k));
              
        }
            
           if(ae.getSource()==Calculadora_Cientifica.this.b12)//Ln
		  { 
			b=Float.parseFloat(txt1.getText()); 
			txt1.setText("");
			txt1.setText(String.valueOf(Math.log(b)));
			c=0;
		  }
           if(ae.getSource()==Calculadora_Cientifica.this.b13) //Log
		  {
			b=Float.parseFloat(txt1.getText()); 
			txt1.setText("");
			txt1.setText(String.valueOf(Math.log10(b)));
			c=0;
		  }
           if(ae.getSource()==Calculadora_Cientifica.this.b19) // 1/x
           {
               b=Float.parseFloat(txt1.getText()); 
			txt1.setText("");
			if(b!=0)
			txt1.setText(String.valueOf(1/b));
			else
				txt1.setText("error");
           }
           
           if(ae.getSource()==Calculadora_Cientifica.this.b18) // x^2
           {
            b=Float.parseFloat(txt1.getText()); 
			txt1.setText("");
			txt1.setText(String.valueOf(Math.pow(b,2)));
			c=0;   
           }
           
           if(ae.getSource()==Calculadora_Cientifica.this.b20) // √
           {
            b=Float.parseFloat(txt1.getText());
			  txt1.setText(String.valueOf(Math.sqrt(b)));
			  b=0;   
           }
           if(ae.getSource()==Calculadora_Cientifica.this.b32)
           {
               b=Float.parseFloat(txt1.getText());
               txt1.setText(String.valueOf(Math.sqrt(b)));
               b=0;
           }
           
           if(ae.getSource()==Calculadora_Cientifica.this.b34) //CE
           {
               txt1.setText("");	
			tem="";
			c=0;
			b=0;
			opcion=0;
			con=0;
           }
           if(ae.getSource()==Calculadora_Cientifica.this.b26)
           {
               b=Float.parseFloat(txt1.getText()); 
			con=(b*Math.PI)/180;
			txt1.setText("");
			txt1.setText(String.valueOf(Math.cos(con)));
			con=0;
			c=0;
           }
           if(ae.getSource()==Calculadora_Cientifica.this.b33)
           {
               b=Float.parseFloat(txt1.getText()); 
			con=(b*Math.PI)/180;//convercion de radianes a sexagesimales
			txt1.setText("");
			txt1.setText(String.valueOf(Math.sin(con)));
			c=0;
			con=0;
           }
           if(ae.getSource()==Calculadora_Cientifica.this.b25)
           {
               b=Float.parseFloat(txt1.getText()); 
			con=(b*Math.PI)/180;//convercion de grados a radianes
			txt1.setText("");
			txt1.setText(String.valueOf(Math.tan(con)));
			con=0;
			c=0;
           }
          
             if(ae.getSource()==Calculadora_Cientifica.this.b31) // x10^x
           
            {
            b=Float.parseFloat(txt1.getText()); 
			txt1.setText("");
			txt1.setText(String.valueOf(Math.pow(10,b)));
			c=0;   
           }   
             if(ae.getSource()==Calculadora_Cientifica.this.b29) //PI
             {
                
                 b=Float.parseFloat(txt1.getText());
                 con=(b*Math.PI);
                 txt1.setText("");
                 txt1.setText(String.valueOf(con));
                 c=0; 
                 
               
             }
             
             if(ae.getSource()==Calculadora_Cientifica.this.b27) //e
             {   
                 
                 b=Float.parseFloat(txt1.getText());
                 con=(b*Math.E);
                 txt1.setText("");
                 txt1.setText(String.valueOf(con));
                 c=0; 
             }
             
            if(ae.getSource()==Calculadora_Cientifica.this.b30)//
            {
                b=Float.parseFloat(txt1.getText()); 
			txt1.setText("");
			opcion=5;
			tem="";
            }
           if(ae.getSource()==Calculadora_Cientifica.this.b28)
           {
               System.exit(0);
           }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Calculadora_Cientifica window1 = new Calculadora_Cientifica();
    window1.setBounds(0, 0, 380,440);
    window1.setVisible(true);
    window1.setDefaultCloseOperation(EXIT_ON_CLOSE);
    window1.setLocationRelativeTo(null);
    
       
    
    
        

    window1.getContentPane().setBackground(Color.darkGray); 
    
    
    }
   
}
