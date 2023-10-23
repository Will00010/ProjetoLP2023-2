package bean;
// Generated 16/09/2023 15:19:00 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * UsuariosCwmo generated by hbm2java
 */
@Entity
@Table(name="usuarios_cwmo"
    ,catalog="test"
// , catalgo="carlos_oliveira"     
)
public class UsuariosCwmo  implements java.io.Serializable {


     private int idusuariosCwmo;
     private String nomeCwmo;
     private String apelidoCwmo;
     private String cpfCwmo;
     private Date dataNascimentoCwmo;
     private String senhaCwmo;
     private int nivelCwmo;
     private String ativoCwmo;


    public UsuariosCwmo() {
    }

	
    public UsuariosCwmo(int idusuariosCwmo, String nomeCwmo, String apelidoCwmo, String cpfCwmo, Date dataNascimentoCwmo, String senhaCwmo, int nivelCwmo, String ativoCwmo) {
        this.idusuariosCwmo = idusuariosCwmo;
        this.nomeCwmo = nomeCwmo;
        this.apelidoCwmo = apelidoCwmo;
        this.cpfCwmo = cpfCwmo;
        this.dataNascimentoCwmo = dataNascimentoCwmo;
        this.senhaCwmo = senhaCwmo;
        this.nivelCwmo = nivelCwmo;
        this.ativoCwmo = ativoCwmo;
    }
    public UsuariosCwmo(int idusuariosCwmo, String nomeCwmo, String apelidoCwmo, String cpfCwmo, Date dataNascimentoCwmo, String senhaCwmo, int nivelCwmo, String ativoCwmo, Set vendedorCwmos, Set clientesCwmos) {
       this.idusuariosCwmo = idusuariosCwmo;
       this.nomeCwmo = nomeCwmo;
       this.apelidoCwmo = apelidoCwmo;
       this.cpfCwmo = cpfCwmo;
       this.dataNascimentoCwmo = dataNascimentoCwmo;
       this.senhaCwmo = senhaCwmo;
       this.nivelCwmo = nivelCwmo;
       this.ativoCwmo = ativoCwmo;

    }
   
     @Id 

    
    @Column(name="idusuarios_cwmo", unique=true, nullable=false)
    public int getIdusuariosCwmo() {
        return this.idusuariosCwmo;
    }
    
    public void setIdusuariosCwmo(int idusuariosCwmo) {
        this.idusuariosCwmo = idusuariosCwmo;
    }

    
    @Column(name="nome_cwmo", nullable=false, length=50)
    public String getNomeCwmo() {
        return this.nomeCwmo;
    }
    
    public void setNomeCwmo(String nomeCwmo) {
        this.nomeCwmo = nomeCwmo;
    }

    
    @Column(name="apelido_cwmo", nullable=false, length=25)
    public String getApelidoCwmo() {
        return this.apelidoCwmo;
    }
    
    public void setApelidoCwmo(String apelidoCwmo) {
        this.apelidoCwmo = apelidoCwmo;
    }

    
    @Column(name="cpf_cwmo", nullable=false, length=14)
    public String getCpfCwmo() {
        return this.cpfCwmo;
    }
    
    public void setCpfCwmo(String cpfCwmo) {
        this.cpfCwmo = cpfCwmo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dataNascimento_cwmo", nullable=false, length=10)
    public Date getDataNascimentoCwmo() {
        return this.dataNascimentoCwmo;
    }
    
    public void setDataNascimentoCwmo(Date dataNascimentoCwmo) {
        this.dataNascimentoCwmo = dataNascimentoCwmo;
    }

    
    @Column(name="senha_cwmo", nullable=false, length=20)
    public String getSenhaCwmo() {
        return this.senhaCwmo;
    }
    
    public void setSenhaCwmo(String senhaCwmo) {
        this.senhaCwmo = senhaCwmo;
    }

    
    @Column(name="nivel_cwmo", nullable=false)
    public int getNivelCwmo() {
        return this.nivelCwmo;
    }
    
    public void setNivelCwmo(int nivelCwmo) {
        this.nivelCwmo = nivelCwmo;
    }

    
    @Column(name="ativo_cwmo", nullable=false, length=1)
    public String getAtivoCwmo() {
        return this.ativoCwmo;
    }
    
    public void setAtivoCwmo(String ativoCwmo) {
        this.ativoCwmo = ativoCwmo;
    }



}


