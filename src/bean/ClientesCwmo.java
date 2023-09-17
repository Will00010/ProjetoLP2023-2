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
 * ClientesCwmo generated by hbm2java
 */
@Entity
@Table(name="clientes_cwmo"
    ,catalog="test"
)
public class ClientesCwmo  implements java.io.Serializable {


     private int idClienteCwmo;
     private UsuariosCwmo usuariosCwmo;
     private String emailCwmo;
     private String telefoneCwmo;
     private String sexoCwmo;
     private String interessesCwmo;
     private String rgCwmo;
     private String paisCwmo;
     private String estadoCwmo;
     private String cidadeCwmo;
     private String bairroCwmo;
     private String cepCwmo;
     private String numeroCwmo;
     private String complementoCwmo;
     private String ruaCwmo;
     private String clientesCwmo;


    public ClientesCwmo() {
    }

	
    public ClientesCwmo(int idClienteCwmo, UsuariosCwmo usuariosCwmo, String emailCwmo, String telefoneCwmo, String sexoCwmo, String interessesCwmo, String rgCwmo, String paisCwmo, String estadoCwmo, String cidadeCwmo, String bairroCwmo, String cepCwmo, String numeroCwmo, String complementoCwmo, String ruaCwmo, String clientesCwmo) {
        this.idClienteCwmo = idClienteCwmo;
        this.usuariosCwmo = usuariosCwmo;
        this.emailCwmo = emailCwmo;
        this.telefoneCwmo = telefoneCwmo;
        this.sexoCwmo = sexoCwmo;
        this.interessesCwmo = interessesCwmo;
        this.rgCwmo = rgCwmo;
        this.paisCwmo = paisCwmo;
        this.estadoCwmo = estadoCwmo;
        this.cidadeCwmo = cidadeCwmo;
        this.bairroCwmo = bairroCwmo;
        this.cepCwmo = cepCwmo;
        this.numeroCwmo = numeroCwmo;
        this.complementoCwmo = complementoCwmo;
        this.ruaCwmo = ruaCwmo;
        this.clientesCwmo = clientesCwmo;
    }
    public ClientesCwmo(int idClienteCwmo, UsuariosCwmo usuariosCwmo, String emailCwmo, String telefoneCwmo, String sexoCwmo, String interessesCwmo, String rgCwmo, String paisCwmo, String estadoCwmo, String cidadeCwmo, String bairroCwmo, String cepCwmo, String numeroCwmo, String complementoCwmo, String ruaCwmo, String clientesCwmo, Set vendasCwmos) {
       this.idClienteCwmo = idClienteCwmo;
       this.usuariosCwmo = usuariosCwmo;
       this.emailCwmo = emailCwmo;
       this.telefoneCwmo = telefoneCwmo;
       this.sexoCwmo = sexoCwmo;
       this.interessesCwmo = interessesCwmo;
       this.rgCwmo = rgCwmo;
       this.paisCwmo = paisCwmo;
       this.estadoCwmo = estadoCwmo;
       this.cidadeCwmo = cidadeCwmo;
       this.bairroCwmo = bairroCwmo;
       this.cepCwmo = cepCwmo;
       this.numeroCwmo = numeroCwmo;
       this.complementoCwmo = complementoCwmo;
       this.ruaCwmo = ruaCwmo;
       this.clientesCwmo = clientesCwmo;

    }
   
     @Id 

    
    @Column(name="idCliente_cwmo", unique=true, nullable=false)
    public int getIdClienteCwmo() {
        return this.idClienteCwmo;
    }
    
    public void setIdClienteCwmo(int idClienteCwmo) {
        this.idClienteCwmo = idClienteCwmo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="fkUsuario_cwmo", nullable=false)
    public UsuariosCwmo getUsuariosCwmo() {
        return this.usuariosCwmo;
    }
    
    public void setUsuariosCwmo(UsuariosCwmo usuariosCwmo) {
        this.usuariosCwmo = usuariosCwmo;
    }

    
    @Column(name="email_cwmo", nullable=false, length=80)
    public String getEmailCwmo() {
        return this.emailCwmo;
    }
    
    public void setEmailCwmo(String emailCwmo) {
        this.emailCwmo = emailCwmo;
    }

    
    @Column(name="telefone_cwmo", nullable=false, length=13)
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

    
    @Column(name="interesses_cwmo", nullable=false, length=20)
    public String getInteressesCwmo() {
        return this.interessesCwmo;
    }
    
    public void setInteressesCwmo(String interessesCwmo) {
        this.interessesCwmo = interessesCwmo;
    }

    
    @Column(name="rg_cwmo", nullable=false, length=7)
    public String getRgCwmo() {
        return this.rgCwmo;
    }
    
    public void setRgCwmo(String rgCwmo) {
        this.rgCwmo = rgCwmo;
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

    
    @Column(name="bairro_cwmo", nullable=false, length=15)
    public String getBairroCwmo() {
        return this.bairroCwmo;
    }
    
    public void setBairroCwmo(String bairroCwmo) {
        this.bairroCwmo = bairroCwmo;
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

    
    @Column(name="clientes_cwmo", nullable=false, length=45)
    public String getClientesCwmo() {
        return this.clientesCwmo;
    }
    
    public void setClientesCwmo(String clientesCwmo) {
        this.clientesCwmo = clientesCwmo;
    }

}


