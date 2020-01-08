package javahttpserver;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conf
{
    private String port;

    public String getPort()
    {
        return port;
    }

    public void setPort(String port)
    {
        this.port = port;
    }

    @Override
    public String toString() 
    {
        return "Conf{" + "port=" + port + '}';
    }
}
