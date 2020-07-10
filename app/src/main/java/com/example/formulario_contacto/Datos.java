package com.example.formulario_contacto;

class Datos {
    private String nombre;
    private String fecha;
    private String Telefono;
    private String Email;
    private String Des_Contacto;

    public Datos(String nombre, String telefono, String email, String  Des_Contacto ) {
        this.nombre = nombre;
        this.Telefono = telefono;
        this.Email = email;
        this.Des_Contacto = Des_Contacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDes_Contacto() {
        return Des_Contacto;
    }

    public void setDes_Contacto(String des_Contacto) {
        Des_Contacto = des_Contacto;
    }
}
