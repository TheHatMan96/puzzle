import java.util.Scanner;
public class Puzzlejuego{
    public static void main(String args[]){
        char par;
    Scanner scan=new Scanner(System.in);
   int nums5 = 0,nums4 = 5, nums3 = 4,nums2 = 3,nums1 = 2, nums =  5, nums8 = 6, nums6 = 7, nums7 = 8;                

                 System.out.println("Instrucciones");
                    System.out.println("d=izquierda");
                System.out.println(" a=derecha");
                    System.out.println(" w=arriba");
                System.out.println(" s=abajo");                
            
                    Scanner scan=new Scanner(System.in);
                System.out.println("Aca esta su menu, seleccione la opcion que quiera: ");
                    System.out.print("MENU: \n"+"JUGAR (J)\n" + "ESC (E)\n" +"__");
        par=scan.next().charAt(0);
             
                if(par=='e' || par=='E'){
                    String nombre;
                    System.out.println("Escriba su Nombre");
                    nombre=scan.next();
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("Felicidades es el primero en no poder completar el juego");
                    System.out.println(".................");
                }
                 
                if(par=='j'|| par== 'J'){
            
               while(!false && par!='e'){
                     while(!false){                
                     System.out.println("\n" +num1+"  "+num2+"  "+num3+ "\n"); System.out.println(+num4+"  "+num5+"  "+num6+ "\n");System.out.println(+num7+"  "+num8+"  "+num+ "\n");
                 
                 System.out.print("Complete el rompecabezas utilizando las teclas (izquierda, arriba, abajo, derecha)");
         par=scan.next().charAt(0);               
                 
              if(par=='w' || par=='W'){
                if(num==0){
                 num=num6;
                 num6=0;
                 break;
                 }
                if(num8==0){
                    num8=num5;
                    num5=0;
                    break;
                }
                if(num7==0){
                    num7=num4;
                    num4=0;
                    break;
                }
                if(num4==0){
                    num4=num1;
                    num1=0;
                    break;
                }
                if(num5==0){
                    num5=num2;
                    num2=0;
                    break;
                }
                if(num6==0){
                    num6=num3;
                    num3=3;
                    break;
                }
                if(num1==0){
                num1=num7;
                num7=0;
                break;
                }
                 if(num1==0){
                 num1=num7;
                 num7=0;
                 break;
                }
                 if(num2==0){
                     num2=num8;
                     num8=0;
                     break;
                 }
                 if(num3==0){
                     num3=num;
                     num=0;
                     break;
                 }
                 
                 //abajo;
                 
                if(par== 's' || par== 'S'){ 
                if(num==0){
                    num=num3;
                    num3=0;
                     break;
                 }
                if(num8==0){
                    num8=num2;
                    num2=0;
                    break;
                }
                if(num7==0){
                    num7=num1;
                    num7=0;
                    break;
                }
                if(num4==0){
                    num4=num7;
                    num7=0;
                    break;
                }
                if(num5==0){
                    num5=num8;
                    num8=0;
                    break;
                }
                if(num6==0){
                    num6=num;
                    num=0;
                    break;
                }
                if(num1==0){
                num1=num4;
                num4=0;
                break;
                }
                 if(num2==0){
                 num2=num5;
                 num5=0;
                 break;
                }
                 if(num3==0){
                     num3=num6;
                     num6=0;
                     break;
                 }
                 
                 
                 //derecha///////////////////////////////////////////////////////////////////////////////////////////////////////////
                 
               if(par== 'a' || par=='A'){
                if(num==0){
             num=num7;
         num7=0;
         break;
                 }
                if(num8==0){
                    num8=num;
                    num=0;
                    break;
                }
                if(num7==0){
                    num7=num8;
                    num8=0;
                    break;
                }
                
                if(num4==0){
                    num4=num5;
                    num5=0;
                    break;
                }
                if(num5==0){
                    num5=num6;
                    num6=0; 
                    break;
                }
                if(num6==0){
                    num6=num4;
                    num4=0;
                    break;
                }
                if(num1==0){
                    num1=num2;
                    num2=0;
                    break;
                }
                if(num2==0){
                    num2=num3;
                    num3=0;
                    break;
                }
                if(num3==0){
                    num3=num1;
                    num1=0;
                    break;
                }
                
                
                
                //izquierda/////////////////////////////////////////////////////////////////////////////////////////////////////////
                
                if(par== 'D' || par=='a'){
                if(num==0){
             num=num8;
         num8=0;
         break;
                 }
                if(num8==0){
                    num8=num7;
                    num7=0;
                    break;
                }
                if(num7==0){
                    num7=num;
                    num=0;
                    break;
                }
                
                if(num4==0){
                    num4=num6;
                    num6=0;
                    break;
                }
                if(num5==0){
                    num5=num4;
                    num4=0;
                    break;
                }
                if(num6==0){
                    num6=num5;
                    num5=0;
                    break;
                }
                if(num1==0){
                    num1=num3;
                    num3=0;
                    break;
                }
                if(num2==0){
                    num2=num1;
                    num1=0;
                    break;
                }
                if(num3==0){
                    num3=num2;
                    num2=0;
                    break;
                }
                 if(num1==1 && num2==2 && num3==3 && num4==4 && num5==5 && num6==6 && num7==7 && num8==8 && num==0){
                            System.out.print("Ganador"); 
                            break;                               
        }
                 
    }
}         
    
    