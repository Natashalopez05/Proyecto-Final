package entities;

import java.util.Date;
import java.util.List;

public class URL {

    private long id;
    private String url;
    private String shortUrl;
    private Date date;
    //imagen (vista previa)

    //estadisticas
    private int visitas;
    private List<String> navegadores;
    private List<String> sistemasOperativos;
    private List<String> direccionesIp;
    private List<String> dominios;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }

    public List<String> getNavegadores() {
        return navegadores;
    }

    public void setNavegadores(List<String> navegadores) {
        this.navegadores = navegadores;
    }

    public List<String> getSistemasOperativos() {
        return sistemasOperativos;
    }

    public void setSistemasOperativos(List<String> sistemasOperativos) {
        this.sistemasOperativos = sistemasOperativos;
    }

    public List<String> getDireccionesIp() {
        return direccionesIp;
    }

    public void setDireccionesIp(List<String> direccionesIp) {
        this.direccionesIp = direccionesIp;
    }

    public List<String> getDominios() {
        return dominios;
    }

    public void setDominios(List<String> dominios) {
        this.dominios = dominios;
    }

    public String toString() {
        return "URL{" +
                "id=" + id +
                ", url='" + url + '\'' +
                ", shortUrl='" + shortUrl + '\'' +
                ", date=" + date +
                ", visitas=" + visitas +
                ", navegadores=" + navegadores +
                ", sistemasOperativos=" + sistemasOperativos +
                ", direccionesIp=" + direccionesIp +
                ", dominios=" + dominios +
                '}';
    }

}
