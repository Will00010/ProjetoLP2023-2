package bean;
// Generated 16/09/2023 15:19:00 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * VendedorCwmo generated by hbm2java
 */
@Entity
@Table(name="vendedor_cwmo"
    ,catalog="test"
)
public class VendedorCwmo  implements java.io.Serializable {


     private int idvendedorCwmo;
     private UsuariosCwmo usuariosCwmo;
     private String telefoneCwmo;
     private String sexoCwmo;
     private String paisCwmo;
     private String estadoCwmo;
     private String cidadeCwmo;
     private String cepCwmo;
     private String numeroCwmo;
     private String complementoCwmo;
     private String ruaCwmo;

    public VendedorCwmo() {
    }

	
    public VendedorCwmo(int idvendedorCwmo, UsuariosCwmo usuariosCwmo, String telefoneCwmo, String sexoCwmo, String paisCwmo, String estadoCwmo, String cidadeCwmo, String cepCwmo, String numeroCwmo, String complementoCwmo, String ruaCwmo) {
        this.idvendedorCwmo = idvendedorCwmo;
        this.usuariosCwmo = usuariosCwmo;
        this.telefoneCwmo = telefoneCwmo;
        this.sexoCwmo = sexoCwmo;
        this.paisCwmo = paisCwmo;
        this.estadoCwmo = estadoCwmo;
        this.cidadeCwmo = cidadeCwmo;
        this.cepCwmo = cepCwmo;
        this.numeroCwmo = numeroCwmo;
        this.complementoCwmo = complementoCwmo;
        this.ruaCwmo = ruaCwmo;
    }
    public VendedorCwmo(int idvendedorCwmo, UsuariosCwmo usuariosCwmo, String telefoneCwmo, String sexoCwmo, String paisCwmo, String estadoCwmo, String cidadeCwmo, String cepCwmo, String numeroCwmo, String complementoCwmo, String ruaCwmo, Set vendasCwmos) {
       this.idvendedorCwmo = idvendedorCwmo;
       this.usuariosCwmo = usuariosCwmo;
       this.telefoneCwmo = telefoneCwmo;
       this.sexoCwmo = sexoCwmo;
       this.paisCwmo = paisCwmo;
       this.estadoCwmo = estadoCwmo;
       this.cidadeCwmo = cidadeCwmo;
       this.cepCwmo = cepCwmo;
       this.numeroCwmo = numeroCwmo;
       this.complementoCwmo = complementoCwmo;
       this.ruaCwmo = ruaCwmo;

    }
   
     @Id 

    
    @Column(name="idvendedor_cwmo", unique=true, nullable=false)
    public int getIdvendedorCwmo() {
        return this.idvendedorCwmo;
    }
    
    public void setIdvendedorCwmo(int idvendedorCwmo) {
        this.idvendedorCwmo = idvendedorCwmo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkusuarios_cwmo", nullable=false)
    public UsuariosCwmo getUsuariosCwmo() {
        return this.usuariosCwmo;
    }
    
    public void setUsuariosCwmo(UsuariosCwmo usuariosCwmo) {
        this.usuariosCwmo = usuariosCwmo;
    }

    
    @Column(name="telefone_cwmo", nullable=false, length=45)
    public String getTelefoneCwmo() {
        return this.telefoneCwmo;
    }
    
    public void setTelefoneCwmo(String telefoneCwmo) {
        this.telefoneCwmo = telefoneCwmo;
    }

    
    @Column(name="sexo_cwmo", nullable=false, length=1)
    public String getSexoCwmo() {
        return this.sexoCwmo;
    }
    
    public void setSexoCwmo(String sexoCwmo) {
        this.sexoCwmo = sexoCwmo;
    }

    
    @Column(name="pais_cwmo", nullable=false, length=2)
    public String getPaisCwmo() {
        return this.paisCwmo;
    }
    
    public void setPaisCwmo(String paisCwmo) {
        this.paisCwmo = paisCwmo;
    }

    
    @Column(name="estado_cwmo", nullable=false, length=2)
    public String getEstadoCwmo() {
        return this.estadoCwmo;
    }
    
    public void setEstadoCwmo(String estadoCwmo) {
        this.estadoCwmo = estadoCwmo;
    }

    
    @Column(name="cidade_cwmo", nullable=false, length=15)
    public String getCidadeCwmo() {
        return this.cidadeCwmo;
    }
    
    public void setCidadeCwmo(String cidadeCwmo) {
        this.cidadeCwmo = cidadeCwmo;
    }

    
    @Column(name="cep_cwmo", nullable=false, length=9)
    public String getCepCwmo() {
        return this.cepCwmo;
    }
    
    public void setCepCwmo(String cepCwmo) {
        this.cepCwmo = cepCwmo;
    }

    
    @Column(name="numero_cwmo", nullable=false, length=10)
    public String getNumeroCwmo() {
        return this.numeroCwmo;
    }
    
    public void setNumeroCwmo(String numeroCwmo) {
        this.numeroCwmo = numeroCwmo;
    }

    
    @Column(name="complemento_cwmo", nullable=false, length=50)
    public String getComplementoCwmo() {
        return this.complementoCwmo;
    }
    
    public void setComplementoCwmo(String complementoCwmo) {
        this.complementoCwmo = complementoCwmo;
    }

    
    @Column(name="rua_cwmo", nullable=false, length=25)
    public String getRuaCwmo() {
        return this.ruaCwmo;
    }
    
    public void setRuaCwmo(String ruaCwmo) {
        this.ruaCwmo = ruaCwmo;
    }

}

