package javahttpserver;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Conf
{
    private int port;
    private String index;
    private String notfound;
    private String notsupported;

    public String getIndex() 
    {
        return index;
    }

    public String getNotfound()
    {
        return notfound;
    }

    public String getNotsupported() 
    {
        return notsupported;
    }

    public int getPort()
    {
        return port;
    }

    public void setIndex(String index)
    {
        this.index = index;
    }

    public void setNotfound(String notfound)
    {
        this.notfound = notfound;
    }

    public void setNotsupported(String notsupported)
    {
        this.notsupported = notsupported;
    }

    public void setPort(int port)
    {
        this.port = port;
    }

    @Override
    public String toString()
    {
        return "Conf{" + "port=" + port + ", index=" + index + ", notfound=" + notfound + ", notsupported=" + notsupported + '}';
    }
}