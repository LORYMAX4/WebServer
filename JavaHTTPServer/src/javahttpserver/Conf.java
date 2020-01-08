package javahttpserver;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conf 
{
    private String config;

    public String getConfig() 
    {
        return config;
    }

    public void setConfig(String config) 
    {
        this.config = config;
    }

    @Override
    public String toString() 
    {
        return "Conf{" + "config=" + config + '}';
    }
}