package VeterinariaBichitos;

import java.util.Objects;

public class Mascota {

	private int numeroRegistro;
	private String nombre;
	private Raza raza;
	private int anioNacimiento;
	private Persona DuenioAmoResponsable;
	private int anios;
	public Mascota(int numeroRegistro, String nombre, Raza raza, int anioNacimiento, Persona duenioAmoResponsable) {
		this.numeroRegistro = numeroRegistro;
		this.nombre = nombre;
		this.raza = raza;
		this.anioNacimiento = anioNacimiento;
		this.DuenioAmoResponsable = duenioAmoResponsable;
	}
	public int getNumeroRegistro() {
		return numeroRegistro;
	}
	public void setNumeroRegistro(int numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Raza getRaza() {
		return raza;
	}
	public void setRaza(Raza raza) {
		this.raza = raza;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	public Persona getDuenioAmoResponsable() {
		return DuenioAmoResponsable;
	}
	public void setDuenioAmoResponsable(Persona duenioAmoResponsable) {
		DuenioAmoResponsable = duenioAmoResponsable;
	}
	public int getAnios() {
		return 2021 - this.getAnioNacimiento();
	}
	@Override
	public int hashCode() {
		return Objects.hash(numeroRegistro);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mascota other = (Mascota) obj;
		return numeroRegistro == other.numeroRegistro;
	}
	@Override
	public String toString() {
		return "Mascota [numeroRegistro=" + numeroRegistro + ", nombre=" + nombre + ", raza=" + raza
				+ ", anioNacimiento=" + anioNacimiento + ", DuenioAmoResponsable=" + DuenioAmoResponsable + ", anios="
				+ anios + "]";
	}
	
	
	
	

	
	
	
	

}
