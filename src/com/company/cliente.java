package com.company;

public class cliente {
    String usuario,contrasena;
    int ingreso=0;
    float monto, monto_inicial,monto_final;
    contrasena psw =new contrasena();

    public float getMonto_final() {
        return monto_final;
    }

    public void setMonto_final(float monto_final) {
        this.monto_final = monto_final;
    }

    public int getIngreso() {
        return ingreso;
    }

    public void setIngreso(int ingreso) {
        this.ingreso = ingreso;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getMonto_inicial() {
        return monto_inicial;
    }

    public void setMonto_inicial(float monto_inicial) {
        this.monto_inicial = monto_inicial;
        this.monto =monto_inicial;
        this.monto_final =monto_inicial;
    }

    private String getUsuario() {
        return usuario;
    }

    private void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    private String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void Nombre_U (String nombre) {

        int valorDado = (int) Math.floor(Math.random()*15+0);
        String num_uString = String.valueOf(valorDado);
        String usuario = (nombre + "_" + num_uString);
        setUsuario(usuario);
        setContrasena(psw.getPassword(6));

    }
    public void ingresos () {
        ingreso = ingreso + 1;
    }
}
