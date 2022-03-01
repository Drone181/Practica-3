package paquete;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Estudiante e1 = new Estudiante();
		e1.Alum("Alejandro Gordillo",1274253,"Circuitos Digitales",70.89f,"Aprobado");
		Estudiante e2 = new Estudiante();
		e2.Alum("Bryan Zavaleta",1271542,"Programacion Estructurada",80.50f,"Aprobado");
		Estudiante e3 = new Estudiante();
		e3.Alum("Luis Preciado",1278950,"Circuitos Electricos",59.99f,"Reprobado");
		Estudiante e4 = new Estudiante();
		e4.Alum("Oscar Aguilar",1276223,"Matemaricas Discretas",45.62f,"Reprobado");
		Estudiante e5 = new Estudiante();
		e5.Alum("Josue Aguirre",1278863,"POO",89.95f,"Aprobado");
		Estudiante e6 = new Estudiante();
		Estudiante e7 = new Estudiante();
		Estudiante e8 = new Estudiante();
		Estudiante e9 = new Estudiante();
		Estudiante e10 = new Estudiante();
		
		String nombre;
		float calif;
		boolean s = false;
		int m,o;
		
		while(!s) {
			m = Integer.parseInt(JOptionPane.showInputDialog("**Menu de Estudiantes**\n\n1.Capturar Alumno\n2.Mostrar Alumnos\n3.Salir\n\nIngrese opcion:"));
			switch(m) {
			case 1:
				o = Integer.parseInt(JOptionPane.showInputDialog("1.Alumno 6\n2.Alumno 7\n3.Alumno 8\n4.Alumno 9\n5.Alumno 10"));
				switch(o) {
				case 6:
					if(e6.disponibilidad==true) {
						JOptionPane.showMessageDialog(null,"Ya registrado");
					}
					else {
						nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
						e6.AsignarNombre(nombre);
						e6.Datos();
						calif = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
						e6.AsignarEstado(calif);
					}
					break;
				case 7:
					if(e7.disponibilidad==true) {
						JOptionPane.showMessageDialog(null,"Ya registrado");
					}
					else {
						nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
						e7.AsignarNombre(nombre);
						e7.Datos();
						calif = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
						e7.AsignarEstado(calif);
					}
					break;
				case 8:
					if(e8.disponibilidad==true) {
						JOptionPane.showMessageDialog(null,"Ya registrado");
					}
					else {
						nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
						e8.AsignarNombre(nombre);
						e8.Datos();
						calif = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
						e8.AsignarEstado(calif);
					}
					break;
				case 9:
					if(e9.disponibilidad==true) {
						JOptionPane.showMessageDialog(null,"Ya registrado");
					}
					else {
						nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
						e9.AsignarNombre(nombre);
						e9.Datos();
						calif = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
						e9.AsignarEstado(calif);
					}
					break;
				case 10:
					if(e10.disponibilidad==true) {
						JOptionPane.showMessageDialog(null,"Ya registrado");
					}
					else {
						nombre = JOptionPane.showInputDialog("Introduzca el nombre del alumno");
						e10.AsignarNombre(nombre);
						e10.Datos();
						calif = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la calificacion"));
						e10.AsignarEstado(calif);
					}
					break;
				}
				break;
			case 2:
				e1.Mostrar();
				e2.Mostrar();
				e3.Mostrar();
				e4.Mostrar();
				e5.Mostrar();
				e6.Mostrar();
				e7.Mostrar();
				e8.Mostrar();
				e9.Mostrar();
				e10.Mostrar();
				break;
			case 3:
				s = true;
				JOptionPane.showMessageDialog(null,"Hasta Pronto!");
				break;
				default:
					JOptionPane.showMessageDialog(null,"Opcion no valida");
					break;
			}
		}
		

	}

}
