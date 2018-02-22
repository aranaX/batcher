package org.bureau.batch.reader;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

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
	private Date fechaDePublicacion;
	private String mesDePublicacion;	
	private String anioDePublicacion;	
	private Date fechaDeUltimaAdjudicacion;	
	private Date fechaDeAdjudicacion;
	private String mesDeAdjudicacion;
	private String anioDeAdjudicacion;
	private String categorias;
	private String estatusDelConcurso;
	
	public ConcursoDTO() {
		super();
	}
	

	public String getMesDePublicacion() {
		return mesDePublicacion;
	}


	public void setMesDePublicacion(String mesDePublicacion) {
		this.mesDePublicacion = mesDePublicacion;
	}


	public String getAnioDePublicacion() {
		return anioDePublicacion;
	}


	public void setAnioDePublicacion(String anioDePublicacion) {
		this.anioDePublicacion = anioDePublicacion;
	}


	public String getMesDeAdjudicacion() {
		return mesDeAdjudicacion;
	}

	public void setMesDeAdjudicacion(String mesDeAdjudicacion) {
		this.mesDeAdjudicacion = mesDeAdjudicacion;
	}


	public String getAnioDeAdjudicacion() {
		return anioDeAdjudicacion;
	}

	public void setAnioDeAdjudicacion(String anioDeAdjudicacion) {
		this.anioDeAdjudicacion = anioDeAdjudicacion;
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
	public void setFechaDePublicacion(Date fechaDePublicacion) {
		this.fechaDePublicacion = fechaDePublicacion;
	}
	
	public void setFechaDeUltimaAdjudicacion(Date fechaDeUltimaAdjudicacion) {
		this.fechaDeUltimaAdjudicacion = fechaDeUltimaAdjudicacion;
	}
	public void setFechaDeAdjudicacion(Date fechaDeAdjudicacion) {
		this.fechaDeAdjudicacion = fechaDeAdjudicacion;
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
	public Date getFechaDePublicacion() {
		return fechaDePublicacion;
	}
	
	public Date getFechaDeUltimaAdjudicacion() {
		return fechaDeUltimaAdjudicacion;
	}
	public Date getFechaDeAdjudicacion() {
		return fechaDeAdjudicacion;
	}
	
	public String getCategorias() {
		return categorias;
	}
	public String getEstatusDelConcurso() {
		return estatusDelConcurso;
	}
	
}
