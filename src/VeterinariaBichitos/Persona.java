package VeterinariaBichitos;

import java.util.Objects;

public class Persona {

	private String apellido;
	private String nombre;
	private String documento;
	public Persona(String apellido, String nombre, String documento) {
		this.apellido = apellido;
		this.nombre = nombre;
		this.documento = documento;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	@Override
	public int hashCode() {
		return Objects.hash(documento);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(documento, other.documento);
	}
	@Override
	public String toString() {
		return "Persona [apellido=" + apellido + ", nombre=" + nombre + ", documento=" + documento + "]";
	}
	
	
	
}
