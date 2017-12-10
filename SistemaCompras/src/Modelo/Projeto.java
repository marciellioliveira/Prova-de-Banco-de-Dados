package Modelo;

public class Projeto {
    
    private String cnpj;
    private String local;
    private String fundador;
    private String email;
    private String senha;
    
    public Projeto() {
        this.cnpj=null;
        this.local=null;
        this.fundador=null;
        this.email=null;
        this.senha=null;
    }
    
    public Projeto(String cnpj, String loc, String fund, String em, String se) {
        this.cnpj=cnpj;
        this.local=loc;
        this.fundador=fund;
        this.email=em;
        this.senha=se;
    }
    
    public Projeto(String em) {
        this.email=em;
    }

    public Projeto(String em, String cnpj, String loc, String fund) {
        this.email=em;
        this.cnpj=cnpj;
        this.local=loc;
        this.fundador=fund;
    }
   
    
    public String getCNPJ() {
        return cnpj;
    }
    
    public String getLocal() {
        return local;
    }
    
    public String getFundador() {
        return fundador;
    }
    
    public String getEmail() {
        return email;
    }
    
    public String getSenha() {
        return senha;
    }
    
    public void setCNPJ() {
        this.cnpj=cnpj;
    }
    
    public void setLocal() {
        this.local=local;
    }
    
    public void setFundador() {
        this.fundador=fundador;
    }
    
    public void setEmail() {
        this.email=email;
    }
    
    public void setSenha() {
        this.senha=senha;
    }
}
