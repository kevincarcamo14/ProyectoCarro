package accesoadatos;

import java.sql.ResultSet;

public class carros {
    
    //instanciar un objeto de tipo Conexion
    Conexion cn = new Conexion();

    public void insertar(String codigo, String apellido1, String apellido2, String nombre, String fechaNacimiento, String sexo, String celular) {
        cn.UID("INSERT INTO clientes(codigo,apellido1,apellido2,nombre,fechaNacimiento,sexo,celular) VALUES('" + codigo + "','" + apellido1 + "','" + apellido2 + "','" + nombre + "','" + fechaNacimiento + "','" + sexo + "','" + celular + "')");
    }
   
    public void modificar(String codigo, String apellido1, String apellido2, String nombre, String fechaNacimiento, String sexo, String celular) {
        cn.UID("UPDATE clientes SET apellido1='" + apellido1 + "',apellido2='" + apellido2 + "',nombre='" + nombre + "',fechaNacimiento='" + fechaNacimiento + "',sexo='" + sexo + "',celular='" + celular + "' WHERE codigo='" + codigo + "'");
    }

    public void eliminar(String codigo) {
        cn.UID("DELETE FROM clientes WHERE codigo='" + codigo + "'");
    }

    public ResultSet buscar(String codigo) {
        return (cn.getValores("SELECT * FROM clientes WHERE codigo='" + codigo + "'"));
    }

    public ResultSet contarRegistros() {
        return (cn.getValores("SELECT COUNT(codigo) FROM clientes"));
    }

    public ResultSet mayorRegistro() {
        return (cn.getValores("SELECT MAX(codigo) FROM clientes"));
    }

    public ResultSet llenarTabla() {
        return (cn.getValores("SELECT codigo,apellido1,nombre,celular FROM clientes"));
    }
}
