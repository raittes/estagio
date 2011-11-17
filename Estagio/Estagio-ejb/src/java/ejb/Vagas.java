/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author raittes
 */
@Entity
@Table(name = "VAGAS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vagas.findAll", query = "SELECT v FROM Vagas v"),
    @NamedQuery(name = "Vagas.findById", query = "SELECT v FROM Vagas v WHERE v.id = :id"),
    @NamedQuery(name = "Vagas.findByEmpresa", query = "SELECT v FROM Vagas v WHERE v.empresa = :empresa"),
    @NamedQuery(name = "Vagas.findByCidade", query = "SELECT v FROM Vagas v WHERE v.cidade = :cidade"),
    @NamedQuery(name = "Vagas.findByCurso", query = "SELECT v FROM Vagas v WHERE v.curso = :curso"),
    @NamedQuery(name = "Vagas.findByDescricao", query = "SELECT v FROM Vagas v WHERE v.descricao = :descricao"),
    @NamedQuery(name = "Vagas.findBySalario", query = "SELECT v FROM Vagas v WHERE v.salario = :salario"),
    @NamedQuery(name = "Vagas.findByEmail", query = "SELECT v FROM Vagas v WHERE v.email = :email"),
    @NamedQuery(name = "Vagas.findByTelefone", query = "SELECT v FROM Vagas v WHERE v.telefone = :telefone"),
    @NamedQuery(name = "Vagas.findByIdfuncionario", query = "SELECT v FROM Vagas v WHERE v.idfuncionario = :idfuncionario")})

public class Vagas implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)    
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Size(max = 40)
    @Column(name = "EMPRESA")
    private String empresa;
    @Size(max = 20)
    @Column(name = "CIDADE")
    private String cidade;
    @Size(max = 20)
    @Column(name = "CURSO")
    private String curso;
    @Size(max = 60)
    @Column(name = "DESCRICAO")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SALARIO")
    private Double salario;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 20)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "TELEFONE")
    private Integer telefone;
    @Column(name = "IDFUNCIONARIO")
    private Integer idfuncionario;

    public Vagas() {
    }

    public Vagas(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTelefone() {
        return telefone;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    public Integer getIdfuncionario() {
        return idfuncionario;
    }

    public void setIdfuncionario(Integer idfuncionario) {
        this.idfuncionario = idfuncionario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vagas)) {
            return false;
        }
        Vagas other = (Vagas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Vagas[ id=" + id + " ]";
    }
    
}
