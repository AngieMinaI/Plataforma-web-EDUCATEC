/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author angic
 */
@Entity
@Table(name = "curso")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
    , @NamedQuery(name = "Curso.findByIDCurso", query = "SELECT c FROM Curso c WHERE c.iDCurso = :iDCurso")
    , @NamedQuery(name = "Curso.findByNombre", query = "SELECT c FROM Curso c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Curso.findByDuraci\u00f3n", query = "SELECT c FROM Curso c WHERE c.duraci\u00f3n = :duraci\u00f3n")
    , @NamedQuery(name = "Curso.findByCategoria", query = "SELECT c FROM Curso c WHERE c.categoria = :categoria")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(name = "IDCurso")
    private String iDCurso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "Duraci\u00f3n")
    private String duración;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "Categoria")
    private String categoria;

    public Curso() {
    }

    public Curso(String iDCurso) {
        this.iDCurso = iDCurso;
    }

    public Curso(String iDCurso, String nombre, String duración, String categoria) {
        this.iDCurso = iDCurso;
        this.nombre = nombre;
        this.duración = duración;
        this.categoria = categoria;
    }

    public String getIDCurso() {
        return iDCurso;
    }

    public void setIDCurso(String iDCurso) {
        this.iDCurso = iDCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuración() {
        return duración;
    }

    public void setDuración(String duración) {
        this.duración = duración;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCurso != null ? iDCurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.iDCurso == null && other.iDCurso != null) || (this.iDCurso != null && !this.iDCurso.equals(other.iDCurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Curso[ iDCurso=" + iDCurso + " ]";
    }
    
}
