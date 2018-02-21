package org.bureau.batch.reader;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ConcursoDTO {
	private long no;
	private String tipoDeEntidadPadre;
	private String tipoDeEntidad;
	private String entidadCompradora;
	private String unidadCompradora;
	private long nogConcurso;
	private String descripcion;
	private String modalidad;
	private String subModalidad;
	private String nit;
	private String nombre;
	private BigDecimal monto;
	private LocalDate fechaDePublicacion;
	private int mesDePublicacion;
	private int anioDePublicacion;
	private LocalDate fechaDeUltimaAdjudicacion;
	private LocalDate fechaDeAdjudicacion;
	private int mesDeAdjudicacion;
	private int anioDeAdjudicacion;
	private String categorias;
	private String estatusDelConcurso;
	
	public ConcursoDTO() {
		super();
	}
	

	public void setNo(long no) {
		this.no = no;
	}
	public void setTipoDeEntidadPadre(String tipoDeEntidadPadre) {
		this.tipoDeEntidadPadre = tipoDeEntidadPadre;
	}
	public void setTipoDeEntidad(String tipoDeEntidad) {
		this.tipoDeEntidad = tipoDeEntidad;
	}
	public void setEntidadCompradora(String entidadCompradora) {
		this.entidadCompradora = entidadCompradora;
	}
	public void setUnidadCompradora(String unidadCompradora) {
		this.unidadCompradora = unidadCompradora;
	}
	public void setNogConcurso(long nogConcurso) {
		this.nogConcurso = nogConcurso;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}
	public void setSubModalidad(String subModalidad) {
		this.subModalidad = subModalidad;
	}
	public void setNit(String nit) {
		this.nit = nit;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}
	public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}
	public void setMesDePublicacion(int mesDePublicacion) {
		this.mesDePublicacion = mesDePublicacion;
	}
	public void setAnioDePublicacion(int anioDePublicacion) {
		this.anioDePublicacion = anioDePublicacion;
	}
	public void setFechaDeUltimaAdjudicacion(LocalDate fechaDeUltimaAdjudicacion) {
		this.fechaDeUltimaAdjudicacion = fechaDeUltimaAdjudicacion;
	}
	public void setFechaDeAdjudicacion(LocalDate fechaDeAdjudicacion) {
		this.fechaDeAdjudicacion = fechaDeAdjudicacion;
	}
	public void setMesDeAdjudicacion(int mesDeAdjudicacion) {
		this.mesDeAdjudicacion = mesDeAdjudicacion;
	}
	public void setAnioDeAdjudicacion(int anioDeAdjudicacion) {
		this.anioDeAdjudicacion = anioDeAdjudicacion;
	}
	public void setCategorias(String categorias) {
		this.categorias = categorias;
	}
	public void setEstatusDelConcurso(String estatusDelConcurso) {
		this.estatusDelConcurso = estatusDelConcurso;
	}
	
	public long getNo() {
		return no;
	}
	public String getTipoDeEntidadPadre() {
		return tipoDeEntidadPadre;
	}
	public String getTipoDeEntidad() {
		return tipoDeEntidad;
	}
	public String getEntidadCompradora() {
		return entidadCompradora;
	}
	public String getUnidadCompradora() {
		return unidadCompradora;
	}
	public long getNogConcurso() {
		return nogConcurso;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public String getModalidad() {
		return modalidad;
	}
	public String getSubModalidad() {
		return subModalidad;
	}
	public String getNit() {
		return nit;
	}
	public String getNombre() {
		return nombre;
	}
	public BigDecimal getMonto() {
		return monto;
	}
	public LocalDate getFechaDePublicacion() {
		return fechaDePublicacion;
	}
	public int getMesDePublicacion() {
		return mesDePublicacion;
	}
	public int getAnioDePublicacion() {
		return anioDePublicacion;
	}
	public LocalDate getFechaDeUltimaAdjudicacion() {
		return fechaDeUltimaAdjudicacion;
	}
	public LocalDate getFechaDeAdjudicacion() {
		return fechaDeAdjudicacion;
	}
	public int getMesDeAdjudicacion() {
		return mesDeAdjudicacion;
	}
	public int getAnioDeAdjudicacion() {
		return anioDeAdjudicacion;
	}
	public String getCategorias() {
		return categorias;
	}
	public String getEstatusDelConcurso() {
		return estatusDelConcurso;
	}
	
}
