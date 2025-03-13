
package Model;
import java.util.Date;

public class Log {
    private int idLog;
    private String tablaAfectada;
    private String tipoAccion;
    private String descripcion;
    private Date fechaHora;
    private int idUsuario;

    public Log() {
    }

    public Log(int idLog, String tablaAfectada, String tipoAccion, String descripcion,
               Date fechaHora, int idUsuario) {
        this.idLog = idLog;
        this.tablaAfectada = tablaAfectada;
        this.tipoAccion = tipoAccion;
        this.descripcion = descripcion;
        this.fechaHora = fechaHora;
        this.idUsuario = idUsuario;
    }

    public int getIdLog() {
        return idLog;
    }

    public void setIdLog(int idLog) {
        this.idLog = idLog;
    }

    public String getTablaAfectada() {
        return tablaAfectada;
    }

    public void setTablaAfectada(String tablaAfectada) {
        this.tablaAfectada = tablaAfectada;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
}