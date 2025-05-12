public class UserInfo {
    private String tipoCarro;
    private String perfil;

    public UserInfo(String tipoCarro, String perfil) {
        this.tipoCarro = tipoCarro;
        this.perfil = perfil;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
