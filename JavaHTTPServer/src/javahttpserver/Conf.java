package javahttpserver;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conf
{
    private int port;

    public int getPort()
    {
        return port;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    @Override
    public String toString() 
    {
        return "Conf{" + "port=" + port + '}';
    }
}
