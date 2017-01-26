package wsholamundo;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;
@WebService
public interface HolaMundo {
    @WebMethod
    public String getHolaMundo(@WebParam(name = "nombre") String s);
}
