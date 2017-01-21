package wsholamundo;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HolaMundo {
    @WebMethod
    public String getHolaMundo(String s);
}
