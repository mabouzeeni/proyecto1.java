package com.company;


import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner lee = new Scanner(System.in);
        Scanner lee1 = new Scanner(System.in);
        Scanner lee2 = new Scanner(System.in);
        ArrayList<cliente> clientes = new ArrayList<cliente>();
        cliente usuario1 =new cliente();
        cliente usuario2 =new cliente();
        int i=-1, opcion=-1,opcion_sup;
        int prin,sec;
        String nombre, usuario_l,contra_l,aux_u;
        float monto_i,disponible,credito=0,comision,total_c=0;
        boolean condi=true,condi_sup=true,cond_f=true,condi_cre=true;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        System.out.println("Primer Usuario ");
        System.out.println();
        nombre = JOptionPane.showInputDialog("Primer Usuario \nEscriba su Nombre para Asignarle su usuario y password");

        usuario1.Nombre_U(nombre);
        System.out.println("Su nombre de usuario es : " + usuario1.usuario);
        System.out.println("Su password es : " + usuario1.contrasena);


        System.out.println();
        System.out.println();

        System.out.println("");
        System.out.println("");
        monto_i = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el monto inicial que va a depositar en esta cuenta \nRecuerde que su deposito debe ser mayor a  $1,500, ya que es lo minimo que puede estar en su cuenta")) ;

        System.out.println();
        System.out.println();
        while (condi) {
            if (monto_i<=1500) {
                monto_i = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el monto inicial que va a depositar en esta cuenta \nRecuerde que su deposito debe ser mayor a  $1,500, ya que es lo minimo que puede estar en su cuenta")) ;

                System.out.println();
                System.out.println();
            }else {
                condi = false;
            }}

        usuario1.setMonto_inicial(monto_i);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        clientes.add(usuario1);
        condi= true;
        monto_i=0;
        System.out.println("Segundo Usuario ");
        nombre = JOptionPane.showInputDialog("Segundo Usuario \nEscriba su Nombre para Asignarle su usuario y password");
        usuario2.Nombre_U(nombre);
        System.out.println("Su nombre de usuario es : " + usuario2.usuario);
        System.out.println("Su password es : " + usuario2.contrasena);

        System.out.println();
        System.out.println();

        monto_i = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el monto inicial que va a depositar en esta cuenta \nRecuerde que su deposito debe ser mayor a  $1,500, ya que es lo minimo que puede estar en su cuenta")) ;


        System.out.println();
        System.out.println();
        while (condi) {
            if (monto_i<=1500) {
                monto_i = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el monto inicial que va a depositar en esta cuenta \nRecuerde que su deposito debe ser mayor a  $1,500, ya que es lo minimo que puede estar en su cuenta")) ;

                System.out.println();
                System.out.println();
            }else {
                condi = false;
            }}

        usuario2.setMonto_inicial(monto_i);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        clientes.add(usuario2);

        while (condi_sup) {
            usuario_l = JOptionPane.showInputDialog("Introduzca su usuario :");
            contra_l =JOptionPane.showInputDialog("Introduzca su password :");

            System.out.println();

            System.out.println();
            System.out.println();

            condi = true;


            while (condi) {

                if ((usuario_l.equals(clientes.get(0).usuario))&& (contra_l.equals(clientes.get(0).contrasena))){

                    condi =false;
                    i=0;
                }else if ((usuario_l.equals(clientes.get(1).usuario))&& (contra_l.equals(clientes.get(1).contrasena))) {

                    condi =false;
                    i=1;
                }else {
                    System.out.println();
                    System.out.println();
                    JOptionPane.showMessageDialog(null, "Sus credenciales no coiciden , ingrese los datos nuevamente :");
                    System.out.print("Sus credenciales no coiciden , ingrese los datos nuevamente :");
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    usuario_l = JOptionPane.showInputDialog("Introduzca su usuario :");
                    contra_l =JOptionPane.showInputDialog("Introduzca su password :");
                    System.out.println();
                    System.out.println();

                }


            }
            //Entrando al sistema
            System.out.println("Bienvenido  " + clientes.get(i).usuario);
            System.out.println(dtf.format(LocalDateTime.now()));
            clientes.get(i).ingresos();
            System.out.println();
            System.out.println();
            System.out.println();
            if (clientes.get(i).getIngreso()==1) {
                System.out.println("Es la primera vez que entra debe cambiar su password");
                System.out.println("Introduzca su nueva password");
                System.out.println();
                System.out.println();
                contra_l =JOptionPane.showInputDialog("Introduzca nueva password: ");
                clientes.get(i).setContrasena(contra_l);
                System.out.println("Su nueva password es : "+  clientes.get(i).contrasena);
            }


            System.out.println();
            System.out.println();
            System.out.println();
            condi = true;
            while (condi) {
                System.out.println("Ingrese el numero de la opcion para acceder a su menu");
                System.out.println("1) estado de cuenta");
                System.out.println("2) Solicitar credito");
                System.out.println("3) Cambiar password");
                System.out.println("4) Salir");
                opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de la opcion para acceder a su menu\n1) estado de cuenta\n"
                        + "2) Solicitar credito\n3) Cambiar password\n4) Salir"));
                switch (opcion) {
                    case 1:
                        System.out.println();
                        System.out.println();
                        System.out.println("Su monto Incial es de :" +clientes.get(i).monto_inicial);
                        System.out.println();
                        System.out.println();
                        System.out.println("Su monto Final es de :" +clientes.get(i).monto_final);

                        JOptionPane.showMessageDialog(null, "Su monto Incial es de :" +clientes.get(i).monto_inicial+"\nSu monto Final es de :" +clientes.get(i).monto_final);
                        System.out.println();
                        System.out.println();
                        break;
                    case 2:
                        disponible=0;
                        prin =i;
                        if (prin==0) {
                            sec = 1;
                        }else {
                            sec=0;
                        }
                        for (double j = 0.90; j > 0; j-=0.01) {
                            if (((clientes.get(sec).monto_final)-(clientes.get(sec).monto_final*j))<1500) {

                            }else {
                                disponible =(float)(clientes.get(sec).monto_final*j);

                                break;
                            }
                        }

                        while (condi_cre) {
                            System.out.println("Introduzca por cuanto quiere hacer el credito");
                            credito =Float.parseFloat(JOptionPane.showInputDialog("Introduzca por cuanto quiere hacer el credito: "));
                            comision = (float)(credito*0.30);
                            total_c = credito +comision;

                            if(total_c >disponible) {

                                System.out.println("No se puede realizar este credito");
                                System.out.println("Ya que banco siempre hara una comision del 30% del valor prestado");
                                JOptionPane.showMessageDialog(null, "No se puede realizar este credito\nYa que banco siempre hara una comision del 30% del valor prestado");
                            }else {
                                condi_cre=false;
                            }
                        }
                        condi_cre=true;
                        clientes.get(sec).setMonto_final(((clientes.get(sec).monto_final)-total_c));
                        clientes.get(prin).setMonto_final(((clientes.get(prin).monto_final)+credito));
                        JOptionPane.showMessageDialog(null, "Su saldo ahora es de "+clientes.get(prin).getMonto_final());

                        System.out.println();
                        System.out.println();

                        break;
                    case 3:

                        System.out.println();
                        System.out.println();

                        contra_l =JOptionPane.showInputDialog("Introduzca su nuevo password: ");
                        clientes.get(i).setContrasena(contra_l);
                        System.out.println();
                        System.out.println("Su nueva password es : "+  clientes.get(i).contrasena);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println();
                        System.out.println();
                        System.out.println("Gracias por su visita");
                        System.out.println(dtf.format(LocalDateTime.now()));
                        JOptionPane.showMessageDialog(null, "Gracias por su visita\n"+dtf.format(LocalDateTime.now()));

                        condi = false;
                        break;

                    default:
                        System.out.println();
                        System.out.println();
                        JOptionPane.showMessageDialog(null, "La opcion introducida no es valida");
                        break;
                }

            }
            while (cond_f) {
                System.out.println();
                System.out.println();
                System.out.println("Si desea entrar de nuevo al sistema ingrese (1)");
                System.out.println("Si quiere salir del sistema ingrese (0)");
                opcion_sup=Integer.parseInt(JOptionPane.showInputDialog("Si desea entrar de nuevo al sistema ingrese (1)\nSi quiere salir del sistema ingrese (0)"));
                if (opcion_sup== 1) {
                    cond_f =false;
                }else if (opcion_sup== 0) {
                    cond_f =false;
                    condi_sup =false;
                }else {
                    System.out.println("La opcion no es valida , ingrese 1 o 0");
                    JOptionPane.showMessageDialog(null, "La opcion no es valida , ingrese 1 o 0");

                }

            }

            cond_f =true;

        }




    }

}







