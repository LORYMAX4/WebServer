package javahttpserver;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Cliente
{
    private String cognome;
    private String citta;
    private int id;

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public void setCitta(String citta)
    {
        this.citta = citta;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getCognome() 
    {
        return cognome;
    }

    public String getCitta() 
    {
        return citta;
    }

    public int getId() 
    {
        return id;
    }

    @Override
    public String toString() 
    {
        return "Cliente{" + "cognome=" + cognome + ", citta=" + citta + ", id=" + id + '}';
    }  
}