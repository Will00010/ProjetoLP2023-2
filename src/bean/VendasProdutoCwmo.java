package bean;
// Generated 16/09/2023 15:19:00 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VendasProdutoCwmo generated by hbm2java
 */
@Entity
@Table(name="vendas_produto_cwmo"
    ,catalog="test"
//   , catalog="db_carlos_oliveira"       
)
public class VendasProdutoCwmo  implements java.io.Serializable {


     private int idvendasProdutoCwmo;
     private GuitarraCwmo guitarraCwmo;
     private VendasCwmo vendasCwmo;
     private int quantidadeCwmo;
     private double valorunitarioCwmo;

    public VendasProdutoCwmo() {
    }

    public VendasProdutoCwmo(int idvendasProdutoCwmo, GuitarraCwmo guitarraCwmo, VendasCwmo vendasCwmo, int quantidadeCwmo, double valorunitarioCwmo) {
       this.idvendasProdutoCwmo = idvendasProdutoCwmo;
       this.guitarraCwmo = guitarraCwmo;
       this.vendasCwmo = vendasCwmo;
       this.quantidadeCwmo = quantidadeCwmo;
       this.valorunitarioCwmo = valorunitarioCwmo;
    }
   
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="idvendas_produto_cwmo", unique=true, nullable=false)
public int getIdvendasProdutoCwmo() {
    return this.idvendasProdutoCwmo;
}
    
    public void setIdvendasProdutoCwmo(int idvendasProdutoCwmo) {
        this.idvendasProdutoCwmo = idvendasProdutoCwmo;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fkprodutos_cwmo", nullable=false)
    public GuitarraCwmo getGuitarraCwmo() {
        return this.guitarraCwmo;
    }
    
    public void setGuitarraCwmo(GuitarraCwmo guitarraCwmo) {
        this.guitarraCwmo = guitarraCwmo;
    }

@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="fkvendas_cwmo", nullable=false)
    public VendasCwmo getVendasCwmo() {
        return this.vendasCwmo;
    }
    
    public void setVendasCwmo(VendasCwmo vendasCwmo) {
        this.vendasCwmo = vendasCwmo;
    }

    
    @Column(name="quantidade_cwmo", nullable=false)
    public int getQuantidadeCwmo() {
        return this.quantidadeCwmo;
    }
    
    public void setQuantidadeCwmo(int quantidadeCwmo) {
        this.quantidadeCwmo = quantidadeCwmo;
    }

    
    @Column(name="valorunitario_cwmo", nullable=false, precision=5)
    public double getValorunitarioCwmo() {
        return this.valorunitarioCwmo;
    }
    
    public void setValorunitarioCwmo(double valorunitarioCwmo) {
        this.valorunitarioCwmo = valorunitarioCwmo;
    }




}


