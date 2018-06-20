package accesoadatos;

import conexion.conexion;
import java.sql.ResultSet;

public class carros {
    
    //instanciar un objeto de tipo conexion
    conexion cn = new conexion();

    public void insertar(String codigo, String marca, String color, String modelo, String fecha, String tipo, String kilometraje) {
        cn.UID("INSERT INTO clientes(codigo,marca,color,modelo,fecha,tipo,kilometraje) VALUES('" + codigo + "','" + marca + "','" + color + "','" + modelo + "','" + fecha + "','" + tipo + "','" + kilometraje + "')");
    }
   
    public void modificar(String codigo, String marca, String color, String modelo, String fecha, String tipo, String kilometraje) {
        cn.UID("UPDATE clientes SET apellido1='" + marca + "',color'" + color + "',modelo='" + modelo + "',fecha='" + fecha + "',tipo='" + tipo + "',kilometraje='" + kilometraje + "' WHERE codigo='" + codigo + "'");
    }

    public void eliminar(String codigo) {
        cn.UID("DELETE FROM clientes WHERE codigo='" + codigo + "'");
    }

    public ResultSet buscar(String codigo) {
        return (cn.getValores("SELECT * FROM clientes WHERE codigo='" + codigo + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(codigo) FROM carros"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(codigo) FROM carros"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codigo,marca,modelo,kilometraje FROM clientes"));
    }
}
