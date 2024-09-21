package modelo.dto;

/**
 *
 * @author salar
 */
public class ClientePersona extends Cliente{
   

    private ClientePersona(int id, String direccion, String telefono, String email) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public String getTipoCliente() {
        return "Persona";
    }

}
