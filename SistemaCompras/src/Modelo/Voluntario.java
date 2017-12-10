package Modelo;

public class Voluntario {
    
    private String px;
    private String p_nome;
    private String p_cor;
    private String p_preco;
    
    
    public Voluntario () {
        //Garantir que não tenha lixo na memória
        this.px=null;
        this.p_nome=null;
        this.p_cor=null;
        this.p_preco=null;
        
        
    }
    
    public Voluntario(String px,String p_nome, String p_cor, String p_preco) {
        this.px=px;
        this.p_nome=p_nome;
        this.p_cor=p_cor;
        this.p_preco=p_preco;        
    }
    
    public Voluntario(String px) {
        this.px=px;
    }
    
   public String getPX() {
       return px;
   }
   
   public String getP_Nome() {
       return p_nome;
   }
   
   public String getP_Cor() {
       return p_cor;
   }
   
   public String getP_Preco() {
       return p_preco;
   }

   public void setPX(String px) {
       this.px=px;
   }
   
   public void setP_Nome(String p_nome) {
       this.p_nome=p_nome;
   }
   
   public void setP_Cor(String p_cor) {
       this.p_cor=p_cor;
   }
   
   public void setP_Preco(String p_preco) {
       this.p_preco=p_preco;
   }




}
