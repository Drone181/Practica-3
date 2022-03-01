package paquete;

import javax.swing.JOptionPane;

public class Estudiante {
	String nombre;
	int matricula;
	String materia;
	float calif;
	String estado;
	boolean disponibilidad = false;
	
	public Estudiante() {
		this.nombre = "Vacio";
		this.materia = "Vacio";
		this.estado = "Vacio";
	}
	
	public void Alum(String nombre,int matricula,String materia,float calif,String estado) {
		this.nombre = nombre;
		this.matricula = matricula;
		this.materia = materia;
		this.calif = calif;
		this.estado = estado;
	}
	
	public void AsignarNombre(String nombre) {
		this.nombre = nombre;
		this.disponibilidad = true;
	}
	
	public void Datos() {
		matricula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la matricula"));
		materia = JOptionPane.showInputDialog("Ingrese la materia");
	}
	
	public void AsignarEstado(float calif) {
		this.calif = calif;
		if(calif>=60) {
			this.estado = "Aprobado";
		}
		else {
			this.estado = "Reprobado";
		}
	}
	public void Mostrar() {
		JOptionPane.showMessageDialog(null,nombre+"\n"+matricula+"\n"+materia+"\n"+calif+"\n"+estado);
	}

}
